# Multi-stage build: First stage for building the JAR
FROM eclipse-temurin:17-jdk AS builder

# Set working directory
WORKDIR /app

# Copy pom.xml first for better caching
COPY pom.xml .

# Install Maven
RUN apt-get update && apt-get install -y maven && rm -rf /var/lib/apt/lists/*

# Download dependencies (this step is cached if pom.xml doesn't change)
RUN mvn dependency:go-offline -B

# Copy source code
COPY src src

# Build the application
RUN mvn clean package -DskipTests

# Second stage: Runtime image
FROM eclipse-temurin:17-jre

# Set working directory
WORKDIR /app

# Copy the JAR from builder stage
COPY --from=builder /app/target/graphqlexmaple-1.0.0.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
package com.example;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class PropertyController {
    
    private final List<Property> properties = new ArrayList<>();
    private final AtomicInteger idGenerator = new AtomicInteger(1);
    
    public PropertyController() {
        properties.add(new Property(1, "https://example.com/image1.jpg", "Beautiful Apartment", 
            "Apartment", "New York", "Modern 2BR apartment with city view", "John Doe", 150, 5));
        properties.add(new Property(2, "https://example.com/image2.jpg", "Cozy House", 
            "House", "Los Angeles", "Charming 3BR house with garden", "Jane Smith", 200, 4));
        idGenerator.set(3);
    }

    @QueryMapping
    public List<Property> properties() {
        return properties;
    }

    @QueryMapping
    public Property property(@Argument int id) {
        return properties.stream()
            .filter(property -> property.getId() == id)
            .findFirst()
            .orElse(null);
    }

    @MutationMapping
    public Property addProperty(@Argument PropertyInput input) {
        Property property = new Property(
            idGenerator.getAndIncrement(),
            input.getImage(),
            input.getTitle(),
            input.getType(),
            input.getLocation(),
            input.getDetails(),
            input.getHost(),
            input.getPrice(),
            input.getRating()
        );
        properties.add(property);
        return property;
    }
}
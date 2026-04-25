package com.moviles.examenmoviles.data.mock

import com.moviles.examenmoviles.model.CoworkingSpace

object CoworkingSpaceMock {
    val spaces = listOf(
        CoworkingSpace(
            id = 1,
            name = "The Hub",
            description = "A vibrant open coworking space in the heart of San José, ideal for freelancers and small teams. Features high-speed internet, coffee station, and 24/7 access.",
            location = "San José Centro",
            capacity = 30,
            pricePerHour = 8.50,
            isAvailable = true,
            imageColor = 0xFF4A90E2
        ),
        CoworkingSpace(
            id = 2,
            name = "Workspace One",
            description = "Professional environment with private meeting rooms and standing desks. Perfect for focused work sessions and client meetings.",
            location = "Escazú",
            capacity = 20,
            pricePerHour = 12.00,
            isAvailable = true,
            imageColor = 0xFF7ED321
        ),
        CoworkingSpace(
            id = 3,
            name = "Creative Lab",
            description = "Designed for creative professionals. Open floor plan with whiteboards, art supplies, and collaborative zones for dynamic teamwork.",
            location = "Barrio Dent, San José",
            capacity = 15,
            pricePerHour = 6.00,
            isAvailable = false,
            imageColor = 0xFFE91E63
        ),
        CoworkingSpace(
            id = 4,
            name = "Tech District",
            description = "Tech-focused coworking space with fiber internet, multiple monitors available, and a dedicated server room for startups.",
            location = "Sabana Norte, San José",
            capacity = 50,
            pricePerHour = 15.00,
            isAvailable = true,
            imageColor = 0xFF9C27B0
        ),
        CoworkingSpace(
            id = 5,
            name = "Green Office",
            description = "Eco-friendly workspace with natural lighting, plants, and sustainable materials. A quiet and relaxing atmosphere for focused work.",
            location = "Curridabat",
            capacity = 12,
            pricePerHour = 5.50,
            isAvailable = true,
            imageColor = 0xFF4CAF50
        ),
        CoworkingSpace(
            id = 6,
            name = "Innovation Hub",
            description = "Startup-oriented space with mentorship programs, investor meetups, and access to dedicated resources for early-stage companies.",
            location = "Santa Ana",
            capacity = 40,
            pricePerHour = 10.00,
            isAvailable = false,
            imageColor = 0xFFFF9800
        ),
        CoworkingSpace(
            id = 7,
            name = "Zen Space",
            description = "Minimalist and calm environment designed for deep focus work. No-noise policy, meditation room, and ergonomic furniture throughout.",
            location = "Los Yoses, San José",
            capacity = 10,
            pricePerHour = 7.00,
            isAvailable = true,
            imageColor = 0xFF607D8B
        ),
        CoworkingSpace(
            id = 8,
            name = "Rooftop Works",
            description = "Unique rooftop coworking with panoramic city views. Outdoor terrace, indoor workspace, and a dedicated event area for up to 25 people.",
            location = "Pinares, Curridabat",
            capacity = 25,
            pricePerHour = 18.00,
            isAvailable = true,
            imageColor = 0xFFFF5722
        )
    )
}

# Low-Level Design (LLD) Basics

## What is LLD?

Designing classes, relationships, and interactions between objects.

## Key Principles:

- Single Responsibility Principle
- Open/Closed Principle
- Liskov Substitution Principle
- Interface Segregation
- Dependency Inversion

## Example: Parking Lot System

Entities:

- Vehicle
- ParkingSlot
- Ticket
- Payment

Relationships:

- Vehicle has-a Ticket
- ParkingLot manages ParkingSlots

Focus:

- Clear responsibilities
- Extensible design

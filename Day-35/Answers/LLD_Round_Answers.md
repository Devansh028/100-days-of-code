# Low Level Design – Model Answers

--------------------------------|
Design a Parking Lot System |
--------------------------------|

Entities:

- Vehicle
- ParkingSlot
- Ticket
- ParkingLot
- PaymentService

Responsibilities:

- Vehicle: holds vehicle details
- ParkingSlot: manages availability
- Ticket: entry time & slot info
- ParkingLot: allocates slots
- PaymentService: calculates charges

Flow:

1. Vehicle enters
2. Slot assigned
3. Ticket generated
4. Vehicle exits
5. Payment processed

Design Principles Used:

- Single Responsibility Principle
- Open/Closed Principle
- Abstraction via interfaces

Scalability:

- Multiple floors
- Different pricing strategies
- Slot types (Bike, Car, Truck)

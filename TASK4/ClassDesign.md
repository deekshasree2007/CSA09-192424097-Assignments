# TASK 4 – Object-Oriented Class Design

## 1. Proposed Classes

The Campus Smart-Parking System can be designed using the following classes.

| Class | Responsibility |
|---|---|
| ParkingFacility | Manages the complete parking facility. |
| ParkingFloor | Represents an individual parking floor. |
| ParkingSlot | Stores slot information and availability. |
| Vehicle | Base class containing common vehicle details. |
| TwoWheeler | Represents two-wheeler vehicles. |
| Car | Represents cars. |
| ElectricCar | Represents electric cars and charging details. |
| ParkingTicket | Stores ticket number, entry time and exit time. |
| ParkingPass | Stores monthly pass details and validity. |
| ParkingService | Handles vehicle entry, exit and fee calculation. |

## 2. Class Attributes and Methods

### ParkingFacility
Attributes:
- floors
- totalSlots

Methods:
- allocateSlot()
- releaseSlot()
- checkAvailability()

### ParkingFloor
Attributes:
- floorNumber
- slots

Methods:
- addSlot()
- getAvailableSlots()

### ParkingSlot
Attributes:
- slotNumber
- isAvailable
- vehicle

Methods:
- occupySlot()
- releaseSlot()

### Vehicle
Attributes:
- registrationNumber
- vehicleType

Methods:
- calculateParkingFee()
- displayVehicleDetails()

### ParkingTicket
Attributes:
- ticketNumber
- entryTime
- exitTime

Methods:
- generateTicket()
- calculateDuration()

### ParkingPass
Attributes:
- passNumber
- validFrom
- validUntil

Methods:
- checkValidity()

## 3. Relationships Between Classes

1. ParkingFacility contains multiple ParkingFloor objects.
2. Each ParkingFloor contains multiple ParkingSlot objects.
3. A ParkingSlot can hold one Vehicle at a time.
4. ParkingTicket is associated with a Vehicle.
5. TwoWheeler, Car and ElectricCar inherit common properties from Vehicle.
6. ParkingService uses ParkingFacility, Vehicle and ParkingTicket to manage parking operations.

## 4. Object-Oriented Principles

- Encapsulation: Attributes are kept private and accessed through methods.
- Inheritance: TwoWheeler, Car and ElectricCar inherit from Vehicle.
- Polymorphism: Different vehicle types can implement their own parking fee calculations.
- Abstraction: The Vehicle class can be abstract and define common methods.

## 5. Conclusion

The proposed class design separates responsibilities into individual classes. It supports code reusability, maintainability and future expansion of the Campus Smart-Parking System.
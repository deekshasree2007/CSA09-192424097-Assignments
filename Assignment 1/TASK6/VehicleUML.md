# TASK 6 – UML Class Diagram

## 1. Meaning of UML

UML stands for Unified Modeling Language. It is used to visually represent the structure and relationships of a software system.

A class diagram shows:
- Class names
- Attributes
- Methods
- Relationships between classes

## 2. UML Class Diagram for Campus Smart-Parking System

```text
                 ParkingFacility
                 ----------------
                 - floors
                 - totalSlots
                 ----------------
                 + allocateSlot()
                 + releaseSlot()
                        |
                        | contains
                        v
                   ParkingFloor
                   ------------
                   - floorNumber
                   - slots
                   ------------
                   + getAvailableSlots()
                        |
                        | contains
                        v
                    ParkingSlot
                    -----------
                    - slotNumber
                    - isAvailable
                    -----------
                    + occupySlot()
                    + releaseSlot()


                      Vehicle
                  <<abstract>>
                  ------------
                  - regNo
                  ------------
                  + calculateFee()
                       /   \
                      /     \
             TwoWheeler     Car
                              |
                              |
                         ElectricCar
                         implements
                         Chargeable


                 ParkingTicket
                 -------------
                 - ticketNumber
                 - entryTime
                 - exitTime
                 -------------
                 + calculateDuration()
                 + generateTicket()


                 ParkingService
                 --------------
                 + vehicleEntry()
                 + vehicleExit()
                 + calculateFee()
```

## 3. Relationships

1. Inheritance: TwoWheeler and Car inherit from Vehicle.
2. Inheritance: ElectricCar inherits from Car.
3. Interface implementation: ElectricCar implements Chargeable.
4. Composition/containment: ParkingFacility contains ParkingFloor objects, and each floor contains ParkingSlot objects.
5. Association: ParkingTicket is associated with a Vehicle.
6. Dependency: ParkingService uses the facility, vehicle and ticket classes to perform parking operations.

## 4. Advantages of UML

- Provides a clear visual representation of the system.
- Helps understand class relationships.
- Makes software design easier.
- Helps developers communicate and plan before coding.
- Makes future modifications easier.

## Conclusion

The UML class diagram represents the main classes and their relationships in the Campus Smart-Parking System. It provides a clear blueprint for implementing the application using object-oriented programming.
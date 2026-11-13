# TASK 1 – Understand the Problem and Identify the Objects

## 1. Inputs and Outputs

**Inputs:**
1. Vehicle registration number.
2. Vehicle type (Two-wheeler, Car or Electric Vehicle).
3. User category (Student, Staff or Visitor).
4. Entry and exit date and time.
5. Parking slot availability.
6. Monthly pass details.
7. Electricity consumption in kWh for electric vehicles.

**Outputs:**
1. Allocated floor and slot number.
2. Unique parking ticket number.
3. Vehicle entry and exit time.
4. Total parking duration.
5. Parking fee.
6. EV charging fee.
7. Updated parking slot availability.

## 2. Candidate Classes and Their Responsibilities

| Class | Responsibility |
|---|---|
| ParkingFacility | Manages the complete parking facility and allocates or releases slots. |
| ParkingFloor | Represents an individual floor and manages its slots. |
| ParkingSlot | Stores slot number and vehicle occupancy status. |
| Vehicle | Represents a vehicle and stores its registration number and type. |
| TwoWheeler | Represents a two-wheeler vehicle. |
| Car | Represents a car. |
| ElectricVehicle | Represents an electric vehicle and charging details. |
| ParkingTicket | Stores ticket number, vehicle details, entry time and exit time. |
| ParkingPass | Represents monthly parking passes for students and staff. |
| ParkingService | Coordinates vehicle entry, exit, allocation and fee calculation. |

## 3. Nouns and Verbs

**Nouns that become classes:** Vehicle, ParkingFacility, ParkingFloor, ParkingSlot, ParkingTicket, ParkingPass and ParkingService.

**Verbs that become methods:** allocate(), release(), calculateFee(), issueTicket(), recordEntry(), recordExit() and checkAvailability().

## 4. Business Rules

1. A parking slot cannot hold more than one vehicle.
2. Every parking ticket must have a unique ticket number.
3. A vehicle must be allocated only to an available and suitable slot.
4. A released slot must become available for another vehicle.
5. Students and staff with valid monthly passes can park free of charge.
6. Visitors must pay the applicable parking fee.
7. Electric vehicle charging fees must be calculated separately.
8. Invalid vehicle registration numbers and invalid parking operations must be rejected.

## 5. Assumptions

1. Each parking floor has a fixed number of slots.
2. Each vehicle has a unique registration number.
3. Parking fees are calculated according to vehicle type and parking duration.
4. Parking duration is calculated using entry and exit times.
5. A valid monthly pass is required for free parking.
6. Electric vehicles use designated charging slots.
7. Parking fees and charging rates are configurable.

## 6. Alternative Concept – Using Parallel Arrays

Instead of creating separate Vehicle objects, vehicle details can be stored in parallel arrays.

Example:

```java
String[] regNo = new String[100];
String[] type = new String[100];
String[] entryTime = new String[100];
```

Each index represents one vehicle. For example, regNo[0], type[0] and entryTime[0] represent the details of the first vehicle.

**Comparison:**

| Criteria | Vehicle Objects | Parallel Arrays |
|---|---|---|
| Data storage | Each vehicle is an object | Details are stored in separate arrays |
| Finding a vehicle | O(n) linear search | O(n) linear search |
| Adding a new attribute | Add a field to Vehicle | Add another parallel array |
| Data organization | Easy to maintain | More difficult to maintain |
| Extensibility | Better | Less flexible |

**Time Complexity:** Finding a vehicle by registration number takes O(n) time in both approaches using linear search.

**Space Complexity:** Both approaches require O(n) space for n vehicles. Objects have some additional object overhead, while parallel arrays require separate arrays for each attribute.

**Conclusion:** Using Vehicle objects is better because it supports encapsulation, inheritance and polymorphism. It is easier to maintain and extend when new vehicle categories or attributes are introduced.
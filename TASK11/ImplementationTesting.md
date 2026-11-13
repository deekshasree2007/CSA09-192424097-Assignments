# TASK 11 – Implement, Test and Defend the Design

## 1. Implementation Plan

The Smart Parking System is implemented using Object-Oriented Programming concepts.

The main classes are:

- **Vehicle:** Stores common vehicle details.
- **TwoWheeler:** Represents two-wheeler vehicles.
- **Car:** Represents cars.
- **ElectricCar:** Represents electric cars and charging functionality.
- **ParkingSlot:** Stores the details and occupancy status of a parking slot.
- **ParkingFacility:** Manages parking floors and slot allocation.
- **ParkingTicket:** Stores ticket number, entry time, exit time and parking fee.
- **ParkingService:** Handles vehicle entry, exit and parking operations.
- **PricingRule:** Defines the parking fee calculation rules.

## 2. Testing the System

The following test cases are used to verify the system.

| Test Case | Input / Condition | Expected Result |
|---|---|---|
| 1 | Two-wheeler parked for 60 minutes | Rs. 10 |
| 2 | Car parked for 130 minutes | Rs. 90 |
| 3 | Electric car parked for 130 minutes and uses 10 kWh | Rs. 210 |
| 4 | Allocate a vehicle when a slot is available | Slot allocated successfully |
| 5 | Allocate a vehicle when all slots are occupied | Allocation fails |
| 6 | Release an occupied slot | Slot becomes available |
| 7 | Release an already empty slot | Operation fails |
| 8 | Negative parking duration | Invalid input rejected |

## 3. Fee Calculation

The parking charges are calculated using the following rates:

- Two-wheeler: Rs. 10 per hour.
- Car: Rs. 30 per hour.
- Electric charging: Rs. 12 per kWh.

The started hour is charged as a full hour.

**Example 1: Two-wheeler**

Parking duration = 60 minutes

Fee = 1 × 10 = Rs. 10

**Example 2: Car**

Parking duration = 130 minutes

Charged hours = 3

Fee = 3 × 30 = Rs. 90

**Example 3: Electric Car**

Parking duration = 130 minutes

Parking fee = 3 × 30 = Rs. 90

Charging fee = 10 × 12 = Rs. 120

Total fee = 90 + 120 = Rs. 210

## 4. Design Evaluation

The design uses the following OOP concepts:

- **Encapsulation:** Protects vehicle and ticket information using private fields.
- **Inheritance:** Allows TwoWheeler, Car and ElectricCar to reuse common vehicle properties.
- **Polymorphism:** Allows different vehicle types to calculate their own parking charges.
- **Abstraction:** Defines common vehicle behaviour using an abstract class and charging functionality using an interface.

These concepts reduce code duplication and improve maintainability.

## 5. Alternative Data Structure

An array or ArrayList can be used to store active parking tickets. Searching for a particular vehicle may require O(n) time.

A HashMap can store tickets using the vehicle registration number as the key.

| Data Structure | Search Time | Space Complexity |
|---|---|---|
| Array | O(n) | O(n) |
| ArrayList | O(n) | O(n) |
| HashMap | O(1) average | O(n) |

A HashMap is preferred for faster average-case ticket lookup.

## 6. Limitations and Future Improvements

The current design can be extended with the following features:

- Database connectivity to store parking records permanently.
- User login and authentication.
- Online payment facilities.
- Real-time parking slot availability.
- Synchronisation to prevent two vehicles from receiving the same slot.
- Reports showing daily and monthly parking revenue.

## 7. Conclusion

The Smart Parking System demonstrates the use of Object-Oriented Programming concepts in a real-world application. Testing verifies parking allocation, slot release and fee calculation. The design is modular, reusable and suitable for future expansion.
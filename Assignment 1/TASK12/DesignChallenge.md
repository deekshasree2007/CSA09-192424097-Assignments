# TASK 12 – Day-4 Design Challenge: Re-evaluate and Adapt the Design

## 1. Introduction

The Smart Parking System must support new requirements without changing the entire existing design. The system should be flexible, reusable and easy to extend.

The new requirements include:

- E-bikes with a flat parking fee.
- Delivery vans charged at double the car rate between 9 AM and 5 PM.
- One-day parking passes for visitors.
- Expansion to five floors with unequal numbers of parking slots.

## 2. Changes Required in the Existing Design

### A. E-Bike Support

A new `EBike` class can be introduced as a subclass of `Vehicle`.

It uses a flat parking fee instead of an hourly fee.

Example:

```java
class EBike extends Vehicle {
    EBike(String regNo) {
        super(regNo);
    }

    @Override
    protected double ratePerHour() {
        return 0;
    }

    public double flatFee() {
        return 20;
    }
}
```

The flat fee of Rs. 20 is an illustrative assumption because the exact amount is not specified.

### B. Delivery Van Support

A new `DeliveryVan` class can be introduced.

It is charged at twice the car rate between 9 AM and 5 PM.

Outside this time period, the normal car rate is applied.

Example:

```java
class DeliveryVan extends Car {
    public double rateAt(int hour) {
        if (hour >= 9 && hour < 17) {
            return 60;
        }
        return 30;
    }
}
```

Here, the car rate is assumed to be Rs. 30 per hour. The time check uses a 24-hour clock and the 5 PM boundary is exclusive.

### C. One-Day Visitor Pass

A new `OneDayPass` class can be introduced to store:

- Pass number.
- Visitor details.
- Valid date.
- Expiry date.

The system checks whether the pass is valid before calculating the parking fee. An expired or invalid pass must not be accepted.

### D. Expansion to Five Floors

The parking facility must support five floors with unequal numbers of slots.

A jagged array is suitable because each floor can have a different number of slots.

Example:

```java
String[][] slots = new String[5][];

slots[0] = new String[20];
slots[1] = new String[30];
slots[2] = new String[25];
slots[3] = new String[40];
slots[4] = new String[50];
```

This allows each floor to have a different capacity.

## 3. Impact on the Existing Class Design

| Existing Class | Required Change |
|---|---|
| Vehicle | Continue providing common vehicle details |
| Car | Provide the normal car parking rate |
| EBike | Add flat-fee behaviour |
| DeliveryVan | Add time-based pricing |
| ParkingTicket | Store pass and parking details where required |
| ParkingFacility | Support five floors with unequal slot counts |
| ParkingService | Validate passes and manage new vehicle types |

## 4. Inheritance and Composition

Inheritance allows new vehicle classes to reuse common properties and methods from the `Vehicle` class.

However, if pricing rules change frequently, using inheritance alone can make the design complicated.

An alternative is composition, where a vehicle or parking service uses a separate `PricingRule` object to calculate the fee.

For example, different pricing rules can be created for:

- Hourly parking.
- Flat-fee parking.
- Time-based delivery van parking.
- Electric vehicle charging.

This makes pricing easier to modify without changing the entire vehicle hierarchy.

## 5. Testing the New Requirements

| Test Case | Expected Result |
|---|---|
| E-bike enters the parking facility | Flat fee is applied |
| Delivery van enters at 10 AM | Double car rate is applied |
| Delivery van enters at 6 PM | Normal car rate is applied |
| Visitor has a valid one-day pass | Pass is accepted |
| Visitor has an expired pass | Pass is rejected |
| Vehicle enters a floor with available slots | Slot is allocated |
| All slots are occupied | Allocation fails |
| Parking facility has five unequal floors | Each floor supports its configured capacity |

## 6. Advantages of the Adapted Design

- Supports new vehicle categories.
- Allows different pricing methods.
- Supports time-based parking charges.
- Provides visitor pass validation.
- Handles unequal floor capacities.
- Reduces code duplication.
- Makes future modifications easier.

## 7. Conclusion

The Smart Parking System can be adapted to meet new requirements using inheritance, abstraction, interfaces and composition. A jagged array supports unequal parking capacities across five floors. Separating pricing rules from vehicle details improves flexibility and makes the system easier to maintain and expand.
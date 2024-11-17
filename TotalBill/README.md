# TotalBill

## Abstract
**TotalBill** is a Java program that calculates the total amount for a set of items, based on the number of units, price per unit, and discount rate for each item. The program reads the input from the user, validates it, applies the discounts if applicable, and calculates the total bill.

## Requirements
- **Java 8 or higher**

## Run Instructions

1. **Provide Input**:
    - Enter the number of items, `x`, as the first input.
    - For each item, enter the following:
        - `numberOfUnits`: The quantity of the item.
        - `pricePerUnits`: The price per unit of the item.
        - `discount`: The discount for the item (a value between 0 and 1).

    Example input for 2 items:
    ```
    2
    5 100.0 0.1
    3 50.0 0
    ```

2. **Output**:
    - The program will print the total amount after applying the discounts.
    - 530.0

- **Main Method**: 
  - Reads the input from the user.
  - Loops through the number of items and collects information for each item.
  - Validates the input and calculates the total bill, including discounts.

- **Input Validation**: 
  - Ensures that the number of units, price per unit, and discount are valid (non-negative, and discount is between 0 and 1).
  - If any invalid input is detected, the program prints `"invalid input"` and exits early.
 
    ---

Happy Coding!

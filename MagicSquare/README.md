# MagicSquare

## Abstract
**MagicSquare** is a Java program that checks whether a given square matrix is a **magic square**. A magic square is a grid where the sums of numbers in each row, each column, and both main diagonals are all equal. The program reads the matrix size and values from user input, then determines if the matrix satisfies the properties of a magic square.

## Requirements
- **Java 8 or higher**
## Run
1. **Provide Input**:
    - Enter the size of the matrix, `n`, as the first input (must be greater than 1).
    - Enter the elements of the `n x n` matrix, separated by spaces or new lines.

    Example input for a `3 x 3` magic square:
    ```
    3
    2 7 6
    9 5 1
    4 3 8
    ```

2. **Output**:
    - The program will print `"magic square"` if the matrix is a magic square.
    - Otherwise, it will print `"not magic square"`.

## Example

### Input
    
    3
    1 1 1
    1 1 1
    1 1 1
    

نسخ الكود


## Code Structure

- **Matrix Initialization**: The matrix is initialized and populated based on user input.
- **Sums Calculation**: The program calculates the sum of each row, each column, and both diagonals.
- **Magic Square Check**: 
  - The `test` variable holds the expected sum.
  - Each row sum, column sum, and diagonal sum are compared to `test`.
  - If all are equal, the matrix is a magic square; otherwise, it’s not.

## Edge Cases
- **Invalid Matrix Size**: If the matrix size is less than 2, the program outputs `"invalid size"` and exits.
- **Non-Magic Square Input**: If any row, column, or diagonal does not match the expected sum, it will output `"not magic square"`.


Happy Coding!

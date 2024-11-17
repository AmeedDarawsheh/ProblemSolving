# Password Strength Checker

## Abstract
**Password Strength Checker** is a Java program that evaluates the strength of a user-provided password. The program classifies the password as **Strong**, **Moderate**, **Weak**, or **Invalid** based on its length, the inclusion of uppercase and lowercase letters, digits, and special characters.

## Requirements
- **Java 8 or higher**

## Run Instructions

1. **Provide Input**:
    - Enter a password when prompted. The program will evaluate the strength of the password.

    Example input:
    ```
    Abc123!
    ```

2. **Output**:
    - The program will classify the password as:
        - **"Strong"** if the password meets specific criteria (length > 12 and contains at least one uppercase letter, one lowercase letter, one digit, and one special character).
        - **"Moderate"** if the password is between 9 and 12 characters long, contains at least one uppercase letter, one lowercase letter, and one digit.
        - **"Weak"** if the password is between 6 and 8 characters long, and it contains a combination of uppercase, lowercase, digits, and special characters.
        - **"Invalid"** if the password length is less than 6 or if no valid characters are found.

 
    ---

Happy Coding!

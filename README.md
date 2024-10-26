# PrimeNumberCheck
This project contains a simplified and optimized implementation of a prime number checker in Java. The code allows users to input a number and determine whether it is prime, while improving upon a standard approach for efficiency, readability, and maintainability.

### Features
Optimized Prime Check Logic: The program checks whether a number is prime by iterating from 2 to the input number and breaks early if a divisor is found. This approach improves simplicity compared to the original square root approach.

User-Friendly Input Loop: The program continuously prompts the user to input numbers for checking and only stops when the user enters 1 to end the session.

Clean and Readable Code: The rewritten code is more concise and understandable, making it easier for new programmers to follow and modify.

### Usage
1. Run the program.
2. Enter a number to check if it's prime.
3. The program will output whether the number is prime or not.
4. To exit, input the number 1.

Example:
![javacode](https://github.com/user-attachments/assets/0e201bd2-5a9b-457e-be6e-ebc9e0ca008e)


### Code Breakdown

**Prime checking algorithm**

The core of the program is the isPrime method:


Efficiency: The method iterates from 2 to the input number and immediately returns false if a divisor is found.
Clarity: The code has been simplified to eliminate unnecessary checks and reduce the overall complexity.

### How to run
1. Make sure you have Java installed on your machine.
2. Compile the program:
   javac IsPrime.java
3. Run the program:
   java IsPrime
![screenshot](https://github.com/user-attachments/assets/fe5d260f-2350-42a3-92c6-a0b7cb60191d)

### Contributing
If you'd like to contribute improvements or additional features, feel free to submit a pull request or open an issue.

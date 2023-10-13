# Sleep-sort

This project demonstrates a simple sorting mechanism using Java Threads. For each number in an unsorted array, a thread is created. Each thread sleeps for a duration in seconds equal to the value of the number it represents. Smaller numbers come out of sleep quicker, and are added to the sorted array sooner, effectively sorting the array.

## Getting Started

### Prerequisites

Ensure you have the Java Development Kit (JDK) installed on your machine.

### Running the Program

1. Clone or download the repository to your local machine.
2. Navigate to the project directory in your terminal.
3. Compile the Java files:
    ```bash
    javac Main.java Number.java
    ```
4. Run the Main class:
    ```bash
    java Main
    ```

## Overview

1. The `Main` class creates an unsorted array with random numbers.
2. A `Number` thread is created and started for each number in the unsorted array.
3. Each `Number` thread sleeps for a duration based on its number value.
4. After the sleep duration, each `Number` thread adds its number to a sorted array.
5. When the last number is added to the sorted array, the sorted array is printed to the console.
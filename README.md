# Grammar Production Processor

## Overview
This Java application processes grammar productions, to find the first set of given grammar, typically used in compiler design or formal language theory. The program takes a set of productions, each associating a non-terminal with its expression, and analyzes them to identify terminal and non-terminal symbols. It's designed to help understand the structure of grammars typically used in programming language syntax.

## Features
- **Production Parsing**: Parses a series of grammar productions, separating non-terminals from their expressions.
- **Grammar Analysis**: Identifies terminal and non-terminal symbols within each production.
- **Recursion Handling**: Uses recursion to navigate through nested grammar structures and derive terminals.

## Running the Program
To run the Grammar Production Processor, follow these steps:

1. **Compile the Java Program**:
   - Ensure Java is installed on your system.
   - Navigate to the directory containing `Main.java`.
   - Use the command `javac Main.java` to compile the program.

2. **Execute the Program**:
   - Run the program using `java Main`.
   - The output will display each non-terminal followed by its derived terminals or further non-terminals, demonstrating the structure of the grammar.

## Example Usage
- Given grammar productions like "E => Ta|b", "T => F", "F => id", and "K => (E)", the program will output the non-terminals (E, T, F, K) along with their corresponding expressions, identifying terminals and their first set.

## Contribution
Contributions to enhance and improve this program are encouraged. This may include supporting more complex grammar structures, improving the parsing logic, or enhancing the output format for better clarity.

## License
Free To Use.

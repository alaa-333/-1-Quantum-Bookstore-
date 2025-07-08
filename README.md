# Quantum Bookstore

A simple Java application simulating a bookstore with support for paper books, eBooks, and online books.

## Project Structure

- `Book.java`: Abstract base class for all book types (title, price, year, ISBN).
- `PaperBook.java`: Extends `Book`, adds stock management and shipping.
- `EBook.java`: Extends `Book`, adds file type and email delivery.
- `OnlineBook.java`: Extends `Book`, represents books available only online.
- `BookFactory.java`: Factory class to create different types of books based on input.
- `BookStore.java`: Implements `BookServices`, manages a list of books, allows adding, buying, and removing old books.
- `BookServices.java`: Interface defining bookstore operations (add, remove, buy).
- `Runner.java`: Main class to run and test the bookstore functionality.

## How to Run

1. Compile all `.java` files:
   ```
   javac *.java
   ```
2. Run the main class:
   ```
   java Runner
   ```

## Features
- Add different types of books to the store
- Buy books (handles stock for paper books, email for eBooks, restricts online books)
- Remove old books by year

## Example Usage
The `Runner` class demonstrates adding books, buying them, and removing old books.

---

# Mini Library Management System (Java)

This is a simple Object-Oriented mini project in Java to manage books and users in a library. The system allows you to add books and users, issue books to users, return books, and list all books and users.

## Features

- Add new books and users to the library
- Issue a book to a user
- Return a book to the library
- List all books with their status (available/issued)
- List all users

## Classes

- **Book**: Represents a book with ID, title, author, and issued status.
- **User**: Represents a user with ID and name.
- **Library**: Manages collections of books and users, and provides methods to issue/return books.
- **Main**: Demonstrates usage of the system.

## How to Run

1. **Clone or Download** this repository.
2. **Navigate** to the `src` directory.
3. **Compile** the Java files:
    ```
    javac Main.java Library.java Book.java User.java
    ```
4. **Run** the program:
    ```
    java Main
    ```

## Example Output

```
101: 2025 by George Orwell [Available]
102: To Kill a Mockingbird by Harper Lee [Available]
Book '2025' issued to Alice.
101: 2025 by George Orwell [Issued to: Alice]
102: To Kill a Mockingbird by Harper Lee [Available]
Book '2025' returned by Alice.
101: 2025 by George Orwell [Available]
102: To Kill a Mockingbird by Harper Lee [Available]
```

## Requirements

- Java JDK 8 or above
# Java Library Management System

This is a simple console-based Library Management System written in Java using Object-Oriented Programming (OOP) principles. The system allows you to manage users and books, and provides features to add users/books, list them, and issue/return books.

## Features

- **Add User:** Add a new user with a unique ID and name.
- **Add Book:** Add a new book with a unique ID, title, and author.
- **List Users:** Display all registered users.
- **List Books:** Display all books with their status (available/issued).
- **Issue Book:** Issue a book to a user.
- **Return Book:** Return a previously issued book.

## How to Use

1. **Compile the code:**
    ```sh
    javac Main.java Library.java Book.java User.java
    ```

2. **Run the program:**
    ```sh
    java Main
    ```

3. **Follow the on-screen menu** to add users, add books, list users/books, issue or return books.

## Example Menu

```
Library Menu:
1. Add User
2. Add Book
3. List Users
4. List Books
5. Issue Book
6. Return Book
0. Exit
Enter your choice:
```

## Requirements

- Java JDK 8 or above

## Notes

- Each user and book must have a unique ID.
- The system is entirely in-memory and does not persist data after the program exits.

## License

### 📚 Library Management System (LMS) — Java Project

The **Library Management System (LMS)** is a simple Java console-based application designed to help users manage a small library efficiently. It allows adding, searching, issuing, returning, deleting, and editing books — all stored using arrays.

#### 🔹 Features:

* **Add a Book:** Add new books with a title and description.
* **Search a Book:** Search by title or ID and view availability.
* **Issue a Book:** Mark a book as issued (borrowed).
* **Return a Book:** Make an issued book available again.
* **Delete a Book:** Remove a book from the library list.
* **Edit Book Details:** Update a book’s title or description.
* **View All Books:** Display all books with their details and availability status.
* **Exit:** Safely exit the program.

#### 🔹 How It Works:

The system uses three main arrays:

* `bookTitles[]` → stores book titles
* `bookDescription[]` → stores book descriptions
* `bookStatue[]` → stores the availability status (`true` = available, `false` = issued)

The user interacts with a simple text-based menu to perform actions. Each book is identified by its **ID**, which corresponds to its position in the array (starting from 1).

#### 🔹 Technologies Used:

* Java (Core)
* Arrays
* Loops & Conditional Statements
* Switch-case structure
* Console-based I/O (Scanner)

#### 🔹 Purpose:

This project demonstrates fundamental **Java programming concepts** such as:

* Working with arrays
* Managing user input
* Handling data operations
* Implementing a menu-driven console application

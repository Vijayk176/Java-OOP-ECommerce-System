# Java OOP ECommerce System

A backend e-commerce simulation built in Java, demonstrating core Object-Oriented Programming concepts including **Encapsulation**, **Data Modeling**, and **Object Relationships**.

## 🚀 Features

* **Product Management**: Create and manage products with unique IDs, names, prices, and stock levels with automated stock reduction on orders.
* **Customer Profiles**: Store customer information including ID, name, and email with support for personal order history tracking.
* **Order Processing**: Link customers to products through orders, with automatic total amount calculation based on quantity and price.
* **Order History**: Each customer maintains a personal order history, viewable anytime through display methods.
* **Static Data Storage**: Uses static arrays for global product and customer lists, simulating a shared database across the system.

## 🛠️ Technical Structure

| Class | Responsibility |
|-------|---------------|
| `Product` | Models product details — ID, name, price, stock — and handles stock management |
| `Customer` | Stores customer data and maintains a personal order history array |
| `Order` | Links a customer to a product with quantity and auto-calculates total amount |
| `Main` | Entry point that demonstrates the full order placement flow |

## 💻 How to Run

1. Clone the repository.
2. Open the project in your preferred Java IDE (IntelliJ, Eclipse, or VS Code).
3. Run the `Main.java` file to see the system demonstration.

## 🧠 OOP Concepts Used

* **Encapsulation** — Fields and methods grouped within their relevant classes
* **Object Relationships** — `Order` references both `Customer` and `Product` objects
* **Static Members** — Shared lists simulate a global data store
* **Constructor Initialization** — All objects initialized via parameterized constructors
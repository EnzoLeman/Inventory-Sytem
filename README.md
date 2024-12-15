# Inventory Management System

## Overview

This Inventory Management System allows shop owners to manage their products, including adding new products, viewing available products, and updating product details. The system makes use of **Stacks** and **Queues** to handle recently added products and manage product actions.

## Features

- **Add Products**: Add new products with details such as name, price, and quantity.
- **View Products**: Display available products in the inventory.
- **Update Product**: Update product details.
- **Recently Added Products Stack**: Track the most recently added products using a stack.
- **Product Removal Queue**: Manage removed products using a queue.

---

## Getting Started

### Prerequisites

Before you can run this project, you need to have the following installed on your system:

1. **Java Development Kit (JDK)**: Java 8 or higher.
   - You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use [OpenJDK](https://openjdk.java.net/).

2. **Visual Studio Code** (VS Code) or any Java IDE:
   - Download VS Code from [VS Code Official Website](https://code.visualstudio.com/Download).

3. **Java Extensions for VS Code**:
   - Install the **Java Extension Pack** from the Extensions marketplace in VS Code. It includes:
     - Java Language Support by Red Hat
     - Java Debugger
     - Maven for Java (optional)
     - Java Test Runner

4. **Maven** (Optional) for managing external libraries.

---

## Folder Structure

- **`src`**: Contains the Java source code files (`Main.java`, `Shop.java`, `Product.java`).
- **`lib`**: Optional folder for dependencies if your project requires external libraries.
- **`bin`**: The folder where the compiled `.class` files will be placed by default when you run the Java code.

---

## How to Run the Project

1. **Clone or Download the Repository**: Clone or download this project to your local machine.

2. **Open the Project in Visual Studio Code**:
   - Launch Visual Studio Code.
   - Open the folder containing the project files by clicking on **File > Open Folder** and selecting the project directory.

3. **Run the Project**:
   - In VS Code, open the `Main.java` file (or any entry point class).
   - Press **F5** or choose **Run > Start Debugging** to compile and run the program.

4. **Using the Integrated Terminal**:
   - Alternatively, you can open the integrated terminal in VS Code and manually compile and run the project:
     ```bash
     javac Main.java Shop.java Product.java
     java Main
     ```

---

## How to Use the Inventory Management System

### Main Features:

1. **Add Product**:
   - When prompted, enter the product name, price, and quantity.
   - The product is then added to the inventory, and it's pushed onto a stack to track recently added products.

2. **View Available Products**:
   - View the list of products available in the inventory.

3. **Update Product**:
   - Update the details of a specific product by entering the new product name, price, and quantity.

4. **Exit**:
   - Exit the application when done.

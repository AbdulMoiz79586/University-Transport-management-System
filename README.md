# University-Transport-management-System
📌 Overview

This is a console-based Java application that simulates a simple Transport Management System. It allows users to store and manage records related to:

🚌 Buses
🛣️ Routes
👨‍✈️ Drivers
🎓 Students

The system uses arrays and methods to handle data and provides a menu-driven interface for user interaction.

⚙️ Features
1. 🚌 Bus Module
Store multiple bus records
Fields include:
Bus ID
Bus Number
Bus Type
Capacity
Last Maintenance Date
View all records or search by Bus ID
2. 🛣️ Route Module
Store route details:
Route ID
Start Point
End Point
Number of Stops
Distance (km)
View all routes or search by Route ID
3. 👨‍✈️ Driver Module
Store driver information:
Name
ID
License Number
Contact
Salary
Automatically calculates salary after tax
Tax rule:
If salary > 50,000 → 5% tax applied
4. 🎓 Student Module
Store student details:
Name, ID, Age, Gender
Location, Contact
Distance from institution
Automatically calculates:
Fare (based on distance)
Discount (if advance fee paid)
Fare rules:
≤ 30 km → 100 per km

30 km → 140 per km

Discount:
Rs. 500 off if advance fee is paid
🧮 Helper Functions
fare(distance) → Calculates transport fee
discount(fare) → Applies discount
tax(salary) → Calculates salary after tax
▶️ How to Run
Open the project in any Java IDE (e.g., NetBeans, IntelliJ, Eclipse)
Compile the program
Run the Arraymethod class
Follow on-screen instructions:
Press Y to open menu
Choose module (1–4)
Enter data as prompted
🖥️ Example Menu
1 → Bus Module  
2 → Route Module  
3 → Driver Module  
4 → Student Module  
📚 Concepts Used
Arrays
Methods (Functions)
Loops (for, while)
Conditional Statements (if-else, switch)
User Input (Scanner class)
Basic Calculations
⚠️ Limitations
Data is not stored permanently (no database/file handling)
Uses arrays instead of OOP classes for each entity
No validation for incorrect inputs
🚀 Future Improvements
Convert to Object-Oriented Design (OOP)
Add file/database storage
Implement GUI (JavaFX/Swing)
Add input validation
👨‍💻 Author

Moiz_Noob



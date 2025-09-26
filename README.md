# 🏪 Inventory Management System

A **Java Swing + MySQL** desktop application to manage products, sales, suppliers, employees, and invoices. Built in **NetBeans IDE** with JDBC for database connectivity.

---

## 📋 Features
- Manage Products (add, update, delete, view)
- Customer & Supplier Management
- Employee Management
- Sales & Invoices with date picker (JCalendar)
- Track Pending Bills

---

## 🛠️ Tech Stack
- **Language:** Java (Swing, JDBC)  
- **Database:** MySQL  
- **IDE/Build Tool:** NetBeans + Ant  
- **Libraries:**  
  - `mysql-connector-java-5.1.22-bin.jar`  
  - `jcalendar-1.4.jar`  

---

## ⚙️ How to Run
1. **Database Setup**
   - Create a MySQL DB named `inventmanage`.
   - Import `inventmanage.sql` into it.

2. **NetBeans Setup**
   - Open project in NetBeans.
   - Add `mysql-connector-java-5.1.22-bin.jar` and `jcalendar-1.4.jar` to **Libraries** (Compile + Run).
   - Set Java Platform to **JDK 1.8**.
   - Main class: `inventorymanagement.Home`.

3. **Run**
   - In NetBeans → Right-click project → **Run**  
   - Or from terminal (`dist` folder):  
     ```bash
     java -cp "Inventory_Management.jar;lib/*" inventorymanagement.Home
     ```

---

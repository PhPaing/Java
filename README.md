# 🏧 ATM Management System  

A console-based Java application that simulates core **ATM operations** such as balance inquiry, deposits, withdrawals, and fund transfers.  

## ✨ Features
- **Account Management**: Secure storage and management of user accounts.  
- **ATM Operations**:  
  - Balance Inquiry  
  - Deposit Funds  
  - Withdraw Funds  
  - Transfer Funds  
- **Security**:  
  - Password protection for accounts  
  - Account lock after 5 failed login attempts  
- **Error Handling**: Handles invalid inputs, incorrect credentials, and invalid transaction amounts.  

---

## ⚙️ System Design
- **`Account` Class** → manages account details & transactions.  
- **`ATMOperations` Interface** → defines standard ATM operations.  
- **`Bank` Class** → stores and manages all accounts.  
- **`ATMSystem` Class** → handles user interactions, menus, and transaction flow.  

---

## 🧑‍💻 Technical Concepts Used
- **Object-Oriented Programming (OOP):** Classes, Interfaces, Encapsulation, Polymorphism.  
- **Error Handling:** Clear messages for invalid actions.  
- **User Interaction:** Console-based system with menu navigation.  
- **Access Specifiers:** Proper use of `private` and `public` for data protection.  
- **Clean Code Practices:** Meaningful naming conventions and inline comments.  

---

## 🚀 How to Run
1. Clone the repository
2. Open the project in any Java IDE (IntelliJ IDEA, Eclipse, or NetBeans).
3. Compile and run the ATMSystem.java file.
4. Follow the console instructions to log in and perform operations.



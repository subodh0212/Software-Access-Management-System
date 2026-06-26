📌 Project Overview

The Software Access Management System (SAMS) is a Java-based desktop application developed to simplify the process of managing software access requests within an organization. It enables employees to request access to software applications, while administrators can review, approve, or reject those requests. The system also maintains employee login (IN) and logout (OUT) records for monitoring and auditing purposes.

The project is built using Java, JDBC, and MySQL, following a layered architecture that separates business logic, database operations, and application models.

✨ Features
Employee Registration and Login
Secure Authentication
Request Access to Software
View Request Status
Admin Dashboard
Approve or Reject Access Requests
Revoke Software Access
Employee IN/OUT Time Tracking
Software Management
Database Connectivity using JDBC
Exception Handling
Layered Project Architecture
🛠️ Technologies Used
Technology	Purpose
Java	Application Development
JDBC	Database Connectivity
MySQL	Database Management
Eclipse IDE	Development Environment
Git & GitHub	Version Control

📂 Project Structure
<img width="765" height="396" alt="image" src="https://github.com/user-attachments/assets/2a6fb13d-0c52-4e39-838c-11341c726315" />


⚙️ System Workflow
Employee logs into the system.
Employee views available software.
Employee submits an access request.
Administrator reviews pending requests.
Administrator approves or rejects the request.
Approved software becomes available to the employee.
Employee's IN and OUT timings are recorded automatically.

🗄️ Database

The application uses MySQL as the backend database.

Example tables:

Employee
Admin
Software
Access_Request
Access_History
Login_Logs

🚀 Installation
Clone the repository
git clone https://github.com/subodh0212/SoftwareAccessManagementSystem.git
Open the project

Import the project into Eclipse IDE.

Configure Database
Install MySQL
Create a database
Import the SQL file
Update database credentials inside the project

Example:

URL=jdbc:mysql://localhost:3306/software_access_management
USERNAME=root
PASSWORD=your_password
▶️ Run the Project
Open Eclipse.
Import the project.
Configure the database.
Run the Main.java file.
Login as Employee or Admin.

## 🤝 Contributing

Contributions are welcome and appreciated! If you'd like to improve this project, please follow these steps:

1. Fork this repository.
2. Create a new branch for your feature or bug fix.
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Make your changes and commit them with a clear commit message.
   ```bash
   git commit -m "Add your commit message"
   ```
4. Push your changes to your fork.
   ```bash
   git push origin feature/your-feature-name
   ```
5. Open a Pull Request describing the changes you have made.

### Contribution Guidelines

- Follow the existing project structure and coding style.
- Write clean, readable, and well-documented code.
- Test your changes before submitting a Pull Request.
- Keep commit messages meaningful and descriptive.
- Ensure that your changes do not introduce new issues or break existing functionality.

Thank you for contributing to the Software Access Management System!

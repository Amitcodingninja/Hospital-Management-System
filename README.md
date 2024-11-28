
➡️ Hospital Management System

This is a  Hospital Management System  implemented in Java. It uses  MySQL  as the database and provides functionalities to manage patients, doctors, and appointments. This project can be used to practice Java, JDBC, and database operations.

  Features
➡️  Add Patients : Add new patients with name, age, and gender.
➡️  View Patients : List all patients stored in the database.
➡️  View Doctors : List all doctors and their specializations.
➡️  Book Appointments : Schedule appointments between patients and doctors, ensuring no scheduling conflicts.

 

  Prerequisites
Before running this project, make sure you have:
1.  Java Development Kit (JDK)  installed (version 8 or higher recommended).
2.  MySQL Database  installed and running.
3.  MySQL Connector/J  library added to your classpath.

 

  Database Setup
1. Open your MySQL client (CLI or GUI).
2. Create a database named `hospital`:
    sql
   CREATE DATABASE hospital;
    
3. Create the required tables:
    sql
   USE hospital;

   CREATE TABLE patients (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(50) NOT NULL,
       age INT NOT NULL,
       gender VARCHAR(10) NOT NULL
   );

   CREATE TABLE doctors (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(50) NOT NULL,
       specialization VARCHAR(50) NOT NULL
   );

   CREATE TABLE appointments (
       id INT AUTO_INCREMENT PRIMARY KEY,
       patient_id INT NOT NULL,
       doctor_id INT NOT NULL,
       appointment_date DATE NOT NULL,
       FOREIGN KEY (patient_id) REFERENCES patients(id),
       FOREIGN KEY (doctor_id) REFERENCES doctors(id)
   );
    

4. Insert some sample data for doctors:
    sql
   INSERT INTO doctors (name, specialization) VALUES
   ('Dr. Alice', 'Cardiologist'),
   ('Dr. Bob', 'Neurologist'),
   ('Dr. Charlie', 'Orthopedic');
    

 

  Installation and Usage

1.  Clone the repository :
    bash
   git clone https://github.com/Amitcodingninja/Hospital-Management-System.git
   cd command
    

2.  Open the project in your IDE  (e.g., IntelliJ IDEA, Eclipse).

3.  Add MySQL Connector/J :
   ➡️ Download the MySQL Connector/J library from [here](https://dev.mysql.com/downloads/connector/j/).
   ➡️ Add the JAR file to your project's classpath.

4.  Edit Database Credentials :
   Update the database credentials in the `HospitalManagementSystem` class:
    java
   private static final String url = "jdbc:mysql://localhost:3306/hospital";
   private static final String username = "your mysql username";
   private static final String password = "your mysql password";
    

5.  Run the Project :
   Execute the `HospitalManagementSystem` class to start the application. Use the menu to navigate and perform operations.

 

  How It Works
1.  Main Menu : 
   ➡️ Displays options like Add Patient, View Patients, View Doctors, Book Appointment, and Exit.

2.  Database Operations :
   ➡️ Patient and doctor data is fetched and stored in MySQL using JDBC.
   ➡️ Appointment conflicts are checked before booking.

 


  Main Menu:
 
HOSPITAL MANAGEMENT SYSTEM
1. Add Patient
2. View Patients
3. View Doctors
4. Book Appointment
5. Exit
Enter Your Choice: 
 

 

  Contributing
Feel free to fork this repository, make changes, and submit pull requests. Contributions are welcome!

 

  License
This project is licensed under the [MIT License](LICENSE).

 

  Author
 [Amit Kumar](https://github.com/Amitcodingninja)   
Java Full Stack Developer | Learning and Building Projects 🚀

 

Let me know if you want help with the license file or any specific GitHub workflow setup!

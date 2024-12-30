### **Airplane Automation System**

This repository contains a Java-based object-oriented simulation of various types of airplanes, demonstrating the use of inheritance and method overriding.

### **Overview**

The system models different airplane types using classes that inherit common behaviors from a base `Airplane` class. Each type of airplane—`PassengerAirplane`, `CargoPlane`, and `FighterJet`—extends the base class and adds specific functionality, such as managing passengers, cargo, or weapons. 

### **Key Classes**

- **Airplane (Base Class)**: Represents a generic airplane with basic attributes like `modelName` and `maxAltitude`. It includes methods for displaying basic information (`basicInfo()`) and performing a standard landing (`performLanding()`).

- **PassengerAirplane**: Extends `Airplane` and adds a `passengerCapacity` attribute. It also overrides the `performLanding()` method and includes a method for managing passengers (`managePassengers()`).

- **CargoPlane**: Inherits from `PassengerAirplane` and adds a `cargoCapacity` attribute. It further overrides the `performLanding()` method and includes a method for managing cargo (`manageCargo()`).

- **FighterJet**: Inherits directly from `Airplane` and adds a `weaponCount` attribute. It overrides the `performLanding()` method and includes a method for engaging weapons (`engageWeapons()`).

### **Features**
- **Inheritance**: Demonstrates both single and multilevel inheritance with overriding of methods.
- **Method Overriding**: Different airplane types provide their own implementation of the `performLanding()` method.
- **Attributes Specific to Airplane Types**: Each subclass has attributes unique to its type, such as `passengerCapacity`, `cargoCapacity`, and `weaponCount`.

### **How to Use**
1. Clone the repository.
2. Compile and run `AirplaneAutomation.java`.
3. View the output for each airplane type performing specific actions (e.g., landing, managing passengers, managing cargo, or engaging weapons).

### **Example Output**
```bash
Passenger airplane: performing standard landing sequence.
Cargo airplane: performing standard landing sequence.
Fighter jet: performing standard landing sequence.
The Boeing A21 makes a maximum altitude 2000
Cargo plane of Boeing A21 handles cargo capacity of 5000 and crew capacity of 150
Ready to engage weapon count: 35
```

### **Usage Scenarios**
- **PassengerAirplane**: Used for commercial travel with a focus on passenger capacity and management.
- **CargoPlane**: Designed for transporting goods with large cargo capacity.
- **FighterJet**: A military aircraft with a focus on weaponry and combat capabilities.

### **Technologies Used**
- Java
- Object-Oriented Programming (OOP)
- Inheritance and Polymorphism


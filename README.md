#  Strategy Pattern - Duck Simulation

##  Overview
This project demonstrates the **Strategy Design Pattern** using a **Duck Simulation**.  
Each duck can have different **flying**, **quacking**, and **swimming** behaviors,  
which are assigned dynamically using interfaces.

##  Technologies Used
- **Java**
- **IntelliJ IDEA (Professional Edition)**
- **GitHub for Version Control**

---

##  **Project Structure**
This program follows **OOP principles** with encapsulated behaviors.

### **1. Interfaces (Behavior Strategies)**
| Interface | Description |
|-----------|-------------|
| `FlyBehavior` | Defines flying behavior |
| `QuackBehavior` | Defines quacking behavior |
| `SwimBehavior` | Defines swimming behavior |

### **2. Implementations (Different Behaviors)**
| Class | Implements | Behavior |
|--------|------------|-----------|
| `FlyWithWings` | `FlyBehavior` | Flies normally |
| `FlyNoWay` | `FlyBehavior` | Cannot fly |
| `Quack` | `QuackBehavior` | Quacks normally |
| `Squeak` | `QuackBehavior` | Makes squeaking sound |
| `MuteQuack` | `QuackBehavior` | No sound |
| `Swim` | `SwimBehavior` | Swims normally |
| `Float` | `SwimBehavior` | Floats on water |
| `Drown` | `SwimBehavior` | Cannot swim, sinks |

### **3. Duck Classes (Concrete Implementations)**
| Class | Fly Behavior | Quack Behavior | Swim Behavior |
|--------|------------|---------------|--------------|
| `MallardDuck` | `FlyWithWings` | `Quack` | `Swim` |
| `RedheadDuck` | `FlyWithWings` | `Quack` | `Swim` |
| `RubberDuck` | `FlyNoWay` | `Squeak` | `Float` |
| `DecoyDuck` | `FlyNoWay` | `MuteQuack` | `Drown` |

---

## **How to Run**
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/StrategyPattern-DuckSimulation.git
2. javac Main.java
3. java Main


 

Task1 HW21_1
Create a BankAccount class that encapsulates the account balance.
The balance should not be accessible for direct change from the outside,
but can only be changed using the deposit (for depositing funds) and
withdraw (for withdrawing funds) methods.

Task2 HW21_2
Create a User class that encapsulates the user data: login, password and email.
Provide safe modification and access to these fields through getters and setters.
The password should only be changed if the old password is entered correctly and
the new password meets certain security requirements.

Task3 HW21_3

Develop a SystemConfiguration class that stores system configuration parameters
(for example, logging level, path to log files).
Access to changing these parameters must be strictly controlled through methods
that prevent setting incorrect values.

Task4 HW21_4

Create a base Vehicle class with common properties and methods for vehicles.
Then create derived classes Car and Bicycle that extend the Vehicle class by
adding specific properties and methods (for example, the number of doors for a car).

Task5 HW21_5
Define an abstract Shape class with a method for calculating area.
Create Circle, Rectangle, and Triangle classes that inherit from Shape
and implement a method to calculate the area according to the shape of each shape.

Task6 HW21_6
Create an Employee class that contains general information about the company's employees.
Inherit the Manager and Developer classes from it.
In the Manager class, add a list of subordinates - an array of employees (instances of the Employee class),
and in the Developer class - a list of projects that the developer is working on - a String[] array.

Task7 HW21_7
Create an abstract InputDevice class that includes abstract methods connect and disconnect
and can also contain fields or non-abstract methods common to all input devices.
From this abstract class, inherit the Keyboard and Mouse classes, implementing abstract methods.

Task8 HW21_8
Define an abstract class MusicalInstrument with an abstract method playNote that should simulate the sound of a note.
From this class, create classes Guitar, Piano, and Violin that implement the playNote method to simulate the sound of
the corresponding instrument.

Task9 HW21_9
Create an abstract class NavigationSystem with abstract methods for starting navigation startNavigation
and ending navigation stopNavigation.
This class may also include common fields and methods that apply to all navigation systems.
Inherit the CarNavigationSystem and MarineNavigationSystem classes from it,
implementing abstract methods for specific types of navigation.


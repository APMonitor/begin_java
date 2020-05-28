# Lesson 05 - Classes and Objects
One of the things that has allowed technology to advance so much in recent decades is the fact that code can be modular. When a programmer creates a program to perform a specific task, she can package up that code in a convinient bundle for another programmer to use later when he needs to perform a similar task. In object oriented programming languages like Java, these bundles of reusable code are called *classes*. A class is the virtual blueprint of a piece of a program built to perform a specific task. An *object* is a specific virtual bundle of code and information created using the blueprint from a class.

```TCLab``` is a class. When you use the statement ```TCLab myLab = new TCLab();``` What you are really doing is creating an object called 'myLab'. This object is a clone of the TCLab class, it follows the blueprint and structure of the TCLab class exactly but contains information unique to the myLab object. Within one program, you can create many different objects from the same class. Each object will have the same functionality and types of information as specified by the blueprint of the class but will differ slightly in the information stored within. Let's look at an example of how classes and objects can be used to organize and reuse code in a project.

## MI6 Project
In any intelligence organization, it is of utmost importance to have detailed organization and seamless technological systems. Consider such a system that could be used by the United Kingdom's Secret Intelligence Service MI6. In the system we want to keep track of a few things. Agents, equipment, and missions. We need to know which agents are assigned to which missions, as well as who is using which items from our equipment arsenel. Let's begin by creating a few classes to represent each of these things.
```
class Agent() {}
```
```
class Equipment() {}
```
```
class Mission() {}
```
Now, whenever we induct a new agent or assign a new mission, we'll just have to create an object from one of these classes, for instance:
```
Agent james_bond = new Agent();
```

### Class Variables
For this system to really be useful, we'll want to keep track of information. For each agent we'll want to keep track of things like their name, age, height, current contact info, or currently assigned mission. For equipment we'll want to know how old it is, whether it is available or assigned to an agent, and how expensive it is to replace. For missions, we'll want to know in what country the mission will take place, which agent is assigned to the mission, and how long it is estimated to last. We can do this by creating certain variables within each class:
```
class Agent() {
	String name;
	int age;
	float height;
	Mission active_mission;
	String phone_number;
}
```
```
class Equipment() {
	int age;
	bool available;
	float cost;
}
```
```
class Mission() {
	String mission_name;
	String country;
	Agent assigned_agent;
	float duration;
}
```
When an object gets created from any one of these classes, it's variables will be specific to that object. The variables of a specific object are called *instance variables*.
### Constructors
Now we have variables to represent the important information but we have no way to assign these variables a value when we create a new object from one of these classes. To give these variables a value, we need to create a *constructor* in each class. A constructor is a method that will be called each time a new object is created from that class. A constructor method must have the same name as it's class. Let's write a constructor for the Agent class.
```
class Agent() {
	String name;
	int age;
	float height;
	String active_mission;
	String phone_number;
	
	Agent(name, age, height, active_mission) {
		this.name = name;
		this.age = age;
		this.height =  height;
		this.active_mission = active_mission;
		this.phone_number = phone_number;
	}
}
```
Now, whenever we create an object, we can pass in certian parameters. The constructor will look for these parameters as defined in the parentheses of the constructor method. Then, when the method runs, it will set the instance variables to the values we gave it in the parameters. To create an object and give it values for the parameters, we simply put those values inside the parentheses like this:
```
Agent James_Bond = new Agent("James Bond", 46, 5.8, "Spectre")
```
### Other Class Methods
We will also need the system to carry out certain tasks. For instance, we will need a way to contact agents and assign them new missions. Because agents are always under cover, their phone number will always be changing. We can use our ```Agent``` class to write a method that will send a text message to the agent no matter what phone number he is using. Let's assume that the method ```sendText``` already exists. We already created a mission class, we can take advantage of this by accessing the data from a mission object that we pass into the assignMission method.

```
public void assignMission(Mission mission) {
	String message = this.name + ", you have been assigned to a new mission -" + mission.mission_name + ". Please report to " + mission.country + " To begin you new assignment. Good luck!"

sendText(this.phone_number, message);

mission.assigned_agent = this;
this.active_mission = mission;
}
```
Now assigning new missions is easy, we simply have to create a mission object and then call the assignMission method from an Agent object.
```
Mission planeRecovery = new Mission("Plane Recovery", "Honk Kong", 2);

james_bond.assignMission(planeRecovery);
```

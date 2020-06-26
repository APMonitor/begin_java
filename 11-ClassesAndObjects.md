# Lesson 11 - Classes and Objects
One of the biggest advancements in programming in the last few decades is called *object oriented programming*. Many of the most used programming languages today, including Java, are *object oriented*. This means that programmers can organize their code in a specific way that makes it easy modify and use in lots of different ways. To understand why object oriented programming is so useful, I will first explain what classes and objects are, then we will look at a few examples of how they can be used.

## What are Classes and Objects?
A class is a blueprint of code that can be copied over and over in your program. Each copy of a class that gets created when a program runs is called an object.

<img src="https://i.imgur.com/oSJUQDY.png" alt="Class and Objects" width="600" />

A programmer usually writes a class to do something that is a little bit different in different circumstances. Lets look at an example of how a programmer could use classes and objects to write a program that keeps track of sales at a lemonade stand.

<img src="https://i.imgur.com/oxmVkTv.png" alt="Class and Objects" width="600" />

In this example, the programmer has written a class called 'Drink'. This class has the blueprint to store information like Flavor, size, ice, and price. In the program, the programmer has created two objects, lemonade1 and lemonade2, that follow the pattern of the class. The two objects follow the same pattern but they are different in the specific information they contain. This makes an easy way to log a new purchase every time the lemonade stand has a customer. The user just has to enter in the flavor, size, weather the drink had ice, and the price. Then the program make a Drink object and store it in a list.

Later on, if the user wants to see how much money they made, they just have to add up the price variable from all the Drink objects in the list. If they want to see which flavor was most popular, they can count up the number of each flavor from the list of Drink objects. This class and object system makes it really easy to organize all this information.

## Writing Classes in Java
Let's see how this same lemonade stand example could be written in Eclipse. First, create a project in Eclipse as you normally would with a main class. To write a new class in Eclipse or most other IDE's, right click on your package in the Package Explorer window and select new>Class. Type in 'Drink' for the class name. Usually, class names begin with capital letters.

<img src="new class" alt="New Class" width="600" />

Since this class is not the main class of your project, do not check the 'public static void main(String[] args)' box. You will see that Eclipse creates a new file. It should look like this. Your package name might be different.

```
package defaultpackage;

public class Drink {

	
}
```
Now, we need to add variables to our class to represent flavor, size, weather the drink had ice, and price. These are called isntance variables because they will have different values for each object created from this class. The 'public' before each variable means that when an object is created from this class, other classes will be able to see those variables for each object. Alternatively, if you used 'private' then only other code inside the same object could see the variables of that object.
```
package defaultpackage;

public class Drink {

	public String flavor;
	public String size;
	boolean ice;
	double price;
}

```

Next we need a way to set each of those variables when a new Drink object is created. We do this with a special method called a *constructor*. The name of a constructor method must be the exact same as the name of the class.

```
package defaultpackage;

public class Drink {
	
	public String flavor;
	public String size;
	boolean ice;
	double price;
	
	public Drink() {
		
	}
}
```
Now, we need to add parameters to the constructor method, add a parameter for each of the variables we have already created. 
```
package defaultpackage;

public class Drink {
	
	public String flavor;
	public String size;
	boolean ice;
	double price;
	
	public Drink(String flavor, String size, boolean ice, double price) {
		
	}
}
```
Each time an object is created, it will put in it's values for each of these variables as parameters. Whenever a new object is created, it's constructor method is run. The last thing we have to do is set the values of the instance variables. Since the instance variables and the parameters of the constructor have the same names, we can use ```this.``` to tell the instance variables from the parameters.


```
package defaultpackage;

public class Drink {
	
	public String flavor;
	public String size;
	boolean ice;
	double price;
	
	public Drink(String flavor, String size, boolean ice, double price) {
		
		this.flavor = flavor;
		this.size = size;
		this.ice = ice;
		this.price = price;
	}
}
```

Now let's add a method that will print a summary of the information about that drink. We'll call this method 'printSummary'

```
package defaultpackage;

public class Drink {
	
	public String flavor;
	public String size;
	boolean ice;
	double  price;
	
	public Drink(String flavor, String size, boolean ice, double price) {
		
		this.flavor = flavor;
		this.size = size;
		this.ice = ice;
		this.price = price;
	}
	
	public void printSummary() {
		System.out.println("Flavor: " + flavor);
		System.out.println("Size: " + size);
		System.out.println("Ice?: " + Boolean.toString(ice));
		System.out.println("Price: $" + Double.toString(price));
	}
}
```
And that's it! We've just created a class that can be the blueprint for keeping track of orders at our lemonade stand!

## Using Objects in Java
Now that we've made the Drink class, let's use it to keep a list of drinks that people order. For this next part, we'll be writing code in the ```Main.java``` class. In the main method, we'll crate an ArrayList to store Drink objects.
```
package defaultpackage;

import defaultpackage.Drink;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<Drink> drinksList= new ArrayList<Drink>();
	}

}
```
Next, we can add a few Drink objects to our list.

```
package defaultpackage;

import defaultpackage.Drink;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<Drink> drinksList= new ArrayList<Drink>();
		
		drinksList.add(new Drink("Blueberry", "Small", true, 1.20));
		drinksList.add(new Drink("Plain", "Small", false, 1.10));
		drinksList.add(new Drink("Cherry", "Large", true, 2.00));
	}

}
```
Lastly, we can call the ````printSummary()``` method on each of these objects.

```
package defaultpackage;

import defaultpackage.Drink;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<Drink> drinksList= new ArrayList<Drink>();
		
		drinksList.add(new Drink("Blueberry", "Small", true, 1.20));
		drinksList.add(new Drink("Plain", "Small", false, 1.10));
		drinksList.add(new Drink("Cherry", "Large", true, 2.00));
		
		drinksList.get(0).printSummary();
		drinksList.get(1).printSummary();
		drinksList.get(2).printSummary();
	}

}
```
When we run the program we get the output:
```
Flavor: Blueberry
Size: Small
Ice?: true
Price: $1.2
Flavor: Plain
Size: Small
Ice?: false
Price: $1.1
Flavor: Cherry
Size: Large
Ice?: true
Price: $2.0

```

Hopefully this gives you a better understanding of how classes and objects work to organize Java code. Now you will start noticing when you create objects from other classes, like the Scanner class or the JTCLab class.
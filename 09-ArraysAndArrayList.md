# Lesson 09 - Arrays and ArrayList

[![Java Course](https://apmonitor.com/che263/uploads/Begin_Java/BeginJava09.png)](https://www.youtube.com/watch?v=jhrhZsJoGDQ&list=PLLBUgWXdTBDgp8_akDMUUV0_QRlIYwjGJ "Begin Java with the TCLab")

Up to this point we have stored data exclusively in variables. Variables are fantastic for storing a single value but what if you want to store more than one value? What if you have a whole list of values? Java does that too.

## Java Arrays
A Java array is like a list of variables.

<img src="https://i.imgur.com/jRdhUnz.png" alt="Array" width=600 />

Here's is how a Java array is written.
```
int[] myNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
```

In order to create an array, write the datatype as you would for a regular variable. Name your array and write an equals sign. After that, write each item in the array inside the squiggle brackets, separated by commas.

In order to access and use a value from an array, type the name of the array, followed by the index of the item you want. Indexes in programming begin at 0. To access the first item in the array above and store it in an integer variable you would type:
```
int myNumber = myNumbers[0];
```

### Working With Arrays

This exercise is not an official activity but will help you understand how arrays work. Copy the code below into a new project in your IDE. It will print the first item in the list, then it changes it to ```103``` and prints it again. See if you can make it change a different item in the list.

```
package defaultpackage;

public class Tester {

	public static void main(String[] args) {

		int[] list_of_numbers = {16, 17, 12, 5, 2, 13};
		
		System.out.println(list_of_numbers[0]);
		list_of_numbers[0] = 103;
		System.out.println(list_of_numbers[0]);
		
	}

}
```

## Arraylist

Arrays are very useful but you can't add more items to an array once you make it. Java provides an alternative, *ArrayList*. ArrayList is like an array but it has special commands that allow you to do more like add and remove items. Java ArrayList is a Java class so in order to use it you need to import it.
```
import Java.util.ArrayList;
```
When you create an ArrayList object, you must specify what type of object the list will contain. To create an ArrayList that holds integers, use:
```
ArrayList<Integer> ages = new ArrayList<Integer>();
```
Notice that we use 'Integer' rather than 'int'. to specify the type. Integer is the [wrapper class](https://www.w3schools.com/java/java_wrapper_classes.asp) of the int primitive datatype.

You can use ArrayList to store any type of object, here's another example that stores string objects.
```
ArrayList<String> names = new ArrayList<String>();
```
Here are a list of ArrayList commands you can use to change an ArrayList. In this example, I named the ArrayList 'names'.
|   |                |
|---|----------------|
| ```names.add("Eustice");``` | Adds a new string 'Eustice' to the names ArrayList|
| ```names.remove(0);``` | Deletes the first item from the names ArrayList|
| ```names.set(0, "Reuben");``` | Changes the value of the first item to 'Reuben' |
| ```names.get(3);``` | Returns the fourth item in the names ArrayList| 
| ```names.clear();``` | Deletes all the items in the names ArrayList| 
| ```names.size();``` | Returns the number of items currently in the names ArrayList| 

## Try it Yourself!
### Activity 9.1 Arrays
For this first activity, copy the following code into your IDE:
```
public class Main {

	public static void main(String[] args) {
		int[] ages = {4, 7, 16, 32, 27, 12, 45, 3, 8, 4, 68, 19, 19, 84};
	}

}
```

(If your class name is something other than 'Main' make sure to change the class name in my code to match yours.)

This array represents a list of tourists who have signed up for a zipline tour down a tropical mountain. The zipline company needs everyone below 18 to get a permission form from a parent or legal guardian. With this array, write a program that loops through each item of the array and prints all the ages younger than 18.

### Activity 9.2 ArrayList

In this activity, write a program that turns the heaters onto 50% power. Every 5 seconds for a minute, the program must add the temperature of each heater an ArrayList, one for heater one and the other for heater two. After a minute, use ```close();``` to disconnect from the temperature control lab and shut it down. Use ```System.out.println(your_ArrayList_name_here);``` to print the contents of both ArrayLists

Good luck!

# Lesson 09 - Arrays and ArrayList

Up to this point we have stored data exclusively in variables. Variables are fantastic for storing a single value but what if you want to store more than one value? What if you have a whole list of values? Fortunately, Java let's you do that.

## Java Arrays
Arrays aren't the only method to do this but they are the most basic. Here's an example of a Java array that stores integers.

```
int[] myNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
```

In order to create an array, write the datatype as you would for a regular variable. Following the datatype, a pair of square brackets tells the computer this is an array. Each value in the array is written inside of the squiggly brackets following the equals sign, seperated by commas.

In order to access and use a value from an array, you must type the name of the array, followed by the index of the item you want. YOU MUST remember that array indexes in programming begin at 0. To access the first item in the array above and store it in an integer variable you would type:
```
int myVar = myNumbers[0];
```
To access the fifth item in the list you would use:
```
int myVar = myNumbers[4];
```
Similarly, you can change the value of an index in an array as you would a variable
```
myNumbers[5] = 16;
```
The code segment above changes the value of the 5th index to 16. The array after running this statement would look like this:
```
[1, 2, 3, 4, 5, 16, 7, 8, 9, 0]
```

## Arraylist

As useful as arrays are, there is one thing you cannot do with a simple array, expand it. Once an array is created, it is a fixed size. In order to get around this, every time you want to expand an array, you would have to make an entirely new array that is 1 index longer than the previous and copy the values from the first array into the second. Fortunately, Java provdes an alternative, *ArrayList*, that does this all in the background and allows you to expand or condense a list with a simple command. Java ArrayList is a Java class so in order to use it you need to import it just like you do with Scanner or JTCLab.
```
import Java.util.ArrayList;
```
When you create an ArrayList object, you must specify what type of object the list will contain. To create an ArrayList that holds integers, use:
```
ArrayList<Integer> ages = new ArrayList<Integer>();
```
Notice that we use 'Integer' rather than 'int'. to specify the type of contents. Integer is the [wrapper class](https://www.w3schools.com/java/java_wrapper_classes.asp) of the int primative datatype.  A wrapper class allows the programmer to interact with primative datatypes as objects. Wrapper classes will make more sense after learning about classes and objecs in lesson 11.

You can use ArrayList to store any type of object, here's another example that stores string objects.
```
ArrayList<String> names = new ArrayList<String>();
```
In order to change or retreive data from an ArrayList, we use the provided methods. Here is a list of the essential ArrayList methods using the ```names``` Arraylist from above as an example:
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

This array represents a list of tourists who have signed up for a zipline tour down a tropical mountain. The zipline company needs everyone below 18 to receive a release form signature from a parent or legal guardian. With this array, write a program that loops through each item of the array and prints all the ages younger than 18.

### Activity 9.2 ArrayList

In this next activity, you will write a program similar to that of Lesson 07. You will write a program that let's the user pick a power level to turn the heaters onto. Every 5 seconds for a minute, the program must read the temperatures of both heaters ans store each temperature in an ArrayList, one for heater one and the other for heater two. After a minute, use ```close();``` to disconnect from the temperature control lab and shut it down. You now have two ArrayLists with the historical data of the two heater temperatures over the past minute. With these ArrayLists, calculate the average temperature of heater one and that of heater two. Then print out whether heater one or two had the higher average temperature or whether the heater's averages were equal.

Good luck!
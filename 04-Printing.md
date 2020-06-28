# Lesson 04 - Printing
In the early days of computers, users didn't interact with the computer through a screen, as we do now. Instead, the computer would output information with a physical printer with paper.

<img src="https://upload.wikimedia.org/wikipedia/commons/8/89/WACsOperateTeletype.jpg" alt="Teletype" width="400
"/> 

Nowadays, we don't need to print to a physical printer. Instead, output is printed to a *console* on the computer. The console acts like a virtual printer and can print out whatever you tell it to. In addition to writing output, the user can type commands for the computer directly into the console. Because of this, the console is a fundamental and powerful way for programmers to interact with the computer.

<img src="https://i.imgur.com/RyFcMCv.png" alt="Console" width="400
"/> 
> The console in Eclipse displaying the output 'Hello World'

## Printing in Java
Every programming language has it's own built in way of printing information to the console. In Java, this is done with the statement ```System.out.println();``` Inside the parentheses, you write the information you want the program to print, for instance,
```
System.out.println("Hello World!");
```
will cause the computer to print the following to the console.
```
Hello World!
```
Try it out for yourself! In a Java project in your IDE, type ```System.out.println("Hello World!");``` then run your project. Try it again, this time replacing "Hello World!" with your own text.

## Printing Variables
Printing wouldn't be very useful if it only let you print out specific text that you already typed into the program. The real utility of printing comes from being able to print out variables. In this way, as your program runs, you can monitor changing variable values. This is very useful in our incubator project because it allows us to monitor the temperature with the two thermometers on the Temperature Control Lab. To print a variable in Java, simply type the name of the variable in the parentheses of the print statement.
```
double temp = 28.57;
System.out.println(temp);
```
This will print:
```
28.57
```
Notice that we didn't put quotation marks around ```temp```. Quotation marks tell the program that the text inside is just text. Java sees it as a String datatype. In this case, the command ```System.out.println("temp");``` would just print out ```temp```. Without the quotation marks, Java knows to look for a variable named 'temp' and print out the value of that variable.
## Concatenation
There are many cases where you will want to combine two or more pieces of text to print them together. In programming, this is called *concatenation*. In Java, you can concatenate two strings with the ```+```. We can use this to print more meaningful output to the console.

Take for example a program that simulates a chat conversation with the user. Imagine that the user has input their name and we want the program to respond with a personalized greeting. All we have to do is save the user's name to a variable and concatenate it with the rest of the sentence we want to print. In a real program, we would code it to take input from the user every time the program is run but, to simplify things a little bit, we will hard code the name into a variable like so:
```
String name = "Gordon";
System.out.println("Hi, " + name + ". Thanks for chatting today!");
```
The result of the above code is the following:
```
Hi, Gordon. Thanks for chatting today!
```

## Let's Try It!
Let's apply what we've learned so far to some code that we could use in our incubator project. Your task is to write a short program that will print the temperatures of both thermometers 1 and 2 to the console. Although the values for your thermometers will differ from these, your output should be formatted like this:
```
Temperature 1: 24.02
Temperature 2: 23.98
```
When you're writing your code, remember to:

Import the ```jtclab``` package;
```
import edu.jtclab.*;
```
Create a ```JTCLab``` object
```
JTCLab myLab = new JTCLab();
```
You will also need to use ```T1();``` and ```T2();``` functions to read the temperatures from the two thermometers. Here's an example of how to read the temperature of thermometer one.
```
double temp1 = myLab.T1();
```
Good luck!

# Lesson 05 - User Input


The earliest computers used punch cards to tell the computer what kind of program to run. Nowadays, we don't use punch-card computer input anymore. In this lesson we will learn how to take input from a user using the keyboard.

<img src="https://upload.wikimedia.org/wikipedia/commons/0/09/Jacquard.loom.cards.jpg" alt="Punch Cards" Width="300"/>

> The Jacquard Loom Machine was one of the earliest computers to use punch-card input

## The Scanner
The way to take user input in Java is the *Scanner class*. The very first thing we need to do is import the scanner class.
```
import java.util.Scanner;
```
To use the scanner class, we must create a scanner object. In this example, I've named the object 'myScanner'.
```
Scanner myScanner = new Scanner(System.in);
```

Next, let's print a prompt to the console.
```
System.out.println("What is your name?");
```

We'll store the user's input in a variable called 'response'. To get input, we can call the ```nextLine()``` method.
```
String name = myScanner.nextLine();
```
To finish things off, we can use the ```name``` variable to personalize our response. 
```
System.out.print.ln("Hello, " + name + ". It's good to meet you!");
```
If you did everything correctly, your console should look something like this after running the program.
```
What is your name?
Robert
Hello, Robert. It's good to meet you!
```
## Scanner and Datatypes
When you use the ```nextLine()``` method to retrieve input, the input is retrieved as a string. In order to get other kinds of input, you must use the method for retreiving that datatype. These methods all follow the same name pattern, they are all named 'next' followed by the datatype they take. Here is a list from [w3schools](https://www.w3schools.com/) of these methods.

<div class="w3-responsive" style="margin:-16px 0;">
<table class="w3-table-all notranslate">
<tbody>
<tr>
<th style="width:26%">Method</th>
<th style="width:74%">Description</th>
</tr>
<tr>
<td><code class="w3-codespan">nextBoolean()</code></td>
<td>Reads a <code class="w3-codespan">boolean</code> value from the user</td>
<!--<td><a target="_blank" class="w3-btn btnsmall btnsmall" href="showjava.asp?filename=demo_date_localdate">Try it &raquo;</a></td>-->
</tr>
<tr>
<td><code class="w3-codespan">nextByte()</code></td>
<td>Reads a <code class="w3-codespan">byte</code> value from the user</td>
<!--<td><a target="_blank" class="w3-btn btnsmall btnsmall" href="showjava.asp?filename=demo_date_localtime">Try it &raquo;</a></td>-->
</tr>
<tr>
<td><code class="w3-codespan">nextDouble()</code></td>
<td>Reads a <code class="w3-codespan">double</code> value from the user</td>
<!--<td><a target="_blank" class="w3-btn btnsmall btnsmall" href="showjava.asp?filename=demo_date_localdatetime">Try it &raquo;</a></td>-->
</tr>
<tr>
<td><code class="w3-codespan">nextFloat()</code></td>
<td>Reads a <code class="w3-codespan">float</code> value from the user</td>
<!--<td><a target="_blank" class="w3-btn btnsmall btnsmall" href="showjava.asp?filename=demo_date_localdatetime">Try it &raquo;</a></td>-->
</tr>
<tr>
<td><code class="w3-codespan">nextInt()</code></td>
<td>Reads a <code class="w3-codespan">int</code> value from the user</td>
<!--<td><a target="_blank" class="w3-btn btnsmall btnsmall" href="showjava.asp?filename=demo_date_localdatetime">Try it &raquo;</a></td>-->
</tr>
<tr>
<td><code class="w3-codespan">nextLine()</code></td>
<td>Reads a <code class="w3-codespan">String</code> value from the user</td>
<!--<td><a target="_blank" class="w3-btn btnsmall btnsmall" href="showjava.asp?filename=demo_date_localdatetime">Try it &raquo;</a></td>-->
</tr>
<tr>
<td><code class="w3-codespan">nextLong()</code></td>
<td>Reads a <code class="w3-codespan">long</code> value from the user</td>
<!--<td><a target="_blank" class="w3-btn btnsmall btnsmall" href="showjava.asp?filename=demo_date_localdatetime">Try it &raquo;</a></td>-->
</tr>
<tr>
<td><code class="w3-codespan">nextShort()</code></td>
<td>Reads a <code class="w3-codespan">short</code> value from the user</td>
<!--<td><a target="_blank" class="w3-btn btnsmall btnsmall" href="showjava.asp?filename=demo_date_localdatetime">Try it &raquo;</a></td>-->
</tr>
</tbody>
</table>
</div>

## Do It Yourself!
Let's practice using the scanner to take in user input. Write a simple calculator that accepts two numbers as input from the user. Add the numbers together and then print the answer. Since you're asking the user for number input, use ```nextDouble();``` .  To add two numbers in java, just put a ```+``` between them.

Your final program should look similar to the output below when it is run:
```
Input your first number:
8
Input your second number:
14
Your answer is:
22
```

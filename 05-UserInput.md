# Lesson 05 - User Input
One of the earliest forms of computer was the Jacquard Machine. Invented in 1804, the Jacquard Machine was designed to be retrofitted to a loom, enabling the automation of complex textile weaving. In oder to specify the type of weave for the textile, the machine accepted punch-card inputs, which were read mechanically and interperated into mechanical movements of the machine. These punch cards were made of a thick cardstock with rows of dots. Some of the dots were punched out and some were left in. The computer interperated the sequence of dots and whether a dot was punched out or left in and used this to derive the weave pattern. As computers progressed into the 20th century, this style of user input rose to mainstream use. Fortunately for us, we are no longer limmited to punch-card computer input. In this lesson we will learn how to use simple keyboard input to accept input from a user in your programs.
## The Scanner
Java provides an easy way for us to take input from the user. It's called the *Scanner* class. Scanner, like TCLab, is a class. It takes care of the nitty gritty stuff of user input like reading the bits that are sent from the keyboard. The very first thing we need to do is import the scanner class.
```
import java.util.Scanner;
```
To use the scanner class, we must create a scanner object. Just as with TCLab objects, we can name this object anything we want.
```
Scanner myScanner = new Scanner(System.in);
```

Next, let's print an input prompt to the console.
```
System.out.println("What is your name?");
```

We'll store the user's input in a string variable called 'response'. To get input, we can call the ```nextLine()``` method from our scanner object.
```
String response = myScanner.nextLine();
```
To finish things off, we can print a personalized greeting with the user's name. We can join together multiple strings with the ```+``` opperator. This use of the ```+``` opperator to join strings is called *concatenation*.
```
System.out.print.ln("Hello, " + response + ". It's good to meet you!");
```
If you did everything correctly, your console should look something like this after running the program.
```
>What is your name?
>Robert
>Hello, Robert. It's good to meet you!
```
## Scanner and Datatypes
When you use the ```nextLine()``` method to retreive input, the input is retreived as a string. In order to take inuput of other datatypes, you must use the method for retreiving that datatype. These methods all follow the same name pattern, that is they are all named 'next' followed by the datatype they take. [w3schools.com](https://www.w3schools.com/) provides a table summary of these methods.

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
Let's practice using the scanner to take in user input. Your task is to write a simple calculator that accepts two numbers as input from the user. Adds them, and then prints the answer. You will need to choose a valid datatype to store the user's input. To add two number variables together, you can use the ```+``` opperator like this.
```
double answer = a + b;
```
Your final program should look similar to the output below when it is run:
```
>Input your first number:
>8
>Input your second number:
>14
>Your answer is:
>22
```
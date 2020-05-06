# Lesson 03 - Variables

One of the most useful resources in all of programming are variables. Just like in math, a variable is a container that represents a value that can change. Let's say you are designing a program that makes automatically makes birthday invitations for any group you give it. Rather than programming it to ony make 10 or 12 or 18 invitations every time, you would want a variable that represents the number of people to invite. Then, whenever you run the program, you can set that variable to a specific value depending how many people you have that time.

## Variable Datatypes

In Java, variables are categorized in different *datatypes*. A variables datatype refers to the kind of information it is meant to hold. For instance, on variable might be meant to hold a regular number of people –an integer, while another variable might be meant to hold a person's name –a string.

### Primative Datatypes

Java has a list of *primative datatypes*. Primative datatypes are the most basic kinds of variables from which all other data and code is built. The primative datatypes of Java are:

- ```int``` Stores positive and negative whole numbers that can be written in 32 [bits.](https://www.khanacademy.org/math/algebra-home/alg-intro-to-algebra/algebra-alternate-number-bases/v/decimal-to-binary) 
-   ```long``` Stores positive and negative whole numbers that can be written in 64 bits. Long is like integer but it can store larger values.
- ```short``` Stores positive and negative whole numbers that can be written in 16 bits.
- ```float``` Stores positive and negative numbers with decimal values that can be stored in 32 bits.
- ```double```Stores positive and negative numbers with decimal values that can be stored in 64 bits.
- ```byte``` Stores positive and negative 8-bit binary bytes.
- ```char``` Stores single unicode characters (the characters we use to type like ```a```, ```b``` or ```#```)
- ```boolean``` Stores either ```true``` or ```false```.

As you  have noticed, ```int```, ```long```, and ```short``` all serve very similar purposes. The only difference is the size of the values they can hold. Similarly, ```float``` and ```double``` hold the same kinds of values but ```double``` can hold values with more digits thatn float.

### Other Datatypes

During this course, we will also use the ```String``` datatype. String is not a primative datatype but it is very useful for storing regular text, like what you are reading. 

## Naming Your Variables

Because computers are very particular about the way they read code, there are some standard rules and conventions for naming variables in code.

- Variable names should start with a letter of the alphabet. Conventionally, it should be lowercase.
- After the first letter, variable names may contain numbers.
- Variable names may not contain special characters or spaces.
- Variable names should be descriptive enough that another programmer can understand what that variable is meant for.
- Variable names should be short enough that it's not difficult to type them repeatedly throughout your code.
- You cannot use a Java keyword for your variable name (eg. int)
- It is convention to seperate different words by capitalizing the first letter of each new word (eg. birdCount) or with an underscore (eg. bird_count)
- By convention, variable names written in all capitals (eg. CAR_SIZE) are meant to not be changed by the program as it runs.

## Using Variables

You can use variables in many ways while you're coding. One of the most common uses to make math formulas that perform the same calculations with different values each time. To do math like this, you use arithmetic operators, which represent different math opperations to the computer. The arithmetic operators in Java are:
- ```+``` Adds two values.
- ```-``` Subtracts the second value from the first.
- ```*``` Multiplies two values.
- ```/``` Devides the first value by the second.
- ```%``` Returns the remainder after deviding the first number by the second.


For instance, you could make a formula that converts a temperature in degrees Celcius to degrees Fahrenheit.
```
float DEGREES_C = 37;

float degrees_F = DEGREES_C * (9/5) + 32;
```

## Activity

Assign a value to each variable that could be stored in that datatype. You can copy the code into your IDE to run it and see if it gives you any mismatched datatype errors.
```
int person_age = ;
float personHight = ;
double boat_weight = ;
String cityName = ;
char middle_initial = ;
boolean isLightRed = ;
long cityPopulation = ;
```
Write variables in which you could store the following values:
```
12;
-38;
false;
"Happy birthday, Jonathan!";
92.56;
'g';
"true"; //This one is a but of a trick question
```

Here's a stock photo since this lesson didn't have any.

<img src="https://i.imgur.com/BSi7uF9.jpg" alt="HappyBusiness" width="400
"/> 
# Lesson 06 - Operators

You can think of programming like extra powerful math. Instead of working with just numbers, you can work with many different kinds of data. Just like math, programming uses special symbols called *operators* to make changes to and to compare data. We have already used operators in a few of the lesson activities, like the ```+``` symbol to add two numbers. Today, we are going to take a look at three common kinds of opperators in Java and how they are used.


## Arithmetic Operators
Arithmetic operators are for math. They can be used to perform operations on numbers –integers, doubles, floats etc. The arithmetic operators in java are:
|   |                |
|---|----------------|
| + | Addition       |
| - | Subtraction    |
| * | Multiplication |
| / | Devision       | 
| % | Modulus        |

The modulus will return the remainder after deviding the number on the left by the number on the right. For instance, ```23 % 7``` will equate to ```2```.

Here are some examples of using arithmetic operators to do calculations with integer variables
```
int a = 2;
int b = 3;
int c = a + b;
System.out.println(c);
```
```
5
```
You can calculate the remainder of the devision of two variables like this:
```
int a = 239;
int b = 17;
int c = a % b;
System.out.println(c);
```
```
1
```
Just like in regular mathematics, you can use parentheses to tell the computer which operations to do first.
```
int a = (2+3) - (10-3);
System.out.println(c);
```
```
-2
```

## Relational Operators
Relational operators show the relationship between different data, like whether one variable is greater than another variable. The relational operators in java are:
|   |                |
|---|----------------|
| == | Equals|
| != | Not Equals|
| > | Greater Than|
| < | Less Than |
| >=| Greater Than or Equal to |
| <=| Less Than or Equal to|

All of these opperations result in either true or false, boolean values. Let's look at the use of a few of these operators in real Java code, along with the printed output.

```
boolean isEqual = (7 == 18);
System.out.println(isEqual);
```
```
false
```
You can use arithmetic operators and relational operators in the same equation.
```
boolean isEqual = (7+4 == 11);
System.out.println(isEqual);
```
```
true
```
The greater/less than opperators are used like this:
```
boolean isGreater = (11 > 11);
System.out.println(isGreater);
```
```
false
```
The ```>=``` and ```<=``` operators function similarly but will also return true if the two sides equal one another:
```
boolean isGreaterOrEqual = (11 >= 11);
System.out.println(isGreaterOrEqual );
```
```
true
```

## Logical Operators
Logic operators are used in boolean operations, operations that equate to either true or false. The logic operators in Java are:
|   |                |
|---|----------------|
| && | And|
| \|\| | Or|
| ! |  Not | 

Let's look at how each of these logical operators function in Java code.

### The And Operator

```&&``` returns ```true``` if the boolean values on both sides of it are true:
```
boolean myBool = true && true;
System.out.println(myBool);
```
```
true
```
 ```&&```  returns ```false``` if one or more boolean values on both sides of it are false:
```
boolean myBool = false && true;
System.out.println(myBool);
```
```
false
```
You can use logical operators with comparison operators. Here is an example that tests whether 7 equals 4 AND 8 equals 8.

```
boolean myBool = 7==4 && 8==8;
System.out.println(myBool);
```
```
false
```

### The Or Operator

```&&``` returns ```true``` if at least one of the values on both sides of it are true:
```
boolean myBool = false && true;
System.out.println(myBool);
```
```
true
```
 ```&&```  returns ```false``` if neither of the boolean values on both sides of it are true:
```
boolean myBool = false && false;
System.out.println(myBool);
```
```
false
```

### The Not Operator

The not operator effectively reverses the value of the boolean right after it as you can see below:
```
boolean myBool = !true;
System.out.println(myBool);
```
```
false
```

## Combining Operators
You can combine any of the operators we have talked about in this lesson to create complex logical statements. For instance, let's say that you want to write a program that will test weather your total expenses are within your monthly budget. The program below adds up three variables representing different parts of your budget, then it tests whether the total is under your maximum budget.
```
float gasolineCost = 37.50;
float entertainmentCost = 12.00;
float foodCost = 150.75;
float budgetMax = 220.00;

bool isOverBudget = (gasolineCost + entertainmentCost + foodCost) <= budgetMax;
System.out.println(isOverBudget);
```
When you run this program with these values, Java will print out:
```
true
```
Congratulations! You're living within your budget!

## Try it Yourself
For this lesson's activity, your task is to extend the program you wrote in lesson 04 to test weather the temperatures from thermometer 1 and thermometer 2 on the Temperature Control Lab are equal to one another. Your program should measure both thermometers, then test if they are equal, and finally calculate the difference between the two. It's ok if the difference comes out negative. Make your program print out two lines, formated like the ones below:
```
Temperature 1: 24.02
Temperature 2: 23.98
Are the temperatures equal?
false
The difference is:
0.04
```
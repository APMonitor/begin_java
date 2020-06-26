# Lesson 03 - Variables

One of the most useful resources in all of programming are variables. Just like in math, a variable is a container that represents a value that can change. Let's say you are designing a program that makes automatically makes birthday invitations for any group you give it. Rather than programming it to ony make 10 or 12 or 18 invitations every time, you would want a variable that represents the number of people to invite. Then, whenever you run the program, you can set that variable to a specific value depending how many people you have that time.

<img src="https://i.imgur.com/kQ2J08e.png" alt="Container" width="400
"/> 

## Variable Datatypes

In Java, variables are categorized in different *datatypes*. A variable's datatype means what kind of information a variable is meant to hold. Some variables hold whole numbers, some hold decimal numbers, and some hold text. There are many other kinds of datatypes.

### Primative Datatypes

Java has a list of *primative datatypes*. Primative datatypes are the most basic kinds of variables. The primative datatypes of Java are:

- ```int``` Stores positive and negative whole numbers that can be written in 32 [bits.](https://www.khanacademy.org/math/algebra-home/alg-intro-to-algebra/algebra-alternate-number-bases/v/decimal-to-binary) 
-   ```long``` Stores positive and negative whole numbers that can be written in 64 bits. Long is like integer but it can store larger values.
- ```short``` Stores positive and negative whole numbers that can be written in 16 bits.
- ```float``` Stores positive and negative numbers with decimal values that can be stored in 32 bits.
- ```double```Stores positive and negative numbers with decimal values that can be stored in 64 bits.
- ```byte``` Stores positive and negative 8-bit binary bytes.
- ```char``` Stores single unicode characters (the characters we use to type like ```a```, ```b``` or ```#```)
- ```boolean``` Stores either ```true``` or ```false```.

You might notice that some of the datatypes in this list hold the same kinds of data in different amounts of *bits*. A bit is how computers store information in their memory. The more bits a datatype uses, the more digits it can store. 

### Other Datatypes

During this course, we will also use the ```String``` datatype. String is not a primative datatype but it is very useful for storing regular text. In Java, strings are always written inside of quotation marks like this: ```"Hello World"```

## Naming Your Variables

Because computers are very particular about the way they read code, there are some standard rules and conventions for naming variables in code.

- Variable names should start with a lowercase letter of the alphabet. After the first letter, variable names may contain numbers.
- Variable names may not contain special characters or spaces.
- Variable names should be descriptive enough that another programmer can understand what that variable is meant for.
- Variable names should be short enough that it's not difficult to type them repeatedly throughout your code.
- Seperate different words in your variable name by capitalizing the first letter of each new word (eg. birdCount) or by using an underscore (eg. bird_count)
- There are certain words that have special meaning in Java, like ```int```. If you use one of these words as a variable name, Java will think it's part of the code.

## Making a Variable

To write a java variable, first write which kind of variable it is, followed by the variable name. To assign a value to the variable write an equals sign followed by the value you want to assign to the variable. Here are some examples

```int age = 17```
```double height = 5.87```
```String name = "Ricardo"```

Once you assign a value to a variable, you type the variable name anywhere in your code to represent the value. You can also change the value of a variable after you create it. When you change the value of a variable, you do not say what kind of variable it is since you already did that when you created it. Here are some examples that would change the values of the variables we created above.

```age = 21```
```height = 6.04```
```name = "Jonathan"```

## Activity

Assign a value to each variable that could be stored in that datatype. You can copy the code into your IDE to run it, if one of the values you tried to assign to a variable is the wrong type for that variable, Java will give you an error.
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
"true"; //This one is a bit of a trick question
```
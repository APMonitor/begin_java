# Lesson 08 - If Statements
We humans can make decisions. If someone tells you to turn off the stove if the food is done. You can go check the food and then either turn it off *if* it's done or leave it one if not. So far, we have learned programming that lets us tell the computer to do the same thing every time. But what if we want the computer to do something different for different circumstances? 

<img src="https://i.imgur.com/jOmXiY7.png" alt="if else" width=600 />

In programming, this is called an *if statement*. If statements are straight forward they let you tell the computer *if* something is true, follow these instructions but if not, don't do anything.

In Java, an if statement looks like this:

```
if (condition) {

}
```

Inside the parentheses you write the condition for the computer to check. If the condition is true, the code inside the brackets runs, if the condition is false, the code does not run. The keywords ```else if``` tell the computer to check another condition if the first one isn't true. The code inside the ```else``` block will run if none of the other conditions were true.

```
if (condition) {

}
else if (condition 2) {

}
else {

}
```
Here is an example that prints out your letter grade depending on your percentage grade in a class.
```
if (grade > 96) {
	System.out.println("You have an A+");
}
else if (grade >= 90) {
	System.out.println("You have an A");
}
else {
	System.out.println("You don't have an A");
}
```


## Nested If Statements
You can *nest* if statements, or put them inside of each other. This lets you program decisions that are based off of a series of conditions. The example below first checks if a game is over, if so, it tells you if you won or lost.

```
if (gameOver == true) {

	if (score > 1000) {
		System.out.println("You won!");
	}
	else {
		System.out.println("Sorry, you lost.")
	}
	
}
```


## Try it Yourself!

### Activity 8.1
For this activity you will write a simple calculator that can do addition, division, multiplication, and addition. Your program should first ask what type of operation the user would like to do and then as for two numbers.

Here is an example of the output from this program.
```
What operation would you like to do? Type one of the following (+, -, *, /)
+
What is your first number?
3
What is your second number?
4
The answer is:
7.0
```
**Here's some important stuff to know for this project.**

To see if two strings are the same, you have to use ```string1.equals(string2)``` instead of ```string1 == string2``` . If you want to understand why, see this [Stack Overflow post](https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java#:~:text=Strings%20in%20Java%20are%20immutable.&text=When%20using%20%3D%3D%20operator%20for,string%20compares%20the%20string%20contents.).

It is best to use two different scanner objects, one to read the input for the operator characters (+, -, *, /) and a different one to read the input of the numbers. To understand why, see this [Stack Overflow post](https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo#:~:text=19%20Answers&text=That's%20because%20the%20Scanner.,returns%20after%20reading%20that%20newline..).

### Activity 8.2
For this next activity you will write a program that will:
- Power on both heaters to a power level input by the user
- When the temperature of both heaters surpasses 30° C, turn on the red LED
- When the both heaters surpasses 35° C, alert the user and use ```close()``` to disconnect from the lab and shut it off

You will need to use an if statement inside of a while loop for this project. Here's an example of the output from this program

```
Arduino Leonardo connected on COM5 at 9600 baud
Port opened successfully
Please type in a power level
100
Heating up...
Both heaters have passed 35 degrees Celsius
TCLab disconnected successfully

```

# Lesson 07 - Loops
I recently found myself found myself writing a computer program to solve Sudoku puzzles. As part of the program, I needed to the computer to repeatedly check every empty box on the grid for possible values. Checking a single cell is rather straight forward but a standard Sudoku is played on a 9 by 9 grid. That mean's I would have to check each cell 81 times. It wouldn't make sense to type the code to check a cell 81 times. Fortunately, programming languages don't expect you to.

## For Loops
One of the most basid kinds of loops in Java is called a *for loop* because it will run *for* a certain number of repititions. Here's a simple Java for loop that prints out every number from 0 to 9:

```
for (int i = 0; i < 10; i++) {
	System.out.print(i);
}
```

On first glance, that might look like a string of arbitrary characters but each character has a specific meaning to the computer. Let's break it down. All for loops begin with the keyword ```for``` to tell the computer to repeat everything inside the following squiggly brackets ```{}```. Everything inside the parentheses is to describe how many repititions to make.

- The ```int i = 0;``` creates an integer variable, ```i```, to be used just for this for loop. The variable can be named anything you want but 'i' is standard practice among programmers. It is initialized to 0 which means that the loop will start at 0.

- ```i < 10;``` specifies the end of the loop, in this case 10. You can read it like "while 'i' is less than ten, repeat all the code written inside the loop". It's important to note that this foor loop will run up to the number 10 but not including the number 10. Because it started at 0 it will run a total of 10 times but the last iteration will be when ```i``` equals 9.

- ```i++``` tells the computer how much to increase the variable ```i``` each time the loop runs. In this case, the ```++``` will add just 1 to ```i```. To incriment ```i``` by more than 1, you would write ```i += 3``` where the number following the equal's sign is the number to be added to ```i```, in this case 3. 

## Activity
Let's practice writing foor loops. Your task is to write a foor loop that will print out every other number from 5 to 21 like this:
```
5
7
9
11
13
15
17
19
21
```
You can use the same loop structure that I used in the foor loop above but you'll need to change the loop parameters (the code inside the parentheses that control the loop's settings.

## While Loops
The basic idea of a *while loop* is the same as that of a foor loop. However, where a for loop is designed to repeat code for a prespecified amount of times, a while loops is designed to run code while a certain condition is met. This kind of loop works great for taking user input until the user enters a valid response. The following code asks the user to type either a '1' or a '2' to make a selection. If the user inputs something other than a '1' or a '2', it will simply ask for the input again.
```
import  java.util.Scanner;

System.out.prinln("Do you want to 1. fire the cannon or 2. remove the beach ball from the barrel?");

Scanner s = new Scanner(System.in);
int selection = 0;

while (!(selection == 1 || selection == 2)) {
	System.out.println("Type 1 or 2 to make a selection");
	selection = s.nextInt();
}
```
Similar to a foor loop, a while loop is written in 3 parts, the ```while``` specifies what kind of loop it is, the parentheses contain the condition for when to run or not run the loop, and the brackets  contain the code to run each repitition. In a while loop, the condition inside the parentheses can be any boolean value.

## Do it yourself!
Let's write a practice program that uses both while and foor loops. This will be the most involved program we have written for the Temperature control lab thus far. Your job is to write a program that let's the user pick a power level to turn the heaters onto. Then the program must print out the temperatures of both heaters every 5 seconds for a minute before turning off the heaters and disconnecting from the TCLab. This kind of program is a great way to compare heating speeds at different power levels.

The program must first asks to user to input a number between 1 and 100 (inclusive) . Use a while loop to ensure that if they input a number outside of this range, it will ask them to input a number again. After the user inputs a valid number, the program must then turn on both heaters to the power specified by the user. Then it must run a loop 12 times. Inside the foor loop, you will write code to print the tempuratures of each heater and then wait 5 seconds. After the foor loop, remember to use myLab.close() to disconnect from the Temperature Control Lab and power down the heaters. Each of the components of this program are skills that we have learned up to this point in the lessons. Have fun and good luck!
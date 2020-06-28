# Lesson 07 - Loops
I recently wrote a computer program to solve Sudoku puzzles. As part of the program, I needed to the computer to check every empty box on the grid. Sudoku is played on a 9 by 9 grid. That means I would have to check 81 times. It wouldn't make sense to type my code 81 different times. Fortunately, programming languages don't expect you to. Loops let you tell the program to run code over and over as long as you want it to.

## For Loops
One of the most basic kinds of loops in Java is called a *for loop* because it will run *for* a certain number of repetitions. Here's a simple Java for loop that prints out every number from 0 to 9:

```
for (int i = 0; i < 10; i++) {
	System.out.println(i);
}
```

That might look confusing but each part has a specific meaning to the computer. Let's break it down. All for loops begin with the keyword ```for``` to tell the computer to repeat everything inside the squiggly brackets ```{}```. Everything inside the parentheses is to describe how many repetitions to make.

<img src="https://i.imgur.com/VaIxYYT.png" alt="For Loop" width=600 />

The ```++``` symbol can be used anywhere in Java to add one to any variable. You can also use ```--``` to subtract one from a variable. 

## Activity 7.1
Let's practice writing for loops. Your task is to write a for loop that will print out every other number from 5 to 21 like this:
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
You can use the same loop structure that I used in the for loop above but you'll need to change the loop parameters (the code inside the parentheses that control the loop's settings.

## While Loops
A while loop is similar to a for loop. The main difference is that a while loop will keep looping as long as a certain condition is met. 

```
while (true) {

}
```
<img src="https://i.imgur.com/TZZYunT.png" alt="While Loop" width="600" />


## Do it yourself!
### Activity 7.2
Let's write a practice program that uses while loops. Your program should print ```Heating up...``` and then turn on both heaters to 80% power. While they're heating up, check every second to see if they have reached 32° C. Once they've heated up to 32° C, the program should print out ```Both heaters have reached 32° C. Turning off...``` Then turn off the lab with ```close();```

Remember in lesson 01, we said you can use
```try {Thread.sleep("milliseconds");} catch (InterruptedException e) {}```
to wait for a certain amount of time. Just replace "milliseconds" with the number of milliseconds for which you want to wait.

Here's an example of the output from the program:

```
Arduino Leonardo connected on COM5 at 9600 baud
Port opened succesfully
Heating up...
Both heaters have reached 32° C. Turning off...
TCLab disconnected successfully
```

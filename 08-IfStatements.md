# Lesson 08 - If Statements
In highschool robotics club, my team faced an interesting design challenge. You see, we had designed a robot to compete in a live robotics competition –a robotics game really. The game was played with two teams of 2 robots each. The robots started in the corner of a 12x12 foot arena. The object of the game was to pick up and launch foam game objects over a fence in the middle of the arena. At the end of 5 minutes, whichever team had more objects on the opposing team's side of the fence was the winner. For the majority of the 5 minutes, we were allowed to remote control the robot. However, the first 30 seconds of the game were dubbed the autonomus period. During these 30 seconds, the robots would all run whatever preprogrammed code we had loaded on them without any live control from us whatsoever. Our problem was this. At every game, we were assigned to either the right or left side of the arena at random. If we wrote our code as though the robot was starting on the right side, whenever it started on the left side it would turn into the outer wall. If we wrote out code as starting from the left side, whenever we were assigned the right side our robot would run itself into the rightmost wall. We needed a way to tell the robot which side of the arena it was on and run a different set of instructions depending on it's starting position. But how could we do that if we couldn't send any commands to it from the remote?

In the end, we decided to use a dial. We added to the robot a physical dial which could be rotated to the right or left. When we put the robot in the arena, we simply had to turn the dial to the side of the arena from which the robot would start. Then in the code, we told the robot *if* the dial is on the right side, run the right-side instructions if the dial is on left side, then run the left-side instructions. It's a simple solution but it worked like a charm. This control structure, the *if statement*, is central to programming. Without it, a computer could do little more than run a single set of instructions. There would be no variation for changing conditions.

In Java, an if statement looks like this:

```
if (condition) {

}
```

Inside the parentheses go any boolean statement that can equate to either true or false. If it equates to true, the code inside the brackets runs, if the condition is false, the code does not run. Let's look at an example of an if statement using a situation from the previous lesson. You may recall our little text-based game in which the user was asked "Do you want to 1. fire the cannon or 2. remove the beach ball from the barrel?" The following code is the next bit of the game, designed to give different outcomes based on the user's choice:
```
if (selection == 1) {
	System.out.println("You fire the cannon, the beachball flies across the moat,
	striking the castle wall squarely. The stones begin to crumble and you stagger back to avoid
	being crushed. As you watch in awe, you hear a loud hiss. With an angry roar, a giant, scaley, claw
	slams through the wall.");
}
else if (selection == 2) {
	System.out.println("You remove the beachball from the cannon. You turn to walk away but before you
	take a step you hear a deep grumbly voice from behind. 'Thank you' it says. Startled, you turn
	around. Perched atop the wall is a gleaming, golden dragon.");
}
```

Notice that the second if statement is preceded by the Java keyword ```else```. Without the 'else' Java would go on to check every if statement, even if it found the first one to be true. For the sake of efficiency, we use ```else if``` so that if Java finds the first if statement to be true, it doesn't worry about checking the second.

## Nested Control Structures
With if statements or loops or any other control structure in Java, it's important to know how to *nest* them. To nest a control structure is to program additional control structures inside of outer ones. For instance, you can write a second if statement inside of another.

```
if (gameOver == true) {
	if (score > 50) {
		System.out.println("You won!");
	}
	else {
		System.out.println("You didn't score high enough to win. Better luck next time!")
	}
}
```

Notice that I used the else keyword alone in this example. You can do this and it will automatically run the code inside the else block if the condition in the preceeding if block is false.

## Try it Yourself!

### Activity 8.1
For this activity you will write a simple calculator that can do addition, devision, multiplication, and addition. Your program should first ask what type of opperation the user would like to do.
```
What opperation would you like to do? Type one of the following (+, -, *, /)
```
Next the program must ask for the first number
```
What is your first number?
```
And the second
```
What is your second number?
```
Then you must print out the answer and prompt the user for another operation
```
The answer is:
5
What opperation would you like to do? Type one of the following (+, -, *, /)
```
*Hint: To make a program that repeats until the user exits it you can use:
```
while (true) {

}
```
This will repeat forever until the program is stopped.

It is also important to know that you can't compare the contents of two strings with the ```==``` operator. This will compare to see if the objects that contain that data are the same object. To compare the contents of a string, must use the ```.equals()``` method. Here's an example of this method in an if statement to check whether the string variable ```s``` has the same text has the string "Hello Whirl".
```
if (s.equals("Hello Whirl")) {
	System.out.println("Yup! They're the same");
}
```

### Activity 8.2
For this next activity you will write a program that does the following:
- Power on both heaters to a power level input by the user
- When the temperature of both heaters surpasses 30° C, turn on the red LED
- When the both heaters surpasses 35° C, alert the user and use ```close()``` to disconnect from the lab and shut it off
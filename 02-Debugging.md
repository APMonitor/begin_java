# Lesson 02 – Debugging

Because computers are so exact, they are wonderful tools when you need precise measurements and control. However, this also means that they need very precise instructions. It's easy to make a little mistake in your code and throw off your whole program. 

<img src="https://i.imgur.com/mo96iKf.jpg" alt="Frusterated" width="400
"/>

One of the biggest, most time consuming parts of programming is debugging. Debugging means finding mistakes that are causing your program to run differently than you expected –or maybe not run at all. A few simple habbits can cut down the time you spend searching for mistakes and let you get on to finishing your project.

## Effective Programming Habbits

1.   **Understand the big picture**. It seems silly, but once you start going over your project as a whole you can find a lot of holes. There's not one right way to do this, find what works. The important thing is that you don't get caught up on the small things and loose sight of the big picture. For this project, your end goal in mind –to hatch an egg.
    
2.  **Outline your code** . Write high-level instructions, or *pseudo-code*, that explains what your code should do. This doesn't have to use proper Java syntax but should follow the logic of the program. Break it into more specific tasks. You can start before you even know the specifics of Java. Once you understand the basics, you can translate your high level instructions into Java code. Organizing this outline keeps you from overcomplicating your code.
    
3.  **Break up specific tasks**. The best programs are modular. It’s a lot harder to program something if your program is large and complex. For the incubator, you can break up sections of the problem. One section of your code can be in charge of checking if the temperatures are too high. another part can be in charge of adjusting the heaters.
    
4.  **Don't bite off more than you can chew**. For me personally, it is always such a temptation to try and code an entire project in one go. In my mind, it will be so cool when I finally run it and, like magic, it works! But it has never happened that way –not once. It’s much easier to find a problem if you do little tests often. You should test specific parts of your program and make sure that they are doing what they should. You can even have a seperate file just for running small snippets of code to test.
    

The better you follow these steps the less time you will have to spend fixing problems in your code for your incubator.

<img src="https://i.imgur.com/lq1KfWg.jpg" alt="ThumbsUp" width="400
"/> 

## Activity

Fix the errors in the following code cells. Use the error messages to help you locate the problems.

```
System.out.println("Program to Hatch an Egg);  //hint: look for a missing " character
```

```
int target temperature = 37;  //hint: how are you supposed to name variables?
```
```
int current_temperature = 30;
int target_temperature = 37;

int difference = target_temperature - current_temperature

String temperature_units = "degrees Celcius";

System.out.println(difference + temperature_units)  //hint: you can't combine different datatypes
```
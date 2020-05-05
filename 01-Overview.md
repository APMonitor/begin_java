# Lesson 01 - Project Overview
Imagine that you work for your local chapter of the [National Audobon Society](https://www.audubon.org/). Your organization often recovers orphaned bird eggs in the wild and incubates them to maturity. 
<img src="https://i.imgur.com/A4YW8qP.jpg" alt="BabyBirds" width="400
"/>
Egg incubation is tricky business. To incubate a chicken egg, for instance, it must be kept between 37.2° C and 38.9° C. You could just constantly check the temperature and adjust the heaters manually. However, it takes an average of 21 days to incubate a chicken egg. That's a lot of checking and adjusting! A much better way would be to automate the temperature control by having a computer check and adjust the temperatures. The Temperature control lab is the hardware to do just that. The lab comes equiped with two heaters and two thermometers so it can auto-adjust to keep the temperature just right. In this course we will learn about programming as we build a Java program that can maintain a perfect egg-incubation temperature.

## Introduction
Every good programmer must have an understanding of the fundamentals of programming in order to build complex tools. This tutorial steps through core programming skills to build the more complex incubator temperature control. The introductory 10 exercises are designed to be completed in 2-3 hours (15-20 minutes each) but sections can be skipped if you already have the background knowledge.

If you want to do well in monitoring and controlling the egg temperature, you should work through the basic information. For those who already have experience with Java, this background knowledge also teaches the methods of the  ```JTCLab```  library, which you will need to control the lab.

1.  Overview (★ you're here!)
2.  Debugging
3.  Variables
4.  Printing
5.  Classes and Objects
6.  Methods
7.  Loops
8.  User Input
9.  If Statements
10.  Arrays and Arraylists

It is best to follow the lessons in these steps in order because the later lessons build upon the information from the prior lessons.

## Get Started With the JTCLab Library

In programming, a *library* is a set of code developed by someone to be used by others in their projects. For example, Swing is the name of a popular Java library for creating user interfaces –windows and buttons that users can interact. with. A group of programmers programmed Swing in Java and published it. Now, any programmer can integrate that library of code in their own project to create a user interface.

For this project, you will need to integrate two libraries into your project. the ```JTCLab``` library and the ```jSerialComm``` library. You will integrate these libraries in your project with their respective JAR files. A JAR file is a file that nicely packages up all the code in a Java project for other people to run and use it.

- Download the ```JTCLab```  library <a href="https://github.com/CrayonProof/JTCLab/releases/download/1.0/JTCLab.jar" download>JAR file</a>.
- Download the ```jSerialComm```  library <a href="https://fazecast.github.io/jSerialComm/binaries/jSerialComm-2.6.2.jar" download>JAR file</a>.
>JTCLab is the library that allows you to interface with the Temperature Control lab Arduino. jSerialComm is a library that allows Java to send and receive commands over your USB port.

Make sure you put those files in a permenant place, preferably in the same folder with your project. If these files get moved or deleted later, your project could stop working.

You will need to include the two files you just downloaded in your project's build path. If you are using Eclipse, right click on your project and go to Build 'Path>Configure Build Path'.

<img src="https://i.imgur.com/oflDuMM.png" alt="configureBuildPathImage" width="350"/>

When the Java Build Path window opens, click 'Modulepath' and then 'Add External Jars'.

<img src="https://i.imgur.com/3xuORlx.png" alt="javaBuildPathImage" width="350"/>

Brows to the location in which you downloaded the above JAR files and add both files to the build path. It should look like the below image when you finish. Select 'Apply and Close'.

<img src="https://i.imgur.com/adtTih6.png" alt="javaBuildPathImage" width="350"/>


Now, you can write code in your project that will control the Temperature Control Lab! You can use the following code to test the lab by turning on it's LED for five seconds.

```
import edu.jtclab.*;

public class Main {

	public static void main(String[] args) {
		//Connect to the Arduino
		JTCLab myLab = new JTCLab();
		
		//Turn on the LED
		myLab.LED();
		
		//Wait one second
		try {Thread.sleep(5000);} catch (InterruptedException e) {}
		
		//End the program and disconnect the Arduino
		myLab.close();
		
	}
}
```
The red LED on top of the temperature control lab should light up and stay red for 5 seconds, then turn off.

<img src="https://i.imgur.com/OhAstHw.png" alt="javaBuildPathImage" width="350"/>

Congragulations! You just built your first Temperature Control Lab program!
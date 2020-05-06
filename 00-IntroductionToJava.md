# Lesson 00 - An Introduction to Java
Before we get started using the Temperature Control Lab, it's important that we get a good feel for the tools we will use to program. This course will use the Java programming language.  You can write a Java code in any text editor, however, out of convinience, most programmers prefer using an IDE (Integrated Development Environment). An IDE gives you a place to both write your code **and** run your code in the same program. In addition, IDE's can include other features that are useful to programmers like debuggers to help figure out what is wrong when their program doesn't run like they expected. There are many IDE options for you to consider. Three popular IDEs are [Eclipse](https://www.eclipse.org/downloads/packages/release/kepler/sr1/eclipse-ide-java-developers), [IntelliJ]([https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)), and [Visual Studio]([https://visualstudio.microsoft.com/](https://visualstudio.microsoft.com/)). Each of them has free download options that anyone can use. For this course, we will be using Eclipse, although most full-feature IDEs will let you do everything we will do here.

In addition to an IDE in which to run your code, your computer will need to have the [JDK](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) (Java Development Kit) installed. This is what allows the IDE to compile Java code.

## Building a Java Project
Code for a java project is generally organized in a specific way. You can see this organization in your IDE. Usually it will be on the left side in a list of all your projects and it will look like this:

<img src="https://i.imgur.com/7BdEvUH.png" alt="javaBuildPathImage" width="337
"/>

But what does that all mean?
- 'MyProject' is the name of the folder where all the files for this project will go. This is called your project directory. 
- 'src' stands for source, this is the folder where all the source code for my project will go.
- 'defaultpackage' is the name of the package in which my Java code files will go. All java classes are organized into packages. A package is basically a folder in which to organize relevant parts of a project together. A project may have one or more packages.
- 'Main.java' is the java code file. This is where I will write the code that is run when the computer reads it.
- 'Module-info.java' is was automatically made by Eclipse. You don't have to worry about this file. It contains information about  the structure of your project.
## Writing Our Code
In this case, we will write our code in the 'main.java' file. When you first open up this file, it looks like the image below. I have included descriptions of what the different lines of text are.

<img src="https://i.imgur.com/nZxjO2E.png" alt="javaBuildPathImage" width="700
"/>

As you read through this course, I will give you examples of code to do different things in Java. From now on, I will include the code I write in little code boxes like this:
```
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

```
## Some Things to Know

As we go through each lesson, you may come across vocabulary or phrases that you don't understand. Don't be discouraged, much of this vocabulary will be defined later on as you continue through the course but we encourage you to look it up on your own and do your best to understand it when you first encounter it.

### Try-Catch
In many programming languages, including Java, you can use a *try-catch* block to prevent your program from crashing if something doesn't work as intended. A try-catch block in java looks like this:
```
try {
	//Your code here
} catch (Exception e) {
	// Your backup code here
}
```
This tells the computer to try running the code inside the try segment. However, if the computer can't run the code and throws an error, instead of crashing your program, it will run the code inside of the catch segment. For instance, you could use it to report the error to the user like this:
```
try {
	//sign into user account
} catch (Exception e) {
	//pop up message that says "Your password was incorrect, try again"
}
```
Remember that anything following a  ```//``` isn't real code, it's a comment. Here, just serves as a placeholder.

### The Semicolon
In Java, the semicolon is used to tell the computer when it has reached the end of an instruction or *statement*. Evey instruction you give the computer MUST end in a semicolon or the computer won't know how to read it. For example:
```
int x = 4;
System.out.println("Hello World");
```

### Curly Brackets
Curly brackets give Java code it's structure. They are used to show the beginning of classes, methods, loops, if statements, and other *control structures*. Notice how the oppening brackets ```{``` and the closing brackets ```}``` indicate the beginning and end of control structures in the code below:

```
public class Main {

	public static void main(String[] args) {
		int age = 6;
		if (age < 12) {
			System.out.println("Sorry, you are too young for this rollercoaster.");
			}
	}
}
```

Continue to [lesson 01 - Overview](https://github.com/CrayonProof/LearnJava/blob/master/01-Overview.md)
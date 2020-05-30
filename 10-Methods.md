
# Lesson 10 - Methods
The entire point of programming is to automate tasks that we humans find repetitive or mundane. Would it not then be a bit counterproductive if, within our code, we find outselves writing the same bits of code over and over? To avoid this, most programming languages have a way to make certain chunks of code reusable. Some programming languages call these reusable chunks of code *functions*. In Java, they are called *methods*.  Let's look at an example of how we can use methods to make our code cleaner and easier when working with the Temperature Control Lab.

## Writing a Method
In our last lesson, we wrote a short program that printed out the temperatures of lab one and lab two. We may want to do this at various points in out final program. Rather than retype this code every time we want to use it, we can put it in a method. Methods are wrapped in curly braces and identified by a name. Let's name our function 'readTemps'.
```
readTemps {
}
```
In addition to a name and curly brackets to encase it, a function needs a *return type*. A return type specifies the datatype of the value returned by the function if any is returned. In this case, no value will be returned so the return type is ```void```.
```
void readTemps {
}
```
The last thing a method needs are *parameters*.  Also refered to as an *argument*, a parameter is a variable, unique to a method, that is set every time that method is run. The parameters go inside parentheses right after the method name. Since this method needs no parameters, we will leave the parentheses blank.

```
void readTemps() {
}
```
Now, all we need to do is write the code for the method inside the curly brackets.

```
void readTemps() {

	double temp1 = myLab.T1();
	double temp2 = myLab.T2();
	System.out.println("Temperature 1: " + temp1)
	System.out.println("Temperature 2: " + temp2)
}
```
Now, any time we want to print out the two temperatures, we can just *call* the method  with the statement ```readTemps();``` and the computer will print out the two temperatures just as we did in the previous lesson!

## Method Returns
Any time you use ```T1()``` or ```T2()``` from the TCLab library, you are actually calling a method that was written in the TCLab class! While neither of these functions print anything to the console, they both return a value. You can access the return of a method just how you would access the value of a variable. For that reason, we can set the variable 'temp 1' to the return of ```T2()``` in the snippet of code below.
```
double temp2 = myLab.T2();
```
When you are writing functions of your own, the value it returns is specified by the *return* keyword. For example, the return of a function that is meant to return the string 'My function ran!' would look like this:
```
return "My function ran!";
```
The return of a function that is meant to return the double value ```52``` would look like this:
```
return 52;
```
And the return of a function tht is meant to return the value of a variable ```product``` would look like this:
```
return product;
```
## Method Parameters
As mentioned above, method parameters are variables that are unique every time a method is run. They are specified in the parentheses after the method name. Let's look at a simple method that is meant to multiply two integers```a``` and ```b``` and return the result.
```
int multiply(int a, int b) {
	return (a*b);
}
```
As you can see, we declare the parameters just like variables inside the parentheses. Each parameter is seperated from the previous by a comma. Within the method, we can use the names of these parameters just like variables. When the method is run, these variables will contain whatever values are passed to it as argumunts.

When calling a method that takes arguments, values are passed inside the parentheses in the correct order. If we want to call the above method with the values 5 for ```a``` and 12 for ```b```, we would do so like this:
```
multiply(5, 12);

```

TCLab has some functions that can take parameters, like the ```LED()``` function. You can specify an LED brightness by passing it a value between 0 and 100 in the parentheses: ```LED(58);```

## Activity #1
In this activity, you will write a boolean method ```isEven``` that takes one integer as an argument and returns true if that integer is even and false if not. You will need to use the ```%```  opperator to determine whether or not the integer is even. You should know that boolean variables can be set to the result of a boolean opperation. For instance:
```
boolean isTen = ((5+8) == 10);
```
in this case ```isTen``` would be equal to false;

Below are some examples of method calls to ```isEven``` and what the output should be.

```
System.out.println(isEven(5));
false
```
```
System.out.println(isEven(12));
true
```
```
System.out.println(isEven(100));
true
```
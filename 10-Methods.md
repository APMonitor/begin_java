
# Lesson 10 - Methods
A method is a reusable bit of code that you can activate or *call* at any point in your code.

<img src="https://i.imgur.com/GuLxJkv.png" alt="Method" width="600" />

## Writing a Method
In a previous lesson, we wrote a short program that printed out the temperatures of lab one and lab two. We may want to do this at various points in out final program. Rather than retype this code every time we want to use it, we can put it in a method. Methods are wrapped in curly braces and identified by a name. Let's name our function 'readTemps'.
```
readTemps {
}
```
Methods also need a *return type*. A return type says the datatype of the value returned by the function if any is returned. In this case, the method won't return a value so we will type ```void```.
```
void readTemps {
}
```
The last thing a method needs are *parameters*. A parameter is a special variable that is set every time the method is called. The parameters go inside parentheses right after the method name. Since this method needs no parameters, we will leave the parentheses blank.

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
The commands you use to control the Temperature control lab like  ```T1()``` or ```T2()``` are all methods! Both of these examples return a value representing the temperature of that thermometer. 

You can program a method to return a value too. Just write ```return``` followed by the value you want to return. Here are some examples of return statements returning a string, an integer, and the value of a variable.
```
return "My function ran!";
```
```
return 52;
```
```
return product;
```

## Method Parameters
Method parameters are variables that are set every time a method is run. They are written in the parentheses after the method name. Let's look at an example method that multiplies two numbers, ```a``` and ```b```.
```
int multiply(int a, int b) {
	return (a*b);
}
```
As you can see, we declare the parameters just like variables inside the parentheses. Each parameter is seperated from the previous by a comma. Within the method, we can use the names of these parameters just like variables. When the method is run, these variables will contain whatever values are set in the method call..

To call a method that takes parameters, type the values in the parentheses. Here's how you would use our multiply method to multiply 5 and 12.
```
multiply(5, 12);

```
You can put the method call inside a print statement to print whatever value is returned.
```
System.out.println(multiply(5, 12));
```
Will print
```
60
```

## Activity #1
In this activity, you will write a boolean method ```isEven``` that takes one integer as a parameter and returns true if that integer is even and false if not. You will need to use the ```%```  opperator to determine whether or not the integer is even. If the remainder of a number devided by two, then it is even. You should know that boolean variables can be set to the result of a boolean opperation. For instance:
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
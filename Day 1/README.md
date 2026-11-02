# Java Bootcamp — Day 01

Instructions for compiling and running the six exercises with a `main()` method in each exercise class.

## Requirements

Install a Java Development Kit (JDK), then check in PowerShell:

```powershell
java -version
javac -version
```

Both commands must display a version. After installing Java, restart VS Code and open a new terminal.

## Open the project

Save this README.md in your `BOOTCAMP JAVA` folder, beside the exercise folders.

In PowerShell, open the project folder:

```powershell
cd "C:\Users\hsain\Desktop\Epitech Courses\BOOTCAMP JAVA"
```

Run every command below from this folder. Each source file must contain its matching class and a `public static void main(String[] args)` method. Do not add a `package` declaration for these exercises.

## Exercise 01 — Concatenation

File: `ex_01/Ex01.java`

```powershell
javac ex_01/Ex01.java
java -cp ex_01 Ex01
```

With `myConcat("Hello", "Duke")`, expected output:

```text
Hello Duke
```

The method does not add a newline.

## Exercise 02 — Angry dog

File: `ex_02/Ex02.java`

```powershell
javac ex_02/Ex02.java
java -cp ex_02 Ex02
```

With `System.out.print(getAngryDog(3))`, expected output:

```text
woofwoofwoof
```

The returned string already ends with a newline.

## Exercise 03 — Display a list

File: `ex_03/Ex03.java`

```powershell
javac ex_03/Ex03.java
java -cp ex_03 Ex03
```

With a list containing Volvo, BMW, Ford and Mazda, expected output:

```text
Volvo
BMW
Ford
Mazda
```

## Exercise 04 — Movie selection

File: `ex_04/Ex04.java`

```powershell
javac ex_04/Ex04.java
java -cp ex_04 Ex04
```

With `printMovieFromNbr(23)`, expected output:

```text
The Number 23
```

## Exercise 05 — Variable arguments

File: `ex_05/Ex05.java`

```powershell
javac ex_05/Ex05.java
java -cp ex_05 Ex05
```

With `System.out.println(myGetArgs("Hello", "Duke", "Java"))`, expected output:

```text
[Hello, Duke, Java]
```

## Exercise 06 — Look-and-say sequence

File: `ex_06/Ex06.java`

```powershell
javac ex_06/Ex06.java
java -cp ex_06 Ex06
```

With `sequence(5)`, expected output:

```text
1
11
21
1211
111221
312211
```

Iteration numbering starts at 0, so `sequence(5)` prints six lines. A negative number prints nothing.

## Understanding the commands

| Command | Purpose |
| --- | --- |
| `javac ex_02/Ex02.java` | Compiles the source into `ex_02/Ex02.class`. |
| `java -cp ex_02 Ex02` | Searches for compiled classes in `ex_02` and starts `Ex02.main()`. |

After changing your code, save with **Ctrl + S** and compile again before running it. If compilation fails, fix the error before running: otherwise Java may execute an older compiled version.

## Common errors

### Main method not found

Put this method inside the exercise class, alongside the exercise method:

```java
public static void main(String[] args) {
    // Call the exercise method here.
}
```

### class, interface, enum, or record expected

Check your braces. Calls such as `myConcat("Hello", "Duke");` must be inside a method, not after the closing brace of the class.

### Could not find or load main class

Make sure compilation succeeded, run commands from the project root, and use the exact folder and class names shown above.

### java or javac is not recognized

Check that a JDK is installed and its `bin` folder is included in your Windows PATH. Restart VS Code after installation or PATH changes.

## Submission

These instructions use `main()` inside each exercise file for local testing. For the required submission, remove those test methods and keep the exercise methods with their exact required signatures. The autograder supplies its own testing class.

Commit only the required exercise `.java` files. Do not commit `.class` files or local test classes. Exercise 03 must contain exactly one `for` keyword, including comments.

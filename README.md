# Lab10

## Problem: Work Assignment

Many students in 16ss have registered for the *iShamrock Software Competition*. 

To have a better performance in this competition, we have to organize an effective team and set milestones for the team project.

You are required to design 3 classes:

> #### `Student`
>
> `Student` is a class providing basic information of a student, including his or her name, role in the team, and latest deadline. This class also provides neccessary methods (getter/setter). To simplify this problem, you don't need to design the class and you can use the  `Student.java` provided by TA.
>
> * DO NOT MODIFY ANY CODE IN `Student`.

> #### `Developer`
>
> `Developer` is a class which extends `Student`. You should override `setDeadline()` and `toString()` methods in its parent class. In addtition, as the developer programs in a specific language, you should define a field named `language` and corresponding getter and setter in the `Developer` class.

> #### `Designer`
>
> `Designer` is a class which extends `Student`. You should override `setDeadline()` and `toString()` methods in its parent class.

### Guideline

We use `Designer` as an example to illustrate some key points in this lab.

* Extends

   To implement the inheritance of class, we use keyword `extends` in the definition of a class. Below is an example:

```java
public class Designer extends Student {}
```

* Override

  We can design a method with the same name, return value and argument list in the child class. And we usually use an annotation `@Override` to imply the usage. For example:

  ```java
  @Override
  public String toString() {
  	return this.name + " is a " + this.role;
  }
  ```


* Class `Date`

  The class `Date` represents a specific instant in time, with millisecond precision. We create an instance of `Date` using the following constructor.

  > **Date**(int year, int month, int date)

  For more information, you can click on this [link](https://docs.oracle.com/javase/7/docs/api/java/util/Date.html).

### Tasks

1. Finish the design of `Developer` and `Designer`.

2. Finish the `test.java` to output the information of 5 developers, 2 designers, and a normal student.

   The information should include every field in this class. For example:

   > Jun is a Developer using Java and has a deadline on 2017-01-07.

   You can use a different format or expression, but must cover all the information.

3. * Compare the results of `toString()` in three classes, and explain the differences.
   * Please explain your understanding on inheritance.

> Hint: `toString()` is a method in the class `Object` , which is the parent class of all the classes.

### Upload & Deadline

* Task 1 and 2 should be finished on Tuesday, and uploaded to FTP no later than `11/28/2016 23:59:59 (UTC+8)`.
* Task 3 is a `.txt` file with your student number. Please upload them to FTP no later than `11/29/2016 23:59:59 (UTC+8)`.

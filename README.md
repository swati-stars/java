## DATA TYPES

![Java-Data-Types](https://github.com/user-attachments/assets/3e686815-3c7e-46c6-b729-88de8b59ef07)

## STRING
<ul>
<li>In Java, a string is an object that represents a number of character values. Each letter in the string is a separate character value that makes up the Java string object.</li>
<li>Characters in Java are represented by the char class. Users can write an array of char values that will mean the same thing as a string.</li>
<li>Strings in java are objects backed internally by char array.Since arrays are immutable , strings are immutable as well. Whenever a change to a string is made , an entirely new string is created.</li>
<li>Immutable simply means unmodifiable or unchangeable. Once string object is created its data or state cant be changed but a new string object is created.</li>
</ul>
### Java String Pool
<ul>
<li>A Java String Pool is a place in heap memory where all the strings defined in the program are stored. JVM checks for the presence of the object in the String pool, If String is available in the pool, the same object reference is shared with the variable, else a new object is created.</li>
<li>For example, if I create a string "hello" it is stored in heap memory but after that if I make changes in the same string and write "hello!" , this will be stored in newly created memory location.</li>
<\ul>

  
![String-pool-1](https://github.com/user-attachments/assets/fddd4d3f-8eed-49ba-8d81-b4ae94aef3c4)



## OBJECT ORIENTED PROGRAMMING
OOP'S is an programming paradigram based on the concept of "objects" which contain data in the form of fields 9often known as attribute or properties).and code in the form of procedures often known as methods).


## CLASS and OBJECTS IN JAVA
<ul>
<li>Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.</li>
<li> Objects are the instances of a class that are created to use the attributes and methods of a class. A typical Java program creates many objects, which as you know, interact by invoking methods</li>
</ul>


![images](https://github.com/user-attachments/assets/e4b2a8fc-2324-4602-a45c-3c78f13e31b9)



### METHODS IN JAVA
Methods are declared within a class, and that they are used to perform certain actions.,ethods will access attributes and may modify them too.

## STATIC vs NON-STATIC
<ul>
  <li>A static method is a method that belongs to a class, but it does not belong to an instance of that class and this method can be called without the instance or object of that class</li>
  <li>One does not need to declare an object to access static class methods and attributes.</li>
  <li>. Every method in java defaults to a non-static method without static keyword preceding it. Non-static methods can access any static method and static variable, without creating an instance of the object.</li>
  <li>A static method can only access static data members and static methods of another class or the same class but cannot access non-static methods and variables. Also, a static method can rewrite the values of any static data member.</li>
  <li>A non-static method can access static data members and static methods as well as non-static members and methods of another class or the same class, and also can change the values of any static data member</li>
  <li>The memory of a static method is fixed in the ram, for this reason, we don’t need the object of a class in which the static method is defined to call the static method. To call the method we need to write the class name followed by the name of ` memory of the non-static method is not fixed in the ram, so we need a class object to call a non-static method. To call the method we need to write the name of the method followed by the class object name </li>
</ul>





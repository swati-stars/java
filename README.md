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
  <li>The memory of a static method is fixed in the ram, for this reason, we don’t need the object of a class in which the static method is defined to call the static method. To call the method we need to write the class name followed by the name of the method. The` memory of the non-static method is not fixed in the ram, so we need a class object to call a non-static method. To call the method we need to write the name of the method followed by the class object name </li>
</ul>


## CONSTRUCTOR
<ul>
  <li>A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.</li>
  <li>Every time an object is created using the new() keyword, at least one constructor is called.</li>
  <li>Constructors must have the same name as the class within which it is defined it is not necessary for the method in Java.</li>
  <li>Constructors do not return any type while method(s) have the return type or void if does not return any value.</li>
  <li>Constructors are called only once at the time of Object creation while method(s) can be called any number of times.</li>
  <li>Whenever a constructor is defined whatever arguments passed on to it should be initialised at the time of object declaration otherwise error will occur.</li>
</ul>


## ACCESS MODIFIERS
in Java, Access modifiers help to restrict the scope of a class, constructor, variable, method, or data member. It provides security, accessibility, etc to the user depending upon the access modifier used with the element.
Controls the access level.

![Access-Modifiers-in-Java-1-768 (2)](https://github.com/user-attachments/assets/a56e5c08-b197-4aff-9300-924af1858458)


### DEFAULT
When no access modifier is specified for a class, method, or data member – It is said to be having the default access modifier by default. The data members, classes, or methods that are not declared using any access modifiers i.e. having default access modifiers are accessible only within the same package.


### PUBLIC
The public access modifier is specified using the keyword public. 

The public access modifier has the widest scope among all other access modifiers.
Classes, methods, or data members that are declared as public are accessible from everywhere in the program. There is no restriction on the scope of public data members.


### PRIVATE
The private access modifier is specified using the keyword private. The methods or data members declared as private are accessible only within the class in which they are declared.

Any other class of the same package will not be able to access these members.
Top-level classes or interfaces can not be declared as private because
private means “only visible within the enclosing class”.
protected means “only visible within the enclosing class and any subclasses”
ONe can access these attributes by using or through settoing methods


### PROTECTED


##  NON-ACCESS MODIFIERS
Do not control access level but provide other functionalities
Seven types of Non-Access modifiers are present in Java. They are –static,final,abstract,synchronized,volatilile,transient,native


###  STATIC
That means the static methods or the attributes are a part of the class and not an object. The memory is allocated to such an attribute or method at the time of class loading. The use of a static modifier makes the program more efficient by saving memory. A static field exists across all the class instances, and without creating an object of the class, they can be called.

### FINAL
The final keyword indicates that the specific class cannot be extended or a method cannot be overridden. 

### ABSTRACT
abstract keyword is used to declare a class as partially implemented means an object cannot be created directly from that class. Any subclass needs to be either implement all the methods of the abstract class, or it should also need to be an abstract class. The abstract keyword cannot be used with static, final, or private keywords because they prevent overriding, and we need to override methods in the case of an abstract class.


## INHERITANCE IN JAVA
<ul>
  <li>Java, Inheritance is an important pillar of OOP(Object-Oriented Programming). It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. In Java, Inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class. In addition, you can add new fields and methods to your current class as well.  </li>
  <li>The extends keyword is used for inheritance in Java. Using the extends keyword indicates you are derived from an existing class. In other words, “extends” refers to increased functionality.</li>
  <li>super is used to call a superclass constructor: When a subclass is created, its constructor must call the constructor of its parent class. This is done using the super() keyword, which calls the constructor of the parent class.</li>
</ul>


## INTERFACE IN JAVA
<ul>
  <li>The interface in Java is a mechanism to achieve abstraction. Traditionally, an interface could only have abstract methods (methods without a body) and public, static, and final variables by default.</li>
  <li>interfaces primarily define methods that other classes must implement. Java</li>
  <li>To declare an interface, use the interface keyword. It is used to provide total abstraction. That means all the methods in an interface are declared with an empty body and are public and all fields are public, static, and final by default. A class that implements an interface must implement all the methods declared in the interface. To implement the interface, use the implements keyword while declaring another class.</li>
</ul>



![interfacerelation](https://github.com/user-attachments/assets/d6272004-a5f8-4745-9c0a-57954ddd9ad6)












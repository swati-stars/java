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

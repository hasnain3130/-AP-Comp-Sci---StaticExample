Vocabulary to Know The Above Examples: 
- Class Variables or Methods refer to static methods. It is another way of saying it.
- Static means the variable or function is shared between all instances of that class, not the actual objects themselves. In other words, static essentially means the member is not part of the instance of a class. It is a part of the class itself. Therefore, it does not need a reference to be accessed. 
- The keyword "this" refers to the current object. Thus, if are coding an object's class file, you can use "this" to refer to any of the class members. Look at the "Bullet1" class file for an example. 

Bullets The Source Files Refer To: 
- Instance methods can access instance variables and instance methods directly (Bullet 1)
- Instance methods can access class variables and class methods directly (Bullet 2)
- Class methods can access class variable and class methods directly (Bullet 3)
- Class methods CANNOT access instance variables or instance methods directly; they must use an object reference. (Bullet 4)
- Class methods CANNOT use the "this" keyword. There is no "this". (Bullet 5)

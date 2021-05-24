package com.corejava.OOPs.AbstractVsInterface;

/*
 * Comparison between Interfaces and Abstract Classes

1. An Abstract class is an Incomplete class, whereas an Interface is a pure abstract class. 

2. An Abstract class generally defines common behaviour and attributes that a class inherits, whereas an Interface specifies functionality which a class should have.

3. An Abstract class contains method declarations and definitions, whereas an Interface contains only method declarations.

4. An Abstract class can contain fields which can be static, final, as well as instance fields, where as Interface fields are implicitly final and static.

5. An Abstract class can have a constructor, whereas an Interface cannot have a constructor.

6. An Abstract class is used with extends keyword, whereas an Interface is used with implements keyword.

7. An Abstract class can be extended by more than one class, whereas an Interface can be implemented by more than one class.

8. A class can extend only one abstract class, whereas a class can implement more than one Interface.

9. An Abstract class can be extended by another abstract as well as concrete class, whereas an Interface can be extended by another Interface.

10. A class cannot extend more than one class, whereas an Interface can be used to implement multiple inheritance. 

 */
 interface AbstractVsInterface {

}
interface B extends AbstractVsInterface
{

}
class C implements AbstractVsInterface,B
{
	
}
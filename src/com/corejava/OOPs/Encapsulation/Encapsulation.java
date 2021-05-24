package com.corejava.OOPs.Encapsulation;

public class Encapsulation 
{
	/* Encapsulation:  encapsulation means data hiding.
	 * 
	 * Ex:
	 * Every time you log into your email account( GMail, Yahoo, Hotmail or official 
	 * mail), you have a whole lot of processes taking place in the backend, that
	 * you have no control over. So your password, would probably be retrieved in 
	 * an encyrpted form, verified and only then you are given access. You do not
	 * have any control, over how the password is verified, and this keeps it safe 
	 * from misuse.
	 * 
	 * How to achieve encapsulation?
	 * Make fields/memberVariables private (private can be accessed only within
	 * the same class, hence we are hiding the fields within the class), and 
	 * 
	 * access those private fields via public methods. 
	 * (Public are accessible from everywhere)
	 * 
	 * Advantages of using encapsulation :
	 * Encapsulation prevents other classes to access the class data 
	 * (i.e. preventing access to private fields).
	 * 
	 * Encapsulation allows to modify implemented java code without breaking
	 * others code who have implemented the code.
	 * 
	 * Outside users who are accessing this class don’t know about the private 
	 * fields of class, 
	 * 
	 * Ex:
	 * field may be Integer or  String type, but user won’t have any such 
	 * information.
	 * So, class at any time can change data type of a field and users won’t 
	 * know about it, even they need not to. (This point is related to above 
	 * point)
	 * Class fields could be made read-only or write-only.
	 * 
	 * Encapsulation makes our java code>
	 * maintainable, 
	 * extensible and
	 * flexible.
	 * 
	 * What would happen without encapsulation ?
	 * No encapsulation means fields won’t be private and could be used outside 
	 * class. (EncapsulationTest2.java)
	 * 
	 * What could be impact of not using encapsulation?
	 * Let’s say data type of id was changed from String to Integer, in that 
	 * case compilation error will be generated wherever id has been used, 
	 * because code was written considering id is String not a Integer. 
	 * So, by not using encapsulation we will end up breaking others code.
	 * 
	 * how Encapsulation allows to modify implemented java code without breaking
	 * others code who have implemented the code via program?
	 * 
	 * If id would have been private, other classes would have been accessing id
	 * outside class only via public methods of class. So, in that case if we 
	 * were to change data type of id from String to Integer than to avoid 
	 * breaking of others code we could make relevant changes in setter and 
	 * getter methods.
	 * 
	 * 
	 */

}

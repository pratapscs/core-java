package com.corejava.OOPs.Inheritance;

public class Relations 
{
	/* Association :
	 * Association is a relationship between two objects. 
	 * In other words, association defines the multiplicity between objects. 
	 * You may be aware of one-to-one, one-to-many, many-to-one, many-to-many 
	 * all these words define an association between objects. 
	 * Aggregation is a special form of association. 
	 * Composition is a special form of aggregation.
	 * 
	 * Ex:Let’s take an example of Teacher and Student. Multiple students can 
	 * associate with single teacher and single student can associate with multiple 
	 * teachers, but there is no ownership between the objects and both have their 
	 * own lifecycle. Both can be created and deleted independently.
	 * 
	 * Aggregation:
	 * Aggregation is a special case of association. 
	 * A directional association between objects. 
	 * When an object ‘has-a’ another object, then you have got an aggregation 
	 * between them. Direction between them specified which object contains the 
	 * other object. Aggregation is also called a “Has-a” relationship.
	 * 
	 * Ex:Let’s take an example of Department and teacher. A single teacher can not 
	 * belong to multiple departments, but if we delete the department, the teacher 
	 * object will not be destroyed. We can think about it as a “has-a” relationship.
	 * 
	 * Composition :
	 * Composition is a special case of aggregation. 
	 * In a more specific manner, a restricted aggregation is called composition. 
	 * When an object contains the other object, if the contained object cannot 
	 * exist without the existence of container object, then it is called composition.
	 * 
	 * Ex:Let’s take again an example of relationship between House and Rooms. 
	 * House can contain multiple rooms - there is no independent life of room and 
	 * any room can not belong to two different houses. If we delete the house - 
	 * room will automatically be deleted.
	 * 
	 */

}

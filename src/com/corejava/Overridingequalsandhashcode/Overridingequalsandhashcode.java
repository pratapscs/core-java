package com.corejava.Overridingequalsandhashcode;

public class Overridingequalsandhashcode 
{
	/* 1.Why do we need to override equals and hashcode method?
	 * Equals() and hashCode() are methods of java.lang.Object
	 * 
	 * It’s important to override equals equals() and hashCode() method of 
	 * class if we are want to use class as key in HashMap.
	 * 
	 * If we don’t override equals() and hashCode() method we will be able 
	 * to put object, but we won’t be able to retrieve object.
	 * 
	 * Before understanding the concept of overriding equals() and hashCode() 
	 * method, we must understand what is bucket, Entry, and Entry.next
	 *
	 * 
	 * Bucket is ArrayList of Entry.
	 * Entry is LinkedList which contains information about key, value and next.
	 * Entry.next points to next Entry in LinkedList.
	 *      
	 * Why to override hashcode method?
	 * It helps in finding bucket location, where entry(with key-value pair) will be 
	 * stored .
	 * Entry (of type LinkedList) is stored in bucket (ArrayList). 
	 * 
	 * If, hashCode() method is overridden properly, we will find bucket location 
	 * using hashCode() method, we will obtain Entry on that bucket location, then 
	 * iterate over each and every Entry (by calling Entry.next) and check whether 
	 * new and existing keys are equal or not. If keys are equal replace key-value 
	 * in Entry with new one, else call Entry.next But, now the question comes how to 
	 * check whether two keys are equal or not. So, it’s time to implement equals() method.
	 * 
	 * If, hashcode method is not overridden for same key every time hashCode() method 
	 * is called it might produce different hashcode, there might happen 2 cases 
	 * i.e. when put and get method are called. 
	 * 
	 * Case 1 : when put() method is called-
	 * There might be possibility that same Entry (with key-value pair)  will 
	 * get stored at multiple locations in bucket.
	 * Conclusion> key- value pair may get stored multiple times in HashMap.
	 * 
	 * Case 2 : when get() method is called-
	 * As there is possibility that hashCode() method might return different hashcode 
	 * & rather than searching on bucket location where Entry(with key) exists we might
	 * be searching for key on some other bucket location.
	 * Conclusion>  key existed in HashMap, but still we were not able to locate the 
	 * bucket location in which it was stored.
	 * 
	 * 
	 * Why to override equals method?
	 * Once we have located bucket location in which our Entry (with key-value pair) 
	 * will be stored, Equals method helps us in finding whether new and existing 
	 * keys are equal or not.
	 * 
	 * If we equals method is not overridden - though we will be able to find out 
	 * correct bucket location if hashCode() method is overridden correctly, but 
	 * still if equals method is not overridden, there might happen 2 cases i.e. 
	 * when put and get method are called. 
	 * 
	 * Case 1 : when put() method is called-
	 * we might end up storing new Entry (with new key-value pair) multiple times on 
	 * same bucket location (because of absence of equals method, we don’t have any 
	 * way of comparing key’s), In this case, even if keys are equal, we will keep 
	 * on calling Entry.next until we reach last Entry on that bucket location and 
	 * ultimately we will end up storing new Entry (with new key) again in same bucket 
	 * location. 
	 * Conclusion> key- value pair stored multiple times in HashMap.
	 * 
	 * Case 2 : when get() method is called-
	 * we won’t be able to compare two keys (new key with existing Entry.key) 
	 * and we will call Entry.next and again we won’t be able to compare two keys 
	 * and ultimately when Entry.next is null - we will return false. 
	 * Conclusion>  key existed in HashMap, but still we were not able to retrieve it.
	 * 
	 * So, it’s important to override equals method to check equality of two keys.
	 * 
	 * 
	 * * 2.How do we override equals and hashcode method, write a code to use Employee 
	 * as key in HashMap?
	 * 1)  Check whether obj is null or not.
	 * if(obj==null) //If obj is null, return without comparing obj & Employee class.
	 * 
	 * 2)  check whether  obj is instance of Employee class or not.
	 * if(this.getClass()!=obj.getClass()) //identifies whether obj is instance 
	 * of Employee class or not.
	 * 
	 * 3) Then, type cast obj into employee instance.
	 * Employee emp=(Employee)obj;  //type cast obj into employee instance.
	 * (EmployeeOverride.java)
	 * 
	 * 
	 * * 3.What classes should i prefer to use a key in HashMap?
	 * we should prefer String, Integer, Long, Double, Float, Short and any other 
	 * wrapper class. Reason behind using them as a key is that they override equals() 
	 * and hashCode() method, we need not to write any explicit code for overriding 
	 * equals() and hashCode() method. 
	 * (StringInMap.java)
	 * 
	 * 
	 * 4.If two objects have same hashcode, are they always equal?
	 * No, It’s not necessary that object’s having same hashcode are always equal. 
	 * Because same hashcode means object are stored on same bucket location, 
	 * as key/object in bucket is stored in Entry(Linked List), key/object’s might be 
	 * stored on Entry.next (i.e. on some different entry)
	 * 
	 * 
	 * 5.If two objects equals() method return true, do objects always have same hashcode?
	 * Yes, two objects can return true only if they are stored on same bucket location.
	 * First, hashCode() method must have returned same hashcode for both objects, 
	 * than on that bucket location’s Entry key.equals()  is called, which returns 
	 * true to confirm objects/keys are equal.
	 * So, if object’s equals return true, they always have same hashcode.
	 * 
	 * 
	 * 6.Can two unequal objects have same hashcode?
	 * Yes, two unequal objects can have same hashcode.
	 * 
	 * 
	 * 7.What is difference between using instanceOf operator and getClass() 
	 * in equals method?
	 * If we use instanceOf it will return true for comparing current class 
	 * with its subclass as well,but getClass() will return true only if exactly 
	 * same class is compared. Comparison with any subclass will return false.
	 * 
	 * 
	 * * 8.Can overriding of hashcode() method cause any performance issues?
	 * Improper implementation of hashCode() can cause performance issues, because 
	 * in that most of the key-value pairs will be stored on same bucket location 
	 * and unnecessary time will be consumed while fetching value corresponding to key.
	 * 
	 * 
	 * *9.How we can implement HashMap for using Integer as key? 
	 * Initially, we have bucket of capacity=4. (all indexes of bucket i.e. 
	 * 0,1,2,3 are pointing to null).
	 * Note: Initial capacity provided by Java Api is different
	 * HashMapCustomApp.java
	 * 
	 * 
	 * 10.Implement custom HashMap to put, get, remove Employee object?
	 * HashMapCustomEmp.java
	 * 
	 *  
	 */

}

package com.corejava.SerializationDeserialization;

public class SerializationInterviewQuestions 
{
	/* 1) What is Serialization in java?
	 * Serialization is process of converting object into byte stream. 
	 * Serialized object (byte stream) can be:
	 * >Transferred over network.
	 * >Persisted/saved into file.
	 * >Persisted/saved into database.
	 * Once, object have have been transferred over network or persisted 
	 * in file or in database, we could deserialize the object and retain 
	 * its state as it is in which it was serialized.
	 * 
	 * 
	 * 2)How do we Serialize object, write a program to serialize and 
	 * deSerialize object and persist it in file?
	 * In order to serialize object our class needs to implement 
	 * java.io.Serializable interface. Serializable interface is Marker interface 
	 * i.e. it does not have any methods of its own, but it tells Jvm that object 
	 * has to converted into byte stream.
	 * 
	 * SERIALIZATION>
	 * Create object of ObjectOutput and give it’s reference variable name oout 
	 * and call writeObject() method and pass our employee object as parameter 
	 * [oout.writeObject(object1)]
	 * 
	 * OutputStream fout = new FileOutputStream("ser.txt");
	 * ObjectOutput oout = new ObjectOutputStream(fout);
	 * System.out.println("Serialization process has started, serializing employee objects...");
	 * oout.writeObject(object1);
	 * 
	 * DESERIALIZATION>
	 * Create object of ObjectInput and give it’s reference variable name oin 
	 * and call readObject() method [oin.readObject()]
	 * 
	 * InputStream fin=new FileInputStream("ser.txt");
	 * ObjectInput oin=new ObjectInputStream(fin);
	 * System.out.println("DeSerialization process has started, displaying employee objects...");
	 * Employee emp;
	 * emp=(Employee)oin.readObject();
	 * 1) What is the difference between Serializable and Externalizable interface 
	 * in Java?
	 * 1. In case of Serializable, default serialization process is used.
	 * while in case of Externalizable custom Serialization process is used 
	 * which is implemented by application.
	 * 2. JVM gives call back to readExternel() and writeExternal() of j
	 * ava.io.Externalizalbe interface for restoring and writing objects 
	 * into persistence.
	 * 3. Externalizable interface provides complete control of serialization 
	 * process to application.
	 * 4. readExternal() and writeExternal() supersede any specific implementation
	 * of writeObject and readObject methods.
	 * 
	 * Though Externalizable provides complete control, it also presents challenges
	 * to serialize super type state and take care of default values in case of 
	 * transient variable and static variables in Java. 
	 * If used correctly Externalizable interface can improve performance of
	 * serialization process.
	 * 
	 * 2) How many methods Serializable has? If no method then what is the purpose 
	 * of Serializable interface?
	 * 
	 * Serializable interface exists in java.io package and forms core of java 
	 * serialization mechanism. It doesn't have any method and also called Marker
	 * Interface in Java. When your class implements java.io.Serializable interface
	 * it becomes Serializable in Java and gives compiler an indication that use 
	 * Java Serialization mechanism to serialize this object.
	 * 
	 * 3) What is serialVersionUID? What would happen if you don't define this?
	 * 
	 * 
	 * 
	 * 
	 * 4) While serializing you want some of the members not to serialize? 
	 * How do you achieve it?
	 * if you don't want any field to be part of object's state then declare 
	 * it either static or transient based on your need and it will not be 
	 * included during Java serialization process.
	 * 
	 * 
	 * 5) What will happen if one of the members in the class doesn't implement 
	 * Serializable interface?
	 * If you try to serialize an object of a class which implements Serializable, 
	 * but the object includes a reference to an non- Serializable class then a 
	 * ‘NotSerializableException’ will be thrown at runtime.
	 * 
	 * 
	 * 6) If a class is Serializable but its super class in not, what will be 
	 * the state of the instance variables inherited from super class after
	 * deserialization?
	 * The values of the instance variables inherited from superclass will be reset 
	 * to the values they were given during the original construction of the object 
	 * as the non-serializable super-class constructor will run.
	 * 
  public class ChildSerializable extends ParentNonSerializable implements Serializable {
  private static final long serialVersionUID = 1L; 
  String color; 
  ChildSerializable() { 
    this.noOfWheels = 8; 
    this.color = "blue"; 
  } 
}

public class SubSerialSuperNotSerial { 
  public static void main(String [] args)  { 
    ChildSerializable c = new ChildSerializable(); 
      System.out.println("Before : -  " +  c.noOfWheels + " "+ c.color); 
    try { 
      FileOutputStream fs = new FileOutputStream("superNotSerail.ser"); 
      ObjectOutputStream os = new ObjectOutputStream(fs); 
      os.writeObject(c); 
      os.close(); 
    } catch (Exception e) {  e.printStackTrace(); } 
    try { 
      FileInputStream fis = new FileInputStream("superNotSerail.ser"); 
      ObjectInputStream ois = new ObjectInputStream(fis); 
      c = (ChildSerializable) ois.readObject(); 
      ois.close(); 
    } catch (Exception e) {  e.printStackTrace(); } 
      System.out.println("After :-  " +  c.noOfWheels + " "+ c.color); 
  } 
} 

	 * The instance variable ‘noOfWheels’ is inherited from superclass which is 
	 * not serializable. Therefore while restoring it the non-serializable superclass
	 * constructor runs and its value is set to 8 and is not same as the value 
	 * saved during serialization which is 4. 
	 * 
	 * 
	 * 7) Can you Customize Serialization process or can you override 
	 * default Serialization process in Java?
	 * yes,
	 * serializing an object ObjectOutputStream.writeObject (saveThisobject) is
	 * invoked and for reading object ObjectInputStream.readObject() is invoked 
	 * but there is one more thing which Java Virtual Machine provides you is to
	 * define these two method in your class. If you define these two methods 
	 * in your class then JVM will invoke these two methods instead of applying 
	 * default serialization mechanism. You can customize behavior of object
	 * serialization and deserialization here by doing any kind of pre or post
	 * processing task. Important point to note is making these methods private 
	 * to avoid being inherited, overridden or overloaded. Since only Java Virtual 
	 * Machine can call private method integrity of your class will remain and 
	 * Java Serialization will work as normal.
	 * 
	 * 
	 * 8)Suppose super class of a new class implement Serializable interface,
	 *  how can you avoid new class to being serialized?
	 *  
	 *  If Super Class of a Class already implements Serializable interface 
	 *  in Java then its already Serializable in Java, since you can not 
	 *  unimplemented an interface its not really possible to make it Non 
	 *  Serializable class but yes there is a way to avoid serialization of 
	 *  new class. To avoid Java serialization you need to implement writeObject()
	 *  and readObject() method in your Class and need to throw 
	 *  NotSerializableException from those method.
	 *  
	 * 
	 * 9) Which methods are used during Serialization and DeSerialization process 
	 * in Java?
	 * 
	 * readObject(), writeObject(), readExternal() and writeExternal() or not. 
	 * Java Serialization is done by java.io.ObjectOutputStream class. 
	 * That class is a filter stream which is wrapped around a lower-level byte 
	 * stream to handle the serialization mechanism. To store any object via 
	 * serialization mechanism we call ObjectOutputStream.writeObject(saveThisobject)
	 * and to deserialize that object we call ObjectInputStream.readObject() method.
	 * Call to writeObject() method trigger serialization process in java. 
	 * one important thing to note about readObject() method is that it is used 
	 * to read bytes from the persistence and to create object from those bytes
	 * and its return an Object which needs to be type cast to correct type.
	 * 
	 * 
	 * 10) Suppose you have a class which you serialized it and stored in 
	 * persistence and later modified that class to add a new field. 
	 * What will happen if you deserialize the object already serialized?
	 * 
	 * 
	 * 
	 * 11)What are the compatible changes and incompatible changes in Java 
	 * Serialization Mechanism?
	 * 
	 * 
	 * 12) Can we transfer a Serialized object vie network?
	 * Yes,you can transfer a Serialized object via network because Java 
	 * serialized object remains in form of bytes which can be transmitter via network. 
	 * You can also store serialized object in Disk or database as 
	 * Blob(binary large object)
	 *
	 *
	 * 13) Which kind of variables is not serialized during Java Serialization?
	 * static and transient variables
	 * 
	 * 
	 * 14)Are primitive types part of serialization process? 
	 * Yes, primitive types are part of serialization process.
	 * SerializePrimitiveTypes.java
	 * 
	 * 
	 * 15)How can subclass avoid Serialization if its superClass has implemented 
	 * Serialization interface ?
	 * If superClass has implemented Serializable that means subclass is also 
	 * Serializable (as subclass always inherits all features from its parent class), 
	 * for avoiding Serialization in sub-class we can define writeObject() method and throw NotSerializableException().
	 * 
	 * private void writeObject(ObjectOutputStream os) throws NotSerializableException {
        throw new NotSerializableException("This class cannot be Serialized");
        }
     *SerializeDeserialize.java
     *
     *
     *
     *16)How you can avoid Deserialization process creating another instance 
     *of Singleton class?
     *We can simply use readResove() method to return same instance of class, rather than 
     *creating a new one.
     *
     *Defining readResolve() method ensures that we don't break singleton pattern during
     *DeSerialization process.
     *private Object readResolve() throws ObjectStreamException {
       return INSTANCE;
       }
     *
     *Also define readObject() method, rather than creating new instance, assign current 
     *object to INSTANCE like done below :
      private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException{
        ois.defaultReadObject();
        synchronized (SingletonClass.class) {
         if (INSTANCE == null) {
               INSTANCE = this;
         }
        }
  }
     *SingletonClass1.java
     *
     *
     *17)Is constructor of super class called during DeSerialization process 
     * of subclass?
     *  It is depends on whether our superclass has implemented Serializable or not.
     *  If superclass has implemented Serializable - constructor is not called during DeSerialization process.
     *  If superclass has not implemented Serializable - constructor is called during DeSerialization process.
	 *  
	 *  SerializeDeser1.java
	 *  
	 * 18)
	 *  
	 *   
	 * 
	 */

}

package com.corejava.SerializationDeserialization;

//import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialzationDemo 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)  throws Exception
	{
		Save obj=new Save();
		obj.i = 4;
		
		//Save obj1=new Save();
		
		File f=new File("Obj.txt");
		FileOutputStream fos=new FileOutputStream(f);
		//DataOutputStream dos=new DataOutputStream(fos);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(obj);
		
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Save obj1=(Save) ois.readObject();
		
		System.out.println("Value of obj1 "+obj1.i);
		
	}

}
@SuppressWarnings("serial")
class Save implements Serializable //serializable is a marker interface
           //java.io.NonSerializableException main reason is java is secure language
           //when saving the object it will by default not allowed.by default in java
           //it will not allow store the object to make it allowed to make it as
           // marker interface
{
	int i;
	
}

package com.corejava.DataStructures.Map.HashMap;

class Employee {
    private String id;
    private String name;
    
    /**
     * Employee constructor
     */
    public Employee(String id, String name) { // constructor
           this.id = id;
           this.name = name;
    }
 
    @Override
    public String toString() {
           return "Employee[id=" + id + ", name=" + name + "] ";
    }
 
 
    @Override
    public boolean equals(Object o){
           
           if(o==null)
                  return false;
           if(this.getClass()!=o.getClass())
                  return false;
    
           Employee e=(Employee)o;
           return e.id.equals(this.id) && e.name.equals(this.name);          
    }
           
    @Override
    public int hashCode(){
           return id.hashCode() + name.hashCode();      
    }
 
}
 /**
 * This class provides custom implementation of HashMap(without using java api's)- 
 * which allows us to store data in key-value pair form.
 * insertion order of key-value pairs is not maintained.
 * @param <K>
 * @param <V>
 */
class HashMapCustom1<K, V> 
{
     
     private Entry<K,V>[] table;   //Array of Entry.
     private int capacity= 4;  //Initial capacity of HashMap
     
     
     static class Entry<K, V> 
     {
         K key;
         V value;
         Entry<K,V> next;
     
         public Entry(K key, V value, Entry<K,V> next){
             this.key = key;
             this.value = value;
             this.next = next;
         }
     }
     
 
    @SuppressWarnings("unchecked")
    public HashMapCustom1(){
       table = new Entry[capacity];
    }
 
     /**
     * Method allows you put key-value pair in HashMapCustom.
     * If the map already contains a mapping for the key, the old value is replaced.
     * Note: method does not allows you to put null key thought it allows null values.
     * Implementation allows you to put custom objects as a key as well.
     * Key Features: implementation provides you with following features:-
     *     >provide complete functionality how to override equals method.
     *  >provide complete functionality how to override hashCode method.
     * @param newKey
     * @param data
     */
    public void put(K newKey, V data){
       if(newKey==null)
           return;    //does not allow to store null.
      
       int hash=hash(newKey);
       Entry<K,V> newEntry = new Entry<K,V>(newKey, data, null);
      
        if(table[hash] == null){
         table[hash] = newEntry;
        }else{
           Entry<K,V> previous = null;
           Entry<K,V> current = table[hash];
           
           while(current != null){ //we have reached last entry of bucket.
           if(current.key.equals(newKey)){                  
               if(previous==null){  //node has to be insert on first of bucket.
                     newEntry.next=current.next;
                     table[hash]=newEntry;
                     return;
               }
               else{
               newEntry.next=current.next;
               previous.next=newEntry;
               return;
               }
           }
           previous=current;
             current = current.next;
         }
         previous.next = newEntry;
        }
    }
 
    /**
     * Method returns value corresponding to key.
     * @param key
     */
    public V get(K key){
        int hash = hash(key);
        if(table[hash] == null){
         return null;
        }else{
         Entry<K,V> temp = table[hash];
         while(temp!= null){
             if(temp.key.equals(key))
                 return temp.value;
             temp = temp.next; //return value corresponding to key.
         }         
         return null;   //returns null if key is not found.
        }
    }
 
 
    /**
     * Method removes key-value pair from HashMapCustom.
     * @param key
     */
    public boolean remove(K deleteKey){
       
       int hash=hash(deleteKey);
              
      if(table[hash] == null){
            return false;
      }else{
        Entry<K,V> previous = null;
        Entry<K,V> current = table[hash];
        
        while(current != null){ //we have reached last entry node of bucket.
           if(current.key.equals(deleteKey)){               
               if(previous==null){  //delete first entry node.
                     table[hash]=table[hash].next;
                        return true;
               }
               else{
                     previous.next=current.next;
                   return true;
               }
           }
           previous=current;
             current = current.next;
          }
        return false;
      }
    
    }
  
    /**
     * Method displays all key-value pairs present in HashMapCustom.,
     * insertion order is not guaranteed, for maintaining insertion order refer LinkedHashMapCustom.
     * @param key
     */
    public void display(){
       
       for(int i=0;i<capacity;i++){
           if(table[i]!=null){
                  Entry<K, V> entry=table[i];
                  while(entry!=null){
                        System.out.print("{"+entry.key+"="+entry.value+"}" +"   ");
                        entry=entry.next;
                  }
           }
       }             
    
    }
    /**
     * Method implements hashing functionality, which helps in finding the appropriate bucket location to store our data.
     * This is very important method, as performance of HashMapCustom is very much dependent on  this method's implementation.
     * @param key
     */
    private int hash(K key){
        return Math.abs(key.hashCode()) % capacity;
    }
 
}
/**
 * Main class- to test HashMap functionality.
 */
public class HashMapCustomEmp {
     
    public static void main(String[] args) {
 
       HashMapCustom1<Employee, Integer> hashMapCustom = new HashMapCustom1<Employee, Integer>();
       hashMapCustom.put(new Employee("10", "sam"), 12);
       hashMapCustom.put(new Employee("21", "amy"), 121);
       hashMapCustom.put(new Employee("31", "rob"), 151);
       hashMapCustom.put(new Employee("41", "sam"), 15);
       hashMapCustom.put(new Employee("42", "wil"), 89);
      
           System.out.println("Display values corresponding to keys>");
           System.out.println("value corresponding to employee with id=21 & name='amy' : "+hashMapCustom.get(new Employee("21", "amy")));
           System.out.println("value corresponding to employee with id=51 & name='pat' : "+hashMapCustom.get(new Employee("51", "pat")));
           
        System.out.print("Displaying : ");
        hashMapCustom.display();
       
        System.out.println("\n\nvalue corresponding to employee with id=21 & name='amy' removed: "+hashMapCustom.remove(new Employee("21", "amy")));
        System.out.println("value corresponding to employee with id=51 & name='pat' removed: "+hashMapCustom.remove(new Employee("51", "pat")));
           
           System.out.print("Displaying : ");
        hashMapCustom.display();
 
   
    }
}
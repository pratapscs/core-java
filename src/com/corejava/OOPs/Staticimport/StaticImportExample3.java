package com.corejava.OOPs.Staticimport;

import static com.corejava.OOPs.Staticimport.OperationClass1.add;      //static import in java
import static com.corejava.OOPs.Staticimport.OperationClass1.subtract; //static import in java

class StaticImportExample3
{
    public static void main(String[] args) {
           add(3, 2);
           subtract(3, 2);
    }
}
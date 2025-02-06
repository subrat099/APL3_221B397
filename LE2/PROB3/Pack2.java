// File: Pack2.java
package com.jiet;

import com.juet.Pack1;  // Importing Pack1 class

public class Pack2 extends Pack1 {
    public static void main(String[] args) {
        // Creating an instance of Pack2
        Pack2 obj = new Pack2();
        
        // Calling the inherited protected method from Pack1
        obj.display();
    }
}

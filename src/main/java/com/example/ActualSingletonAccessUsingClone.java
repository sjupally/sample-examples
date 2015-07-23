package com.example;

public class ActualSingletonAccessUsingClone {
    public static void main(String args[]) throws Exception {
        
        ActualSingletonDemo obj = ActualSingletonDemo.getInstance();
        System.out.println("The first instance object is-"+obj);
        
        ActualSingletonDemo clone = (ActualSingletonDemo) obj.clone();
        System.out.println("The clone instance object is-"+clone);
    }
}

package com.example;

import java.io.Serializable;

public final class ActualSingletonDemo implements Serializable {

    /**
     * Added a serial version id, Reason - Suppose our class structure is changed after
     * serialization then when we will try to de-serialize, it will through
     * InvalidClassException. So it will be good to declare a serialVersionUID.
     * 
     */
    private static final long serialVersionUID = 3119105548371608200L;

    private String name = "GAURAV";

    /**
     * Volatile keyword in Java is used as an indicator to Thread that do not cache value of this variable and always read it from 
     * main memory. If a variable is not shared between multiple threads no need to use volatile keyword with that variable.
     * Another effect is the use of memory that is local to a thread, so that changes aren't immediately visible to all other threads.
     * The consequence is that other threads can see inconsistent states. volatile keyword is a kind of tool to control these effects. 
     */
    
    private static volatile ActualSingletonDemo singleton = null;

    /**
     * IllegalStateException is thrown in order to prevent from instance
     * creation Using reflection, as private members can be accessed Using
     * reflection.
     */
    private ActualSingletonDemo() {
        if (singleton != null) {
            throw new IllegalStateException(
                    "Singleton instance already created");
        }

    }

    /**
     * ************* Single Check for instance creation ****************
     * public static ActualSingletonDemo getInstance() 
     * { 
     *     if (singleton == null) 
     *     { 
     *         synchronized (ActualSingletonDemo.class) 
     *             { 
     *             singleton = new ActualSingletonDemo(); 
     *             } 
     *         }
     *         return singleton; 
     *     }
     */

    /**
     * In the above Single Checking for instance creation, Assume there are two
     * threads Thread1 and Thread2. Both will come to create instance and
     * execute "singleton==null", now both threads have identified instance
     * variable to null thus assume they must created an instance. They
     * sequentially goes to synchronized block and create the instances. At the
     * end, we have two instances in our application. This error can be solved
     * using double-checked locking. This principle tells us to recheck the
     * instance variable again in synchronized block in the given below way:
     */
    public static ActualSingletonDemo getInstance() {
        if (singleton == null) {
            synchronized (ActualSingletonDemo.class) {
				// Double check
                if (singleton == null) {
                    singleton = new ActualSingletonDemo();
                }
            }
        }
        return singleton;
    }

    /**
     * Preventing of another instance creation using clone() method. Suppose I
     * am not overriding clone method here. Then we can't create clone of this
     * class. Suppose my singleton class is extending a class which is
     * supporting cloning then using clone we can create an another instance of
     * this class, then the singleton rule is violated. So it's necessary to
     * override this clone() method.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(
                "Cloning for this class is not allowed");
    }

    /**
     * This will help not to create another instance when we will try to
     * de-serialize the class. Because for distributed application it is
     * frequently required to serialize the objects in file system, only to read
     * them later whenever required. Note:- de-serialization always creates a
     * new instance. So it's better approach to include the readResolve() method
     * in this class. This method will be invoked when we will de-serialize the
     * object. Inside this method, we must return the existing instance to
     * ensure single instance through out the application.
     */
    protected Object readResolve() {
        return singleton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
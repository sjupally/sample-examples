package com.example;

import java.io.File;

public class DisplayAllDrivesInSystem {
    private String accessPrivateVariableTest = "Welcome Gaurav";    
        // We will acess this variable outside this class.
    public static void visitAllFiles(File dir) {
        if (dir.isDirectory()) {
          String[] children = dir.list();
          for (int i = 0; i < children.length; i++) {
            visitAllFiles(new File(dir, children[i]));
          }
        } else {
          System.out.println(dir);
        }
      }
    public static void main(String args[]){
        File dir = new File("C://Tomcat 5.5");
        File[] drives = File.listRoots();
        for(File i : drives){
                    System.out.println("Available Drives are-> "+i);
        }
        visitAllFiles(dir);
    }
}
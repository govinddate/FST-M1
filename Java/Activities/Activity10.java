package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("Vidhya");
        hs.add("Bala");
        hs.add("keerthi");
        hs.add("Jothi");
        hs.add("Anya");
        hs.add("Ramya");
        
        
        System.out.println("Original HashSet: " + hs);        
       
        System.out.println("Size of HashSet: " + hs.size());
    
        System.out.println("Removing A from HashSet: " + hs.remove("Jothi"));
       
        if(hs.remove("Z")) {
        	System.out.println("Z removed from the Set");
        } else {
        	System.out.println("Z is not present in the Set");
        }
        
        
        System.out.println("Checking if Anya is present: " + hs.contains("Anya"));
    
        System.out.println("Updated HashSet: " + hs);
    }
}
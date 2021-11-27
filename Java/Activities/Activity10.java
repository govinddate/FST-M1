package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("asd");
        hs.add("dfgdfgdfg");
        hs.add("gfhgh");
        hs.add("dffg");
        hs.add("wer");
        hs.add("ytyy");
        
        
        System.out.println("Original HashSet: " + hs);        
       
        System.out.println("Size of HashSet: " + hs.size());
    
        System.out.println("Removing A from HashSet: " + hs.remove("asd"));
       
        if(hs.remove("e")) {
        	System.out.println("Z removed from the Set");
        } else {
        	System.out.println("Z is not present in the Set");
        }
        
        
        System.out.println("Checking if ytyy is present: " + hs.contains("ytyy"));
    
        System.out.println("Updated HashSet: " + hs);
    }
}

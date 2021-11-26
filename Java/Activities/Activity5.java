package Activities;

public class Activity5 extends Book{
    
    public static void main(String [] args) {
       
        String title = "Hover Car Racer";
      
        Activity5 newNovel = new Activity5();
        
        newNovel.setTitle(" A Monk who sold his ferrari");
        
        
        System.out.println("The title is: " + newNovel.getTitle());
    }
}
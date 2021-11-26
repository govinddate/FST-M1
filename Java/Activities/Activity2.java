package Activities;

public class Activity2 {
	
    public static void main(String[] args) {
        
    	int result = 0;
    	
        int[] nums = {10, 77, 10, 54, -11, 10};
        
        for (int i: nums) {
        	if (i==10) {
        		result = result +10;
        		
        	}
        }
        
       System.out.println("Sum is:" +result);
    }
}
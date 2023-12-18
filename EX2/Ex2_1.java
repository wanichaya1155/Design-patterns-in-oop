import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Ex2_1 {
    public static final int MAX = 5;

    public static List<Integer> inputfromuser(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 5 valid integers in the range [0, 10]");
        List<Integer> nums = new ArrayList<>();

        while(nums.size() < MAX) {

            String s = inp.nextLine();
                
            if( checkinput(s) == false){
                continue;
            }
            int num = Integer.parseInt(s);
                
            if ( checkranges(num) == false){
                continue;
            }
            nums.add(num);
        }
        inp.close();
        
        return nums;
        

    }
    public static boolean checkinput(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        
        }
    }

    public static boolean checkranges(int num){
        if(num<0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }else{
            return true;
        }
        
    }
    public static void arraysort(List<Integer> nums){
        Collections.sort(nums);
    }
    public static void arrayprint(List<Integer> nums){
        for(int num : nums)
            System.out.print(num+" ");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");     
        List<Integer> nums = inputfromuser();
        arraysort(nums);
        arrayprint(nums);
            
    }
}
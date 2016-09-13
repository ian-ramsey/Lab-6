
/**
 * Write a description of class Loop2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Loop2
{
    int[] nums = new int [100];
    public Loop2(){
    
    }
    public void loadArray(){
        for (int i=0;i<100;i++)
            nums[i] = (int)(Math.random()*100+1);
    }
    public void sortArray(){
        Arrays.sort(nums);
    }
    public void printArray(){
        for (int i=0;i<100;i++){
            if (i%10==0)
            System.out.println();
            System.out.print("\t" + nums[i]);
        }
    }
    public void avg(){
        int sum = 0;
        for (int i=0;i<100;i++){
            sum += nums[i];
        }
        System.out.println("\n The average is " + sum/100.0);
    }
    public void mode(){
        int mode = 0;
        int total = 0;
        for (int i=0;i<101;i++){
            int sum = 0;
            for (int k=0;k<100;k++){
                if (i==nums[k])
                    sum++;
            }
            if (sum>=total){
                total = sum;
                mode = i;
            }
        }
        System.out.println(" The mode is " + mode);
    
    }
    public void median(){
        System.out.println(" The median is " + (nums[49]+nums[50])/2);
    }
}

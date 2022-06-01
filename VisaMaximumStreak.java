import java.util.*;
public class Main
{
	 public static void main(String [] args) {
        String[] arr = {"YYY","YYY", "XYY"};
        System.out.println(maxStreak(arr));
    }

    private static int maxStreak(String[] arr){
        StringBuffer maxAttendance = new StringBuffer();

        for(int i=0; i<arr[0].length();i++){
            maxAttendance.append("Y");
        }
        int streak  = 0;
        int maxStreak = 0;
        for(String s : arr){
            if(s.equals(maxAttendance.toString())){
                streak++;
                maxStreak = Math.max(streak,maxStreak);
            }else{
                streak = 0;
            }
        }
        return maxStreak;
    }
}
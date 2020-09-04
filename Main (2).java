//find ones in a given range//
import java.util.*;
public class Main { 
    static void toprintNumbers(int start,int n, int x) 
    { 
          int count=0;
        String st = "" + x; 
        char ch = st.charAt(0); 
        for (int i = start; i <= n; i++) { 
            st = ""; 
            st = st +i;
            if (i == x || st.indexOf(ch) >= 0)
                count++;
        } 
         System.out.print(count);
    } 

    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int start=sc.nextInt();
        int n = sc.nextInt();
        int x = 1; 
        toprintNumbers(start,n, x); 
    } 
}
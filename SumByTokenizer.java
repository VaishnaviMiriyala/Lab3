package m7.task3;
import java.util.*;
public class SumByTokenizer {
	public static void main(String[] args) {
		int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers as String");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens()) {
        	int i = Integer.parseInt(st.nextToken());
        	System.out.println(i);
        	sum += i;	
        }
        System.out.println("The sum is: "+sum);
        sc.close();
	}
        
}

package m7.task3;
import java.util.Scanner;
public class MirrorString{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		MirrorString ms = new MirrorString();
		System.out.println("Enter the String");
		StringBuffer str = new StringBuffer(sc.nextLine());
		sc.close();
		System.out.println(str+"|"+ms.getImage(str));
	}
	public StringBuffer getImage(StringBuffer str1) {
		str1.reverse();
		return str1;
	}
	
}
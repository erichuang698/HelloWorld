import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj=new Scanner(System.in);
		String A=myobj.nextLine();
	//	String A="abca"; This is test. This is Test
		String B=A.replace("a","b");

		String[] in={"0", "1", "2", "3"};
		for (int i=3; i>=0; i--) {
			System.out.print(in[i]+" ");
		}

      System.out.println(B);
	}

}

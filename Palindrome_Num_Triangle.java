import java.util.Scanner;
// Enter Number: 4
//     1
//    121
//   12321
//  1234321

public class Palindrome_Num_Triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number: ");

		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			//for printing space
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			//for printing ascending triangle
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			//for printing descending triangle
			for(int m=i-1;m>=1;m--) {
				System.out.print(m);
			}
			System.out.println();
		}
	}
}

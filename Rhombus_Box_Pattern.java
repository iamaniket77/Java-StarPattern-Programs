import java.util.Scanner;
// Enter Number: 4
//  * * * * 
//   * * * * 
//    * * * * 
//     * * * * 

public class Rhombus_Box_Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			//for printing space
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			//for printing rhombus
			for(int k=1;k<=n;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;
//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 

public class NumTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		
		
		for(int i=1;i<=a;i++) {
			for(int j=a;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

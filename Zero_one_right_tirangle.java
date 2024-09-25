import java.util.Scanner;
// Enter Number: 4
// 1
// 01
// 101
// 0101
// 10101

public class Zero_one_right_tirangle {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}

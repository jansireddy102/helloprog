
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Customer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] customer=new String[5][3];;
		Scanner sc=new Scanner(System.in);
		Customer obj=new Customer();
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				customer[i][j]=sc.nextLine();
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) {
				int a=Integer.parseInt(customer[i][0]);
				int b=Integer.parseInt(customer[j][0]);
				if (a>b) {
					for(int k=0;k<3;k++) {
						String t=customer[i][k];
						customer[i][k]=customer[j][k];
						customer[j][k]=t;
					}
				}
			}
			
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(customer[i][j]);
				
			}
		}
	}

}

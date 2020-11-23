import java.util.*;
public class weird{
	public static void main(String args[]){
		long n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextLong();
		while(n!=0){
			System.out.print(n + " ");
			if(n==1)
				break;
			if(n%2==0)
				n/=2;
			else
				n=(n*3)+1;
		}
		System.out.print("\n");

	}
}
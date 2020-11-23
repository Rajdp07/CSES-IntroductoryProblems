import java.io.*;
public class Repetation{
	public static void main(String args[])throws IOException{
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
		int count=1,res=1;
		for(int i=1;i<str.length;i++){
			if(str[i]==str[i-1])
				count++;
			else
				count=1;
			if(res<count)
				res=count;
		}
		System.out.println(res);
	}
}
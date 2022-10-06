
import java.util.Random;
import java.util.random.RandomGenerator;

public class Passgenv2final{
public static void main(String[] args){

	Random random = new Random();
	
	for(int i=0;i<=5;i++) {
		
		
		String s="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int x = random.nextInt(s.length());
		System.out.print(s.charAt(x));
			
			

	}
	

for(int i1=0;i1<=2;i1++) {
		
		
		String s1="1234567890";
		int x1 = random.nextInt(s1.length());
		System.out.print(s1.charAt(x1));
		
 
}

for(int i2=1;i2==1;i2++) {
	
	
	String s2="!@#$^&_+-";
	int x2 = random.nextInt(s2.length());
	System.out.print(s2.charAt(x2));
	
}


}}

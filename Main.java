package recursiveIleUsAlma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Hangi sayýnýn üssü alýncak: ");		
		int base=scanner.nextInt();
		System.out.print("Hangi sayýya göre üssü alýncak: ");
		int power=scanner.nextInt();
		
		
		System.out.println("Ýki sayýnýn üssü: "+power(base, power));
	}

	static int power(int base,int power) {
		
		if(power==0) 
			return 1;	
		
		return base*=power(base,power-1);
		
	}

}

package recursiveIleUsAlma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Hangi say�n�n �ss� al�ncak: ");		
		int base=scanner.nextInt();
		System.out.print("Hangi say�ya g�re �ss� al�ncak: ");
		int power=scanner.nextInt();
		
		
		System.out.println("�ki say�n�n �ss�: "+power(base, power));
	}

	static int power(int base,int power) {
		
		if(power==0) 
			return 1;	
		
		return base*=power(base,power-1);
		
	}

}

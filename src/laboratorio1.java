import java.util.Scanner;
import java.util.Random;

public class laboratorio1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Random pc =new Random();
		int usu�rio1;
		int usu�rio2;
		int computador;
		
		System.out.println("usu�rio1 fa�a sua jogada");
		usu�rio1 = sc.nextInt();
		
		System.out.println(" usu�rio2 fa�a sua jogada");
		
		
		usu�rio2 = sc.nextInt();
		//computador = pc.nextInt(3)+1;
		

		if(usu�rio1 == usu�rio2) {
		//	if(usu�rio1 == computador) {
			System.out.println("enpate");
		}
		else if((usu�rio1- usu�rio2)== -1 || (usu�rio1 - usu�rio2)== 2) {
			System.out.println("usu�rio1 vencedor");
			
	}
		else { 
			System.out.println("usu�rio2 vencedor");
		}
	
	}
}
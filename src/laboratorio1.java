import java.util.Scanner;
import java.util.Random;

public class laboratorio1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Random pc =new Random();
		int usuário1;
		int usuário2;
		int computador;
		
		System.out.println("usuário1 faça sua jogada");
		usuário1 = sc.nextInt();
		
		System.out.println(" usuário2 faça sua jogada");
		
		
		usuário2 = sc.nextInt();
		//computador = pc.nextInt(3)+1;
		

		if(usuário1 == usuário2) {
		//	if(usuário1 == computador) {
			System.out.println("enpate");
		}
		else if((usuário1- usuário2)== -1 || (usuário1 - usuário2)== 2) {
			System.out.println("usuário1 vencedor");
			
	}
		else { 
			System.out.println("usuário2 vencedor");
		}
	
	}
}
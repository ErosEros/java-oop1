package jana60.bank;
import java.util.Random;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Come ti chiami??");
		String nomeProprietario = s.next();
		
		Random r=new Random();
		
		int numeroConto= r.nextInt(1000);
		
		Conto c  =new Conto (numeroConto, nomeProprietario, 0);
		
		System.out.printf("Numero del conto : %s . Nome del proprietario : %s", numeroConto, nomeProprietario);
		
		
		
		
		s.close();
	}

}
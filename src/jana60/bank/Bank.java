package jana60.bank;
import java.util.Random;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
//		GENERARE RANDOM CODE
		Random r=new Random();
		int numeroConto= r.nextInt(1000);
		
//		CHIEDO IL NOME ALL'UTENTE
		System.out.print("Come ti chiami??");
		String nomeProprietario = s.next();    
		
		
		
//		CREATE CONTO
		Conto c  =new Conto (numeroConto, nomeProprietario, 0);
		System.out.printf("Numero del conto :" + numeroConto + "\n"); 
		System.out.printf("Nome del proprietario :" + nomeProprietario +  "\n"); 
		System.out.printf("Il tuo saldo :" + c.saldo + "\n"); 

		
//	   USO IL CICLO WHILE PER PROPORRE LE SCELTE ALL'UTENTE
		String scelta = "";
	
//		OPZIONE PER LA CHIUSURA
		while (!scelta.equals("chiudere")) {
			
			System.out.print("Digita una tra le seguenti opzioni : prelievo - versamento - esci ");
			scelta = s.next();    
	
//		OPZIONE PER IL PRELIEVO
			if (scelta.equals("prelievo")) {
			    System.out.print("Digira la cifra che vuoi prelevare.");
			    double cifraPrelevata = s.nextDouble();
			    double contantePrelevato = c.prelievo(cifraPrelevata);
			    if(contantePrelevato > 0) {
			    	System.out.printf("Prelievo di %f è avvenuto con successo!!\n", contantePrelevato);
			    	System.out.printf("Il tuo saldo è attualmente di : %f\n", c.saldo);
			    }
			}
			
			 if(scelta.equals("versamento")) {
				System.out.print("Digira la cifra che vuoi versare.");
			    double cifraVersata = s.nextDouble();
			    double contanteVersato = c.versamento(cifraVersata);
			    if(contanteVersato > 0) {
			    	System.out.printf("Il tuo versamento di %f è avvenuto con successo!!\n", contanteVersato);
			    	System.out.printf("Il tuo saldo è attualmente di : %f\n", c.saldo);
			    }
			}
			
		}
			
		s.close();
		}
		
//		
		

//	CHIEDO QUALE SCELTA VUOLE ESEGUIRE L'UTENTE
//		System.out.print("Scegli cosa fare tra : PRELEVA  -  DEPOSITA - LOGOUT??");
	
//		
////		RICHIESTA VERSAMENTO
//		System.out.print("Che somma vuoi versare?");
//		float somma = s.nextInt();
//		

		
//		while (scelta == "PRELEVA") {
//		    System.out.println(i);
//		    i++;
//		}
		
		
	}


package org.lessons.java.shop;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r=new Random();
		
		int codiceRandom= r.nextInt(100000000);
		
		Prodotto p  =new Prodotto(codiceRandom,"Tablet","Top gamma",300, 22);
		
//	STAMPO UN NUOVO CODICE RANDOM
		System.out.println("Codice prodotto : " + codiceRandom);
	
//	STAMPO IL PREZZO BASE
		System.out.println("Prezzo base del prodotto : " + p.prezzoBase());
		
//		STAMPO IL PREZZO CON L'IVA
		System.out.println("Prezzo + I.V.A. del prodotto : " + p.prezzoConIva());
		
		
//		STAMPO IL NOME COMPLETO DEL PRODOTTO
			System.out.println("Nome completo del prodotto : " + p.nomeCompleto());
	}
	}

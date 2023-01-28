package org.lessons.java.shop;



public class Prodotto {

	int codice;
	String nome;
	String descrizione;
	float prezzo;
	float iva;
	
	
	
	public Prodotto(int codice, String nome, String descrizione, float prezzo, int iva) {
		super();
		this.codice=codice;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	
	
	float prezzoBase() {
		
		return prezzo;
	}
	
	float prezzoConIva() {
		return ( prezzo +(prezzo * iva) /100);
	}

	String nomeCompleto() {
		return nome + codice;
	}
	
}

	



//
//Usate opportunamente i costruttori ed eventuali altri metodi di “utilità” per fare in modo che:
//alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
//Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
//Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome

//Nello stesso package aggiungete una classe Main con metodo 
//main nella quale testate tutte le funzionalità della classe Prodotto
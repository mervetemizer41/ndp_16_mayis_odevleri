package com.mt.arel.temelmetotlar;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Kitap k0 = new Kitap("Cesur Yeni Dünya", "Aldous Huxley", 8000);
		Kitap k2 = new Kitap("Küçük prens", "Antoine de Saint-Exupery", 2000);
		Kitap k3 = new Kitap("Harry Potter", "J. K. Rowling", 5000);
		Kitap k4 = new Kitap("Lord Of The Rings", "J.R.R. Tolkien", 4000);
	    
		List<Kitap> kitapListesi = new ArrayList<Kitap>();
		kitapListesi.add(k0);
		kitapListesi.add(k2);
		kitapListesi.add(k3);
		kitapListesi.add(k4);

		System.out.println("***********Listenin toString ile dökümü***********");	    
		for(Kitap kitap: kitapListesi){
			System.out.println(kitap);
	    	}
		System.out.println("***********Aynı değerli nesneyi listede bulma***********");
		

		Kitap arananKitap = new Kitap("Harry Potter", "J. K. Rowling", 5000);
		int i = kitapListesi.indexOf(arananKitap);
		System.out.println("Esit mi?"+arananKitap.equals(kitapListesi.get(2)));	
		System.out.println("Aranan kitap listede " + i + ". eleman olarak bulundu.");
	}

	    
	


    
    
    
    
    
}



//package com.mt.arel.mayis_16;

import java.util.*;

public class Main
{
	public static void main(String[] args) {


		/***********************************************
		* Kitap sınıfı için eklenen nesnelerin kodlarını
		* devam eden satırlarda bulabilirsiniz.
		*
		*/
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
		int j = kitapListesi.indexOf(arananKitap);	
		System.out.println("Aranan kitap listede " + j + ". eleman olarak bulundu.");



		/***********************************************
		* Calisan sınıfı için eklenen nesnelerin kodlarını
		* devam eden satırlarda bulabilirsiniz.
		*
		*/

		Calisan c0 = new Calisan("Damla","Demir", "Adana", "Bilgi İşlem", 45000);
		Calisan c1 = new Calisan("Dilek","Kaya", "Antalya", "İnsan Kaynakları",65000);
		Calisan c2 = new Calisan("Demet","Demir", "Afyonkarahisar", "Pazarlama", 50000);
		Calisan c3 = new Calisan("Dursun","Kaya", "Adıyaman", "Muhasebe", 80000);
	    
		List<Calisan> calisanListesi = new ArrayList<Calisan>();
		calisanListesi.add(c0);
		calisanListesi.add(c1);
		calisanListesi.add(c2);
		calisanListesi.add(c3);

		System.out.println("***********Listenin toString ile dökümü***********");	    
		for(Calisan c: calisanListesi){
			System.out.println(c);
	    	}
		System.out.println("***********Aynı değerli nesneyi listede bulma***********");
		

		Calisan arananCalisan = new Calisan("Damla","Demir", "Adana", "Bilgi İşlem", 45000);
		System.out.println("************************************");
		System.out.println("Esit mi?" + arananCalisan.equals(c0));
		System.out.println("***********************************");
		int i = calisanListesi.indexOf(arananCalisan);	
		System.out.println("Aranan calisan listede " + i + ". eleman olarak bulundu.");





	}

	    
	


    
    
    
    
    
}



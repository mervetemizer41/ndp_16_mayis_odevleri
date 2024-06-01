//package com.mt.arel.mayis_16;


public class Calisan {

    private String ad;
    private String soyad;
    private String sehir;
    private String departman;
    private int maas;
    
    
    
    
    
	public Calisan(String ad, String soyad, String sehir, String departman, int maas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.sehir = sehir;
		this.departman = departman;
		this.maas = maas;
	}
	
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getDepartman() {
		return departman;
	}
	public void setDepartman(String departman) {
		this.departman = departman;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Calisan)) {
			return false;
			
		}
		Calisan diger = (Calisan) obj;
		boolean adEquals = false;
		if((this.ad == null && diger.ad == null) 
				|| (this.ad == diger.ad || this.ad.equals(diger.ad))) {
			
			adEquals = true;
		}
		boolean soyadEquals = false;
		if((this.soyad == null && diger.soyad == null) 
				|| (this.soyad == diger.soyad || this.soyad.equals(diger.soyad))) {
			
			soyadEquals = true;
		}
		boolean sehirEquals = false;
		if((this.sehir == null && diger.sehir == null) 
				|| (this.sehir == diger.sehir || this.sehir.equals(diger.sehir))) {
			
			sehirEquals = true;
		}
		boolean departmanEquals = false;
		if((this.departman == null && diger.departman == null) 
				|| (this.departman == diger.departman || this.departman.equals(diger.departman))) {
			
			departmanEquals = true;
		}
		boolean maasEquals = false;
		if(this.maas == diger.maas) {
			maasEquals = true;
			
		}
		return adEquals && soyadEquals && sehirEquals && departmanEquals && maasEquals;
		
		
		
	}
	
	/*
	 * hashCode metodunda;
	 * 17, 53 gibi asal sayılarla,
	 * sınıfın alanlarını(fields) çarpıp;
	 * bu değerleri toplayıp,
	 * üretilecek bir nesnenin kendine özgü bir kodu,
	 * yani bir hashCode'u olmasını amaçlıyoruz.
	 * Bu sayede türetilecek nesnemizi bir ArrayList,
	 * bir HashMap içinde bulmamız mümkün oluyor.
	 * Nedenini sorgulayanlar için, bir cevabı
	 * şurada bulabilirsiniz:
	 * https://stackoverflow.com/questions/3563847/what-is-the-use-of-hashcode-in-java
	 */
	 @Override
	    public int hashCode(){
	        int result = 17;
	        if(this.ad != null){
	            result = result*53 + this.ad.hashCode();
	        }
	        if(this.soyad != null){
	            result = result *53 + this.soyad.hashCode();
	        }
	        if(this.sehir != null){
	            result = result*53 + this.sehir.hashCode();
	        }
	        if(this.departman != null){
	            result = result *53 + this.departman.hashCode();
	        }
	        result = result*53 + this.maas;
	        
	        return result;
	    }
	    @Override
	    public String toString(){
	        String res = "";
	        res = "Calisan adi, soyadi:" + this.ad + " " + this.soyad + "\n";
	        res += "Calisan sehri:" + this.sehir + "\n";
	        res += "Calisan departmani:" + this.departman + "\n";
	        res += "Calisan maasi:" + this.maas + "\n";
	        return res; 
	    }
    
    

}

package com.mt.arel.temelmetotlar;

public class Kitap{
    private String baslik;
    private String yazar;
    private int basimAdedi;
    
    public Kitap(){
        this.baslik = "";
        this.yazar = "";
        this.basimAdedi = 0;
        
    }
    
    public Kitap(String baslik, String yazar, int basimAdedi){
        this.baslik = baslik;
        this.yazar = yazar;
        this.basimAdedi = basimAdedi;
        
    }
    
    
    public String getBaslik(){
        return baslik;
    }
    
    public void setBaslik(String baslik){
        this.baslik = baslik;
    }
    
    public String getYazar(){
        return yazar;
    }
    public void setYazar(String yazar){
        this.yazar = yazar;
    }
    
    public int getBasimAdedi(){
        return basimAdedi;
    }
    public void setBasimAdedi(int basimAdedi){
        this.basimAdedi = basimAdedi;
    }
    @Override
    public boolean equals(Object k){
        if(this == k){
            return true;
        }
        if(!(k instanceof Kitap)){
            return false;
        }
        Kitap diger = (Kitap) k;
        boolean baslikEquals = false;
        if((this.baslik == null && diger.baslik == null)
        || (this.baslik == diger.baslik || this.baslik.equals(diger.baslik))
        ){
            baslikEquals = true;
        }
        boolean yazarEquals = false;
        if((this.yazar == null && diger.yazar == null)
        || (this.yazar == diger.yazar || this.yazar.equals(diger.yazar)) 
        ){
            
            yazarEquals = true;
        }
	boolean basimAdediEquals = this.basimAdedi == diger.basimAdedi;

        return baslikEquals && yazarEquals && basimAdediEquals;
        
        
    }
    @Override
    public int hashCode(){
        int result = 17;
        if(this.baslik != null){
            result = result*53 + this.baslik.hashCode();
        }
        if(this.yazar != null){
            result = result *53 + this.yazar.hashCode();
        }
        return result;
    }
    @Override
    public String toString(){
        String res = "";
        res = "Kitap başlığı:" + this.baslik + "\n";
        res += "Kitap yazarı:" + this.yazar + "\n";
        res += "Kitabın basım adedi:" + this.basimAdedi + "\n";
        return res; 
    }
    
    
    
    
    
    
}


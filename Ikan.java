package binatang;

public class Ikan {
    public int mata;
    protected int sirip;
    protected int panjang;
    
    public Ikan(){
        mata=2;
        sirip=5;
        panjang=10;
    }
    
    protected String bernafas(){
        String s = "Bernafas dengan insang";
        return s;
    }
    protected String berenang(){
        String s = "Berenang dengan siripnya";
        return s;
    }
}
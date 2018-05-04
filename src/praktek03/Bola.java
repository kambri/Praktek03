package praktek03;

public class Bola {
    private String merk;
    private String warna;
    private double harga;
    
    void cetakInfo(){
        System.out.println("Merk Bola \t: "+merk+"\n"+
                "Berwarna \t: "+warna+"\n"+
                "Seharga  \t: "+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}

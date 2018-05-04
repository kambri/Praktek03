package praktek03;
public class BolaAksi {
    public static void main (String[] args){
        Bola a = new Bola();
        a.setMerk("Nike");
        a.setWarna("Abu-Abu");
        a.setHarga(250000);
        
        a.cetakInfo();
        
        System.out.print(" Merk bola ini \t : ");
        System.out.println(a.getMerk());
        System.out.print(" Berwarna \t : ");
        System.out.println(a.getWarna());
        System.out.print(" Dengan Harga \t : ");
        System.out.println(a.getHarga());
    }
    
}

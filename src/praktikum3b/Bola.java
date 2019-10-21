package praktikum3b;
public class Bola {
    private double jari;
    private double diameter;
    private double luas;
    private double volume;
    private double hasil;
    
    public Bola(double jari) {
        this.jari = jari;
        hasil = 0;
    }

    public void showDiameter() {
        double diameter;
        this.diameter = jari *2; 
    }
    public void showLuasPermukaan(){
        double luas;
        this.luas = 4 * 3.14 * jari * jari;
    }
    public void showVolume(){
        double volume;
        this.volume = 4/3 * 3.14 * jari*jari*jari;
    }
    public void cetak(){
        System.out.println("Jari-jari = "+ jari);
        System.out.println("Diameter = "+ diameter);
        System.out.println("Luas Permukaan = "+ luas);
        System.out.println("Volume = "+ volume);
    }
}
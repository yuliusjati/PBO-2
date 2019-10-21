
package latihan2;

public class UjiBus {
    public static void main(String[] args) {
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        busBesar.addpenumpang(15);
        busBesar.cetak();
        
        busBesar.addpenumpang(5);
        busBesar.cetak();
        
        busBesar.addpenumpang(26);
        busBesar.cetak();
    }
    
}

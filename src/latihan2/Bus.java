package latihan2;

public class Bus {
    private int penumpang;
    private int maxpenumpang;
    
    public Bus(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp >= maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;  
        }
    }
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
        System.out.println("Penumpang maxsimum seharusnya adalah "+ maxpenumpang);
    }
}

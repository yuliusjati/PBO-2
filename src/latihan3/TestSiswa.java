package latihan3;

public class TestSiswa {
    public static void main(String[] args) {
        DataSiswa siswa = new DataSiswa();
        siswa.setNama("Yulius");
        siswa.setAge(15);
        siswa.setAddress("MALANG");
        
        System.out.println("Nama :" + siswa.getNama());
        System.out.println("Age :" + siswa.getAge());
        System.out.println("Address :" + siswa.getAddress());
        
    }
    
}

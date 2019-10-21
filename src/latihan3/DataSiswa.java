package latihan3;

public class DataSiswa {
    private String nama;
    private String address;
    private int age;
    
    public int getAge(){
        return age;   
    }
    public String getNama(){
        return nama;
    }
    public String getAddress(){
        return address;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setNama(String newNama){
        nama = newNama;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    
}

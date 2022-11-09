public class Pegawai { //superclass dari subclass Gaji, terjadi inheritance dari kelas Pegawai ke Gaji
    //atribut atau metod
    // private instance variable
    private String name; 
    private String address; 
    private int number; 


    //constructor
    public Pegawai (String name, String address, int number) {
        System.out.println("Menyusun Pegawai"); 
        this.name = name; 
        this.address = address; 
        this.number = number;
    }

    //access modifier
    public void mailCheck() {
        System.out.println("Memeriksa Surat Untuk " + this.name + " " + this.address);
    }

    //Mengembalikan string self-descriptive
    public String toString() {
        return name + " " + address + " " + number;
    } 
    
    //mengembalikan nilai nama pegawai
    public String getName() {
        return name;
    } 
    
    //mengembalikan nilai alamat pegawai
    //getter metod
    public String getAddress () {
        return address; 
    }

    //Sets alamat
    //setter metod
    public void setAddress (String newAddress) {
        address = newAddress;
    } 
    
    public int getNumber () {
        return number;
    }
    
}
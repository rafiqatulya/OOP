public class Elemen { //superclass
    //metod
    private String nama; //metod private
    public int jamSibuk; //deklarasi metod jamsibuk untuk membuat getJamSibuk
    int amount;//menghitung jumlah jam sibuk diakhir

    //construct
    public Elemen(String nama) {
        this.nama = nama;
    }
    
    // getter nama
    public String getNama (){
        return this.nama;
    }

    //getter jamsibuk
    public int getJamSibuk(){
        return jamSibuk;
    }

    //metod untuk menampilkan output ke layar
    public void mail() {
    }

}

public class Mahasiswa extends Elemen {//subclass
    
    //private member variable
    private int sks;

    //Constructs a Mahasiswa instance with the given nama and sks
    public Mahasiswa (String nama, int sks){
        super (nama);
        this.sks=sks*3;
    }

    //getter sks
    public int getSks(){
        return this.sks;  
    }

    @Override
    public void mail(){
        System.out.println(getNama() + " adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk());
    }

    @Override
    public int getJamSibuk(){
        return this.sks;
    }

}

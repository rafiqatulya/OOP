public class Asdos extends Mahasiswa{//subclass

    //private member variable
    private int jamNgasdos;

    //Constructs a Asdos instance with the given nama, sks and jamNgasdos
    public Asdos (String nama, int sks, int jamNgasdos){
        super (nama,sks);
        this.jamNgasdos = getSks()+jamNgasdos;
    }

    //getter jamngasdos
    public int getjamNgasdos(){
        return this.jamNgasdos;
    }

    @Override
    public void mail(){
        System.out.println(getNama() + " adalah seorang asdos dengan jam sibuk " + getJamSibuk());
    }

    @Override
    public int getJamSibuk(){
        return this.jamNgasdos;
    }


}

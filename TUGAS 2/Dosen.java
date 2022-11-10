public class Dosen extends Elemen{//subclass

    //private member variable
    private int jumlahHariKerja;

    //Constructs a Dosen instance with the given nama and jumlahHariKerja
    public Dosen ( String nama,int jumlahHariKerja){
        super (nama); 
        this.jumlahHariKerja = jumlahHariKerja*8;

    }

    //getter jumlah hari kerja
    public int getjumlahHraiKerja(){
        return this.jumlahHariKerja;  
    }

    @Override
    public void mail(){
        System.out.println(getNama() + " adalah seorang dosen dengan jam sibuk " + getJamSibuk());
    }

    @Override
    public int getJamSibuk(){
        return this.jumlahHariKerja;
    }
    
}

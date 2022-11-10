public class Simulator {
    public static void main(String[] args) {

        // Declare instances of the superclass, substituted by subclasses.
        Asdos x = new Asdos("Fairuzikun", 24, 1); //upcast
        Dosen y = new Dosen("Raja OP Damanik", 5); //upcast
        Elemen z = new Asdos("Angle-chan", 21, 1); //upcast
        Mahasiswa s = new Mahasiswa("Firman", 20); //upcast
        Mahasiswa j = new Mahasiswa("Nid to pass this sem", 23); //upcast
        Dosen k = new Dosen ("Nivotko", 3); //upcast

        x.mail(); //run new asdos jamsibuk
        y.mail(); //run new dosen jamsibuk
        z.mail(); //run new asdos jamsibuk
        s.mail(); //run new mahasiswa jamsibuk
        j.mail(); //run new mahasiswa jamsibuk
        k.mail(); //run new dosen jamsibuk

        //jumlah jamsibuk fasilkom
        int amount = x.getJamSibuk() + y.getJamSibuk() + ((Asdos) z).getJamSibuk() 
                    + ((Mahasiswa) s).getJamSibuk() + ((Mahasiswa) j).getJamSibuk() + ((Dosen) k).getJamSibuk();
        
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + amount);

    }
    
}

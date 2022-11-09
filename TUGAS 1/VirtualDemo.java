public class VirtualDemo{
    public static void main(String[] args) {
        
        // Program pada spesifikasi yang ditentukan dalam superclass/interface.
        // Mendeklarasikan instance dari superclass, digantikan oleh subclass.
        Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00); // contoh obyek data dengan referensi gaji
        Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00); //contoh obyek data referensi pegawai
        
        // memanggil implementasi yang sebenarnya
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck(); // objek metod mailcheck pada kelas gaji
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck(); // objek metod mailcheck pada kelas pegawai

    }

}

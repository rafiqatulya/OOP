public class Gaji extends Pegawai //subclass ( inherit dari kelas Pegawai)
{ 
    // private instance variable
    private double salary; //Gaji Tahunan, metod tambahan untuk kelas gaji 

    //membuat sebuah instance Gaji dengan name,address,number dan salary yang diberikan
    public Gaji (String name, String address, int number, double salary) { //metod dengan nama sama dengan metod kelas pegawai agar tidak membingungkan
                                                                      
        super (name, address, number); 
        setSalary (salary);
    }

    //access modifier
    public void mailCheck () { 
        System.out.println("Memeriksa kelas gaji dalam surat "); 
        System.out.println("Surat tertuju untuk " + getName() + "dengan gaji " + salary);
    }

    //mengembalikan nilai gaji pegawai, gets salary
    public double getSalary () { 
        return salary;
    } 
    
    //sets salary
    public void setSalary (double newSalary) { 
        if (newSalary >= 0.0) { 
            salary = newSalary;
        }
    } 
     //mengembalikan nilai dari perhitungan gaji pegawai
     //Karena kelas Gaji mewarisi kelas pegawai, maka harus mengimplementasikan metode computePay()
    public double computePay () {
        System.out.println("Menghitung pembayan gaji untuk" + getName()); 
        return salary/52;
    }

}
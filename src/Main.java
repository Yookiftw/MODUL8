public class Main {
    public static void main(String[] args) throws Exception {
        Programmer programmerSatu = new Programmer("Budi Santoso", 15000000.0);
        
        System.out.println("Data Karyawan");
        System.out.println("Nama Programmer : " + programmerSatu.nama);
        System.out.println("Total Gaji      : Rp " + programmerSatu.hitungGaji());
    }
}
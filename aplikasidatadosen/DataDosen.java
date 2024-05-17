package aplikasidatadosen;

import java.util.Scanner;
/**
 * Ni Kadek Dwi Pratiwi
 * Nim = 2201010051
 * Kelas = U
 * UTS OBJECT ORIENTED PROGRAMMING
 */

// Kelas DataDosen yang meng-extends dari AplikasiDataDosen
public class DataDosen extends AplikasiDataDosen {
    // Deklarasi variabel
    private int jml = 5; // Jumlah maksimum data dosen
    private String mon, thn;
    private String [] DataDosen = new String [jml]; // Array untuk menyimpan data dosen
    private Scanner dIN = new Scanner(System.in); // Scanner untuk input dari pengguna

    public DataDosen(String mon, String thn) {
        this.mon = mon;
        this.thn = thn;
    }

    // Metode untuk menyimpan data dosen
    public void StoreData(){
        System.out.println("Isikan Data Dosen");
        System.out.println(" ~~~ ");
        int no=0; // Inisialisasi nomor data dosen
        for (int i = 0; i < DataDosen.length; i++) { // Loop untuk mengisi data dosen
            no++;
            System.out.print("Data Dosen ke-"+no+" ");
            DataDosen[i] = dIN.nextLine(); // Menyimpan input dari pengguna ke array
        }
    }
    // Metode untuk menampilkan data dosen
    public void Viewdata(){
        System.out.println("Daftar Data Dosen Beserta ID Dosen");
        System.out.println(" ~~~ ");
        int no=0; // Inisialisasi nomor data dosen
        System.out.println("Bulan: "+mon);
        System.out.println("Tahun: "+thn);
        for (int i = 0; i < DataDosen.length; i++) { // Loop untuk menampilkan data dosen
            no++;
            if (DataDosen[i] != null && DataDosen[i].length()>=2) {
                // Menampilkan data dosen dengan ID jika data valid
                System.out.println(no+". "+DataDosen[i]
                    + "("+thn.substring(thn.length()-2,thn.length())+mon+DataDosen[i].substring(0, 2)+i+")");
            } else {
                System.out.println(no+". "+DataDosen[i]);
            }
        }  
    }
    
    public void Editdata(){
        // Metode untuk mengedit data dosen
        System.out.println("Ubah Data Dosen");
        System.out.println(" ~~~ ");
        System.out.print("Index data dosen yang ingin kamu diubah : ");
        String id = dIN.nextLine();  // Membaca index data yang akan diubah
        int idx = Integer.parseInt(id);  // Mengkonversi index ke integer
        System.out.println("Data dosen yang diubah : "+DataDosen[idx]);
        System.out.print("Diubah Menjadi: ");
        DataDosen[idx] = dIN.nextLine(); // Mengubah data dosen dengan input baru
        System.out.println(" ~~Data telah diubah~~ ");
    }
    // Metode untuk menghapus semua data dosen
    public void hapus(int idx){
        System.out.println("Menghapus Data Dosen");
        System.out.println(" ~~~ ");
        System.out.println("Index data dosen yang dihapus : "+idx);
        System.out.println("Data Dosen yang ingin dihapus : "+DataDosen[idx]);
        // Menghapus data dosen dengan mengatur nilai ke null
        DataDosen[idx] = null;
        System.out.println(" ~~Data Dosen telah dihapus~~ ");
    }
    // Metode untuk mengosongkan semua daftar data dosen
    public void hapus(){
        System.out.println("Mengosongkan Daftar Data Dosen");
        System.out.println("Anda Akan Mengosongkan Daftar Data Dosen");
        // Mengecek konfirmasi pengguna
        System.out.print("Silahkan Konfirmasi dengan menekan Y, tekan huruf lain untuk kembali: "); 
        String conf = dIN.nextLine();
        if (conf.equals("Y")|| conf.equals("y")) {
            // Loop untuk mengosongkan data
            for (int i = 0; i < DataDosen.length; i++) {
                // Mengatur semua data ke null
                DataDosen[i]=null;
            }
        System.out.println(" ~~Semua Daftar Data Dosen Telah Dikosongkan~~"); 
        }
    }
}
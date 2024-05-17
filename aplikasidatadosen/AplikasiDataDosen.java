package aplikasidatadosen;

import java.util.Scanner;

/**
 * Ni Kadek Dwi Pratiwi
 * Nim = 2201010051
 * Kelas = U
 * UTS OBJECT ORIENTED PROGRAMMING
 */
public class AplikasiDataDosen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input menu
        Scanner in = new Scanner(System.in);
        // Membuat objek Scanner untuk input bulan dan tahun
        Scanner st = new Scanner(System.in);
        // Menampilkan judul program
        System.out.println("Pencatatan 5 Data Dosen Di Kampus Instiki");
        System.out.println(" ~~~ ");
        // Meminta input bulan dari pengguna
        System.out.print("Masukkan Bulan, Dalam Format Angka atau Teks : ");
        // Menyimpan input bulan ke variabel bulan
        String bulan = st.nextLine();
        // Meminta input tahun dari pengguna
        System.out.print("Masukkan Tahun, Terdiri Dari 4 Digit: ");
        // Menyimpan input tahun ke variabel tahun
        String tahun = st.nextLine();
        System.out.println("");
        // Memastikan tahun terdiri dari 4 digit
        while (tahun.length()<4) {            
            System.out.print("Silahkan Masukkan Tahun yang Benar Sayang : ");
            // Menyimpan input tahun baru ke variabel tahun
            tahun = st.nextLine();
        }
        // Membuat objek DataDosen dengan parameter bulan dan tahun
        DataDosen dtd = new DataDosen(bulan, tahun); 
        
        // Inisialisasi variabel untuk mengontrol loop
        String close="tidak";
        do { 
            //peintah Loop and Switch
            System.out.println("Aplikasi Menu Pencatatan Data Dosen");
            System.out.println(" ~~~ ");
            System.out.println("A. Isi Daftar Nama Dosen");
            System.out.println("B. Tampilkan Daftar Data Dosen");
            System.out.println("C. Ubah Nama Dosen");
            System.out.println("D. Hapus Data Dosen");
            System.out.println("E. Kosongkan Semua Daftar Data Dosen");
            System.out.println("S. Selesai");
            System.out.print("Masukkan Menu Yang Ingin Kamu pilih : ");
            String menu = in.nextLine(); // Menyimpan input menu ke variabel menu
            System.out.println("");
            switch (menu) {  // Memilih tindakan berdasarkan input menu dri pengguna
                case "A":
                case "a":
                    dtd.StoreData(); // Memanggil metode StoreData untuk mengisi data dosen
                    System.out.println("");
                    break;
                case "B":
                case "b":
                    dtd.Viewdata(); // Memanggil metode Viewdata untuk menampilkan data dosen
                    System.out.println("");
                    break;
                case "C":
                case "c":
                    dtd.Editdata(); // Memanggil metode Editdata untuk mengubah data dosen
                    System.out.println("");
                    break;
                case "D":
                case "d":
                    Scanner cb = new Scanner(System.in); // Membuat objek Scanner baru untuk input index
                    System.out.print("Masukkan index data dosen yang ingin dihapus : ");
                    String id = cb.nextLine(); // Menyimpan input index ke variabel id
                    int idx = Integer.parseInt(id); // Mengonversi id menjadi integer
                    dtd.hapus(idx); // Memanggil metode hapus untuk mengosongkan semua data dosen
                    System.out.println("");
                    break;
                case "E":
                case "e":
                    // Memanggil metode hapus untuk mengosongkan semua data dosen
                    dtd.hapus();
                    System.out.println("");
                    break;
                case "S":
                case "s":
                    close="ya"; // Mengubah nilai close untuk keluar dari loop
                    in.close(); // Menutup objek Scanner in
                    st.close(); // Menutup objek Scanner st
                    break;
                    // Kasus default jika input menu tidak valid
                default:
                    // Menampilkan pesan kesalahan
                    System.out.println("Tidak Ada Menu");
                    break;
            }    
            // Mengulang menu selama close bernilai "tidak"
        } while (close.equals("tidak"));
    }
}
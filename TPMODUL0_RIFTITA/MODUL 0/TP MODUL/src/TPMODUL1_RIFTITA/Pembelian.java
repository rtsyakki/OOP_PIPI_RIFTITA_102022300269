package TPMODUL1_RIFTITA;

import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<penerbangan> listPenerbangan = new ArrayList<>();
        ArrayList<Penumpang> listPenumpang = new ArrayList<>();
        
        listPenerbangan.add(new penerbangan("LA400", "LOP, Lombok", "PKU, Pekanbaru", "07:30", "09:15", 1233333));
        listPenerbangan.add(new penerbangan("LA401", "SUB, Surabaya", "SOC, Solo", "09:00", "12:45", 1353366));

        int selectedIndex = -1;
        boolean isActive = true;

        while (isActive) {
            System.out.println("======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan daftar penerbangan");
            System.out.println("2. Beli tiket");
            System.out.println("3. Tampilkan pesanan tiket");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            int pilihanMenu = input.nextInt();
            input.nextLine(); 

            switch (pilihanMenu) {
                case 1:
                    System.out.println("Daftar Penerbangan Tersedia:");
                    for (int i = 0; i < listPenerbangan.size(); i++) {
                        System.out.println((i + 1) + ".");
                        listPenerbangan.get(i).tampilDaftarPenerbangan();
                    }
                    break;
                
                case 2:
                    System.out.println("Silakan lengkapi data penumpang:");
                    System.out.print("Masukkan NIM Praktikan: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama Pendek Praktikan: ");
                    String namaPendek = input.nextLine();
                    System.out.print("Masukkan Kelas Praktikan: ");
                    String kelas = input.nextLine();
                    
                    listPenumpang.add(new Penumpang(nim, namaPendek, kelas));

                    System.out.println("Silakan pilih penerbangan:");
                    for (int i = 0; i < listPenerbangan.size(); i++) {
                        System.out.println((i + 1) + ".");
                        listPenerbangan.get(i).tampilDaftarPenerbangan();
                    }
                    System.out.print("Masukkan nomor penerbangan: ");
                    selectedIndex = input.nextInt();
                    System.out.println("Tiket Anda berhasil dipesan!");
                    break;

                case 3:
                    if (selectedIndex == -1) {
                        System.out.println("Belum ada pemesanan tiket!");
                    } else {
                        System.out.println("======= Detail Tiket Penerbangan =======");
                        for (Penumpang p : listPenumpang) {
                            p.tampilDataPenumpang();
                        }
                        listPenerbangan.get(selectedIndex - 1).tampilDaftarPenerbangan();
                    }
                    break;

                case 4:
                    System.out.println("Terima Kasih telah menggunakan layanan kami!");
                    isActive = false;
                    break;

                default:
                    System.out.println("Menu tidak valid anjay. Silakan pilih lagi.");
            }
            System.out.println();
        }
        input.close();
    }
}

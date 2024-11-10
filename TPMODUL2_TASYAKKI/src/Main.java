public class Main { 
    public static void main(String[] args) { 
        Kucing kucing = new Kucing("Ruby", 2, "Persia"); 
        Burung burung = new Burung("Leon", 1, "Biru emas"); 
        System.out.println("Detail Hewan\n");
        System.out.println("Ini adalah Ruby !");
        kucing.suara(); 
        kucing.makan(); 
        kucing.makan("nasi");
        System.out.println("\nIni adalah Leon !"); 
        burung.suara(); 
        burung.makan();
        burung.makan("padi"); 
        System.out.println(); 
        kucing.infoHewan(); 
        burung.infoHewan(); 
    }
 }

// Don't delete any comments below!!!

    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)

    // Todo : Create Constructor of MakananBasah

    // Todo : Create Getter and Setter

    // Todo : Create Method ShowData

}

// Don't delete any comments below!!!

public class MakananBasah {
    private String Nama;
    private int Jumlah;
    private String Bahan;
    private double Harga;

    public MakananBasah (String Nama, int Jumlah, String Brand, double Harga) {
        this.Nama = Nama;
        this.Jumlah = Jumlah;
        this.Bahan = Brand;
        this.Harga = Harga;
}

    public String getNama(){
        return Nama = Nama;

    }
    public void setNama(String Nama){
        this.Nama = Nama;
    
        }
    public int getJumlah(){
        return Jumlah;
    
        }
    public void setJumlah(int Jumlah){
        this.Jumlah = Jumlah;
    
        }
    public String getBrand(){
            return Bahan = Bahan;
        
        }
    public void setBrand(String Brand){
            this.Bahan = Bahan;
        
        }
    public double getHarga(){
            return Harga = Harga;
        
        }
    public void setHarga(double Harga){
            this.Harga = Harga;
        
        }
    
    

    public void ShowData() {
        System.out.println("Nama: " + Nama, "Jumlah: " + Jumlah, "Brand: " + Bahan, "Harga: " + Harga);
    }

}
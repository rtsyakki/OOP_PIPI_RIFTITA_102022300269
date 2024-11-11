// Don't delete any comments below!!!

public class MakananKering {
    private String Nama;
    private int Jumlah;
    private String Brand;
    private double Harga;

// Todo : Create Constructor of MakananKering
    public MakananKering (String Nama, int Jumlah, String Brand, double Harga) {
        this.Nama = Nama;
        this.Jumlah = Jumlah;
        this.Brand = Brand;
        this.Harga = Harga;
}

    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
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
            return Brand = Brand;
        
        }
    public void setBrand(String Brand){
            this.Brand = Brand;
        
        }
    public double getHarga(){
            return Harga = Harga;
        
        }
    public void setHarga(double Harga){
            this.Harga = Harga;
        
        }
    
    
    // Todo : Create Getter and Setter


    // Todo : Create Method ShowData
    public void display() {
        System.out.println("Nama: " + Nama, "Jumlah: " + Jumlah, "Brand: " + Brand, "Harga: " + Harga);
    }

}
package TPMODUL1_RIFTITA;

    public class Penumpang {
        private String NIK;
        private String namaDepan;
        private String namaBelakang;
    
        public Penumpang(String NIK, String namaDepan, String namaBelakang) {
            this.NIK = NIK;
            this.namaDepan = namaDepan;
            this.namaBelakang = namaBelakang;
        }
    
        public String getNIK() {
            return NIK;
        }
    
        public String getNamaDepan() {
            return namaDepan;
        }
    
        public String getNamaBelakang() {
            return namaBelakang;
        }

        public void tampilDataPenumpang() {
            System.out.println("NIK: " + NIK);
            System.out.println("Nama Lengkap: " + namaDepan + " " + namaBelakang);
        }
    }


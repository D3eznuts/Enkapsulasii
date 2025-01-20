public class Main {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa("Budi", 20, 85.5);
        siswa1.tampilkanInfo();

        siswa1.setUsia(21);
        siswa1.setNilai(90);
        siswa1.tampilkanInfo();

        siswa1.setUsia(-5); // Ini akan menampilkan pesan kesalahan
    }

    static class Siswa { // Kelas Siswa dideklarasikan sebagai static
        private String nama;
        private int usia;
        private double nilai;

        public Siswa(String nama, int usia, double nilai) {
            this.nama = nama;
            setUsia(usia); // Menggunakan setter untuk validasi
            setNilai(nilai); // Menggunakan setter untuk validasi
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getUsia() {
            return usia;
        }

        public void setUsia(int usia) {
            if (usia > 0) {
                this.usia = usia;
            } else {
                System.out.println("Usia harus lebih dari 0.");
            }
        }

        public double getNilai() {
            return nilai;
        }

        public void setNilai(double nilai) {
            if (nilai >= 0 && nilai <= 100) {
                this.nilai = nilai;
            } else {
                System.out.println("Nilai harus berada antara 0 dan 100.");
            }
        }

        public void tampilkanInfo() {
            System.out.println("Nama: " + nama);
            System.out.println("Usia: " + usia);
            System.out.println("Nilai: " + nilai);
        }
    }
}
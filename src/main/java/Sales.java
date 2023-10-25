public class Sales extends Pegawai { private double gajiPokok;
    private int jumlahPelanggan;

    public Sales(String NIP, String nama, String alamat, int tahunMasuk, double gajiPokok, int jumlahPelanggan) {
        super(NIP, nama, alamat, tahunMasuk); this.gajiPokok = gajiPokok; this.jumlahPelanggan = jumlahPelanggan;
    }

    @Override
    public double hitungGajiAkhir() {
        double komisi = jumlahPelanggan * 50000; return gajiPokok + komisi;
    }

    public void cetakSales() {
        super.tampilkanInfo(); // Memanggil metode tampilkanInfo dari kelas dasar Pegawai
        System.out.println("Gaji Pokok: " + gajiPokok); System.out.println("Jumlah Pelanggan: " + jumlahPelanggan);
    }
}
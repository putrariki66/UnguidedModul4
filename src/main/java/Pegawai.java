public class Pegawai { protected String NIP; protected String nama; protected String alamat; protected int tahunMasuk;

    public Pegawai(String NIP, String nama, String alamat, int tahunMasuk) { this.NIP = NIP;
        this.nama = nama; this.alamat = alamat;
        this.tahunMasuk = tahunMasuk;
    }

    public double hitungGajiAkhir() {
        return 0; // Metode ini akan di-redefinisi di kelas anak
    }

    public void tampilkanInfo() { System.out.println("NIP: " + NIP); System.out.println("Nama: " + nama); System.out.println("Alamat: " + alamat);
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}
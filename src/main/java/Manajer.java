public class Manajer extends Pegawai { private double gajiPokok;
    private String divisi;

    public Manajer(String NIP, String nama, String alamat, int tahunMasuk, String divisi) {
        super(NIP, nama, alamat, tahunMasuk);
        this.gajiPokok = 5000000; // Gaji pokok default untuk Manajer this.divisi = divisi;
    }

    @Override
    public double hitungGajiAkhir() {
        int tahunKerja = 2015 - tahunMasuk; double tunjanganJabatan = 0;

        if (tahunKerja >= 3) {
            tunjanganJabatan = 0.05 * gajiPokok;
        } else if (tahunKerja > 5) { tunjanganJabatan = 0.1 * gajiPokok;
        }

        return gajiPokok + tunjanganJabatan;
    }

    public void cetakManajer() { tampilkanInfo();
        System.out.println("Gaji Pokok: " + gajiPokok); System.out.println("Divisi: " + divisi);
    }
}
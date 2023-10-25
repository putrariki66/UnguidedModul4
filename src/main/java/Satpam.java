public class Satpam extends Pegawai { private double gajiPokok;
    private int jamLembur;

    public Satpam(String NIP, String nama, String alamat, int tahunMasuk, double gajiPokok, int jamLembur) {
        super(NIP, nama, alamat, tahunMasuk); this.gajiPokok = gajiPokok; this.jamLembur = jamLembur;
    }

    @Override
    public double hitungGajiAkhir() { double bonus = jamLembur * 10000; return gajiPokok + bonus;
    }

    public void cetakSatpam() { tampilkanInfo();
        System.out.println("Gaji Pokok: " + gajiPokok); System.out.println("Jam Lembur: " + jamLembur);
    }
}
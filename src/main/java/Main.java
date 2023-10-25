public class Main {
    public static void main(String[] args) {
        Pegawai P = new Pegawai("1234", "jibril", "Jl. JneToto 77", 2005);
        Satpam S = new Satpam("1042", "Mikail", "Jl. Party 77", 2000, 300000, 5);
        Sales T = new Sales("0325", "Israfil", "Jl. kenangan 77", 2006, 500000, 10); Manajer M = new Manajer("0275", "Jimin", "Jl. apaya 56", 1999, "Keuangan");

        System.out.println("\n\n==DATA PEGAWAI=="); P.tampilkanInfo();
        System.out.println("Gaji Akhir: Rp. " + P.hitungGajiAkhir()); System.out.println(); System.out.println("===========================================");

        System.out.println();

        System.out.println("==DATA SATPAM=="); S.cetakSatpam();
        System.out.println("Gaji Akhir: Rp. " + S.hitungGajiAkhir()); System.out.println(); System.out.println("===========================================");

        System.out.println();

        System.out.println("==DATA SALES=="); T.cetakSales();
        System.out.println("Gaji Akhir: Rp. " + T.hitungGajiAkhir()); System.out.println(); System.out.println("===========================================");

        System.out.println();

        System.out.println("==DATA MANAJER=="); M.cetakManajer();
        System.out.println("Gaji Akhir: Rp. " + M.hitungGajiAkhir()); System.out.println(); System.out.println("===========================================");
    }
}
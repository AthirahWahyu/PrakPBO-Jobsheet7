public class Mobil extends Kendaraan {
    private int jumlahPintu;

    // Constructor 1 : Tanpa parameter (Overloading)
    public Mobil() {
        super(); // Memanggil constructor superclass tanpa parameter
        this.jumlahPintu = 0;
    }

    // Constructor 2 : Berparameter (Overloading)
    public Mobil(String merk, String warna, int tahunProduksi, int jumlahPintu) {
        super(merk, warna, tahunProduksi); // Memanggil super() berparameter
        this.jumlahPintu = jumlahPintu;
    }

    // Method Overriding
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
    }
}

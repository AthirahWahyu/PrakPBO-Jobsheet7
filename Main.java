public class Main {
    public static void main(String[] args) {
        // Instansiasi Objek 1: Menggunakan constructor berparameter
        Mobil mobil1 = new Mobil("Honda", "Merah", 2023, 4);

        // Instansiasi Objek 2: Menggunakan constructor tanpa parameter
        Mobil mobil2 = new Mobil();

        // Menampilkan informasi kedua objek
        System.out.println("--- INFO MOBIL 1 ---");
        mobil1.tampilkanInfo();

        System.out.println("\n--- INFO MOBIL 2 ---");
        mobil2.tampilkanInfo();
    }
}
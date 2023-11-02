import java.util.Scanner;
public class Jajargenjang{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menghitung Luas dan Keliling Jajargenjang");
        System.out.print("Masukkan panjang alas: ");
        double panjangAlas = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan panjang sisi miring: ");
        double panjangSisiMiring = input.nextDouble();
        input.close();

        /**
         * Ini adalah metode untuk menghitung luas dan keliling jajargenjang
         * @param luas: panjang alas * tinggi
         * @param keliling: 2 * (panjangAlas + panjangSisiMiring)
         */
    double luas = panjangAlas * tinggi;
    double keliling = 2 * (panjangAlas + panjangSisiMiring);


        System.out.println("Luas jajargenjang: " + luas);
        System.out.println("Keliling jajargenjang: " + keliling);

    }
}
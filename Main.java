package inheritance;

public class Main {
    public static void main(String[] args) {

        Mobil mobil = new Mobil();
        Kendaraan mobil1 = new Kendaraan();
        mobil1.jenismobil = "SUV";
        mobil1.namamobil = "Daihatsu Terios";
        Kendaraan mobil2 = new Kendaraan();
        mobil2.jenismobil = "Sedan";
        mobil2.namamobil = "Honda Civic";
        Mobil mobil3 = new Mobil();
        mobil3.jenismobil = "Convertible";
        mobil3.namamobil = "Lamborghini Aventador";
        mobil3.pintu = 2;
        Mobil mobil4 = new Mobil();
        mobil4.jenismobil = "Listrik";
        mobil4.namamobil = "Tesla Series X";
        mobil4.pintu = 4;

        System.out.println("Bagian Kendaraan");
        mobil1.display();
        mobil2.display();
        System.out.println("\nBagian Mobil");
        mobil3.display();
        mobil4.display();
    }
}

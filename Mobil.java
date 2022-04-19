package inheritance;

public class Mobil extends Kendaraan{

    Integer pintu;

    @Override
    void display() {

        System.out.println("Nama Mobil      : " +this.namamobil);
        System.out.println("Jenis Mobil     : " +this.jenismobil);
        System.out.println("Jumlah Pintu    : " +this.pintu );
    }
}


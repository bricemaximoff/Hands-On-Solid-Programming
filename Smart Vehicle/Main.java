package smartvehicle;

public class Main {
    public static void main(String[] args) {
        MobilListrik tesla = new MobilListrik();
        tesla.startEngine();
        tesla.isiBaterai();

        System.out.println("--------------------");

        MobilBensin avanza = new MobilBensin();
        avanza.startEngine();
        avanza.isiBahanBakar();

        System.out.println("--------------------");

        Sepeda polygon = new Sepeda();
        polygon.kayuh();
    }
}
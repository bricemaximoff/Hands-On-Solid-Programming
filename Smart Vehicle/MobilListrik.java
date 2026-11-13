package smartvehicle;

public class MobilListrik implements EngineStartable, Chargeable {
    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin kendaraan listrik...");
    }

    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai kendaraan listrik...");
    }
}
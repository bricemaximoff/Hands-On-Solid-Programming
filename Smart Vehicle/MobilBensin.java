package smartvehicle;

public class MobilBensin implements EngineStartable, FuelFillable {
    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin pembakaran internal...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar bensin...");
    }
}

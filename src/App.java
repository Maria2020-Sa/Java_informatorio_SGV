import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Vehiculo coche1 = new Coche("Fiat", "Palio");
        Vehiculo moto1 = new Moto("Motomel", "Blit");
        Vehiculo coche2 = new Coche("Toyota", "Corola");
        Vehiculo moto2 = new Moto("Yamaha", "IBR");

        Flota flota = new Flota(coche1,moto1,coche2,moto2);
        flota.moverVehiculo();
    }
}
import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Vehiculo> vehiculosLista;

    public Flota(Vehiculo ...vehiculosLista){
        this.vehiculosLista = new ArrayList<>();
        for(Vehiculo vehiculo : vehiculosLista){
            this.vehiculosLista.add(vehiculo);
        }
    }

    public void moverVehiculo(){
        this.vehiculosLista.stream()
                .forEach(vehiculo -> {
                    System.out.println(vehiculo);
                    vehiculo.mover();
                });
    }
}

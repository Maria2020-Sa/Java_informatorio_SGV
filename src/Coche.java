

public class Coche extends Vehiculo{

    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El coche está conduciendo");
    }

    @Override
    public String toString() {
        return String.format("Coche: Marca=%s, Modelo=%s", getMarca(), getModelo());
    }

}

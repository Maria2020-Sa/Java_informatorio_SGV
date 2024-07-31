

public class Moto extends Vehiculo {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("La moto está acelerando");
    }

    @Override
    public String toString() {
        return String.format("Moto: Marca=%s, Modelo=%s", getMarca(), getModelo());
    }
}

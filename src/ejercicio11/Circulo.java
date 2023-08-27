package ejercicio11;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, boolean estaLlena, double radio) {
        super(color, estaLlena);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

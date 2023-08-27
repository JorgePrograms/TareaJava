package ejercicio11;

public class Rectangulo extends Figura {
    private double ancho;
    private double altura;

    public Rectangulo(String color, boolean estaLlena, double ancho, double altura) {
        super(color, estaLlena);
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ancho * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + altura);
    }
}

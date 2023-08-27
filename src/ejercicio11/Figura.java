package ejercicio11;

public abstract class Figura {
    private String color;
    private boolean estaLlena;

    public Figura(String color, boolean estaLlena) {
        this.color = color;
        this.estaLlena = estaLlena;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}

package ejercicio11;

public class Principal {
    public static void main(String[] args) {
        Figura circulo = new Circulo("Rojo", true, 5.0);
        Figura rectangulo = new Rectangulo("Verde", false, 8.0, 6.0);
        Figura triangulo = new Triangulo("Azul", true, 3.0, 4.0, 5.0);

        System.out.println("Círculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("\nRectángulo:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        System.out.println("\nTriángulo:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
    }
}
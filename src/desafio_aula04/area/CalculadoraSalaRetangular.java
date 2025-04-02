package desafio_aula04.area;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    
    @Override
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    @Override
    public double calcularPerimetro(double base, double altura) {
        return (2 * base) + (2 * altura);
    }
    
}

package desafio_aula04.temperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public double celsiusParaFahrenheit(double temperatura) {
        return (temperatura * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperatura) {
        return (temperatura - 32) * 0.5;
    }
    
}

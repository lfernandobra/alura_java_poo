package desafio_aula04.temperatura;

public class TesteTemperatura {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        System.out.println(conversorTemperaturaPadrao.celsiusParaFahrenheit(0));
        System.out.println(conversorTemperaturaPadrao.fahrenheitParaCelsius(32));
    }
}

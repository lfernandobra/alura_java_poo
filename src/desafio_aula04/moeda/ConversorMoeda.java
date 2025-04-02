package desafio_aula04.moeda;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double valor) {
        return valor *= 5.70;
    }
    
}

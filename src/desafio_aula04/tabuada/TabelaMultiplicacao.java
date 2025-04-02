package desafio_aula04.tabuada;

public class TabelaMultiplicacao implements Tabuada{

    @Override
    public String mostrarTabuada(int numero) {
        String resultado = "";

        for(int i = 0; i <= 10; i++) {
            resultado = resultado.concat(numero + "x" + i + " = " + (numero * i) + "\n");
        }

        return resultado;
    }
    
}

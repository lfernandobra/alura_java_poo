package desafio_aula04.precofinal;

public class ProdutoFisico extends Produto implements Calculavel{

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.05;
    }
    
}

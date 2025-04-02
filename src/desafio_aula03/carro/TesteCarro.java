package desafio_aula03.carro;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        double [] precosMedios = {42000, 29000, 35000};
        meuCarro.setNome("Sedan");
        meuCarro.setPrecosMedios(precosMedios);
        meuCarro.exibirInfo();
    }
}

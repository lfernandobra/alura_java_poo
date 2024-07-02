public class Musica {
    String titulo, artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Titulo : " + titulo);
        System.out.println("Artista : " + artista);
        System.out.println("Ano de lançamento : " + anoLancamento);
    }

    void avaliar(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }
}

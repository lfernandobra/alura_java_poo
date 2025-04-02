package desafio_aula04.precofinal;
public class Livro extends Produto implements Calculavel{
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Titulo : " + titulo + "Autor : " +autor);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9;
    }
}

public class AlunoDesafio {
    private String nome;
    private double [] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double media = 0;
        for (int i=0; i<=notas.length; i++) {
            media+=notas[i];
        }
        return media / notas.length;
    }
}

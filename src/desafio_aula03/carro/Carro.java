package desafio_aula03.carro;

public class Carro {
    private String nome;
    private double[] precosMedios = new double[3];
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double[] getPrecosMedios() {
        return precosMedios;
    }
    public void setPrecosMedios(double[] precosMedios) {
        this.precosMedios = precosMedios;
    }

    public double exibeMenorPreco() {
        double menorPreco = 0;
        for (int i = 0; i < this.precosMedios.length; i++) {
            if (i == 0 || menorPreco >= precosMedios[i]) {
                menorPreco = precosMedios[i];
            }
        }
        return menorPreco;
    }
    
    public double exibeMaiorPreco() {
        double maiorPreco = 0;
        for (int i = 0; i < this.precosMedios.length; i++) {
            if (i == 0 || maiorPreco <= precosMedios[i]) {
                maiorPreco = precosMedios[i];
            }
        }
        return maiorPreco;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + nome);
        System.out.println("Preço Ano 1: " + precosMedios[0]);
        System.out.println("Preço Ano 2: " + precosMedios[1]);
        System.out.println("Preço Ano 3: " + precosMedios[2]);
        System.out.println("Menor Preço: " + exibeMenorPreco());
        System.out.println("Maior Preço: " + exibeMaiorPreco());
    }
}

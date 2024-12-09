public class Animal {
    private String nome;
    private double peso;
    private int idade;
    private double producao;

    public Animal(String nome, double peso, int idade, double producao) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.producao = producao;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public double getProducao() {
        return producao;
    }
}

public class Ingrediente {
    private String nome;
    private double valorNutricional;
    private double preco;

    public Ingrediente(String nome, double valorNutricional, double preco) {
        this.nome = nome;
        this.valorNutricional = valorNutricional;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getValorNutricional() {
        return valorNutricional;
    }

    public double getPreco() {
        return preco;
    }
}

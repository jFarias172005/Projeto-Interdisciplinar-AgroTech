import java.util.ArrayList;
import java.util.Scanner;

public class Agrotech {
    private ArrayList<Animal> animais = new ArrayList<>();
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    public void cadastrarAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do animal: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o peso do animal: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a idade do animal: ");
        int idade = scanner.nextInt();
        System.out.print("Digite a produção do animal: ");
        double producao = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        Animal animal = new Animal(nome, peso, idade, producao);
        animais.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }
    
    public void cadastrarIngrediente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do ingrediente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o valor nutricional do ingrediente: ");
        double valorNutricional = scanner.nextDouble();
        System.out.print("Digite o preço do ingrediente: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        Ingrediente ingrediente = new Ingrediente(nome, valorNutricional, preco);
        ingredientes.add(ingrediente);
        System.out.println("Ingrediente cadastrado com sucesso!");
    }

    public void exibirAnimais() {
        System.out.println("Lista de Animais:");
        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome() + ", Peso: " + animal.getPeso() + 
                               ", Idade: " + animal.getIdade() + ", Produção: " + animal.getProducao());
        }
    }

    public void exibirIngredientes() {
        System.out.println("Lista de Ingredientes:");
        for (Ingrediente ingrediente : ingredientes) {
            System.out.println("Nome: " + ingrediente.getNome() + ", Valor Nutricional: " + 
                               ingrediente.getValorNutricional() + ", Preço: " + ingrediente.getPreco());
        }
    }

    public static void main(String[] args) {
        Agrotech agroTech = new Agrotech();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.print("\nMenu:");
            System.out.print("\n\n");
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Cadastrar Ingrediente");
            System.out.println("3. Exibir Animais");
            System.out.println("4. Exibir Ingredientes");
            System.out.println("5. Sair");
            System.out.print("\n");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    agroTech.cadastrarAnimal();
                    break;
                case 2:
                    agroTech.cadastrarIngrediente();
                    break;
                case 3:
                    agroTech.exibirAnimais();
                    break;
                case 4:
                    agroTech.exibirIngredientes();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
        scanner.close();
    }
}

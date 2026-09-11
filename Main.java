import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Animal> animais = new ArrayList<>();

        //Animais da Fazenda
        Vaca vaca1 = new Vaca(111, "Mimosa (Vaca)", "Holandesa", 550, 5);
        Bezerro bezerro1 = new Bezerro(112, "Tata (Bezerro)", "Holandesa", 30, 1);
        Galinha galinha1 = new Galinha(121, "Glória (Galinha)", "Caipira", 2.5, 2);
        Porco porco1 = new Porco(131, "Teodor (Porco)", "Piau", 80, 3);
        Ovelha ovelha1 = new Ovelha(141, "Helena (Ovelha)", "Corridale", 40, 4);

        //Produtos gerados
        vaca1.produzirGarrafasLeite(4);
        ovelha1.coletarLa(2);
        galinha1.coletarOvos(6);


        //Lista dos animais

        animais.add(vaca1);
        animais.add(porco1);
        animais.add(ovelha1);
        animais.add(galinha1);
        animais.add(bezerro1);

        Estoque estoque = new Estoque();
        int opcao;

        do {
            System.out.println("\n-----Escolha o que você quer ver na fazenda: -----\n");
            System.out.println("[1] Ver animais da Fazenda.");
            System.out.println("[2] Comércio (Adicionar produtos)");
            System.out.println("[3] Comércio (Lista de produtos)");
            System.out.println("[4] Comércio (Retirar produtos)");
            System.out.println("[5] Fechar programa.");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    for (Animal animal : animais) {
                        exibirAnimal(animal);
                    }
                    break;

                case 2:

                    produzirProdutos(vaca1,ovelha1 ,galinha1, estoque);
                    break;

                case 3 :
                    estoque.listarProdutos();
                    break;

                case 4:
                   venderProduto(scanner, estoque);
                    break;

                case 5:
                    System.out.println("Fechando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);
        scanner.close();
    }


        public static void exibirAnimal(Animal animal) {


            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.println("Id: [" + animal.getId() + "]");
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Raça: " + animal.getRaca());
            System.out.println("Idade: " + animal.getIdade() + " anos");
            System.out.println("Peso: " + animal.getPeso() + " kg");

            animal.emitirSom();
            animal.statusDoAnimal();

        }
    public static void produzirProdutos(
            Vaca vaca1,
            Ovelha ovelha1,
            Galinha galinha1,
            Estoque estoque) {


        Produto leite = vaca1.produzirGarrafasLeite(4);
        estoque.adicionarProduto(leite);

        Produto la = ovelha1.coletarLa(3);
        estoque.adicionarProduto(la);

        Produto ovos = galinha1.coletarOvos(5);
        estoque.adicionarProduto(ovos);

        System.out.println("\n O rancheiro acaba de fazer a coleta na fazenda!");
    }
    public static void venderProduto(Scanner scanner, Estoque estoque) {
        estoque.listarProdutos();

        System.out.print("\nDigite o ID do produto: ");
        int id = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        double quantidade = scanner.nextDouble();

        estoque.removerProduto(id, quantidade);
    }
}

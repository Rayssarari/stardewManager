import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto novoProduto) {
        for (Produto produto : produtos) {
            if (produto.getId() == novoProduto.getId()) {
                produto.adicionarQuantidade(novoProduto.getQuantidade());
                return;
            }
        }
        produtos.add(novoProduto);
    }
    /*public List<Produto> getProdutos(){
        return produtos;
    }*/

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("O rancheiro não coletou nenhum produto hoje...");
            return;
        }
        System.out.println("\n+++++++++ESTOQUE+++++++++");

        for (Produto produto : produtos) {
            System.out.println("-----------------------------------");
            System.out.println("ID: [" + produto.getId() + "]");
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Quantidade: " + produto.getQuantidade());
        }
        System.out.println("---------------------------");
    }

    public boolean removerProduto(int id, double quantidade) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                if (produto.removerQuantidade(quantidade)) {
                    System.out.println("Seu produto retirado com sucesso!");
                    return true;
                }
                System.out.println("Não temos quantidade suficiente no estoque!");
                return false;
            }
        }
        System.out.println("Produto não encontrado!");
        return false;
    }
}


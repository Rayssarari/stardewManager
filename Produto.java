public class Produto {

    private int id;
    private String nome;
    private double quantidade;


    public Produto(int id, String nome, double quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }


    public double getQuantidade() {
        return quantidade;
    }


    public int getId() {
        return id;
    }

    public void adicionarQuantidade(double quantidade) {
        if (quantidade>0){
        this.quantidade += quantidade;
    }}

    public boolean removerQuantidade(double quantidade) {

        if (quantidade <= 0) {
            return false;
        }

        if (quantidade > this.quantidade) {
            return false;
        }

        this.quantidade -= quantidade;
        return true;
    }

}


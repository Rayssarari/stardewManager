public class Animal implements Animais {
    private String nome;
    private String raca;
    private double peso;
    private int id;
    private int idade;


    @Override
    public void emitirSom() {
        System.out.println("Som: ");
    }

    @Override
    public void statusDoAnimal() {
        System.out.println("Status Atual: ");
    }

    public Animal(int id, String nome, String raca, double peso, int idade){
        this.id =id; this.nome = nome; this.raca = raca; this.peso = peso; this.idade = idade;

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public String getRaca() {
        return raca;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }



}

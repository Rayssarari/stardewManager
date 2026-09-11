public class Vaca extends Animal {

    private Produto garrafasLeite;

    public Vaca(int id, String nome, String raca, double peso, int idade){
        super(id, nome, raca, peso, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("Som: MUU...");
    }

    @Override
    public void statusDoAnimal() {
        System.out.println("Status Atual: Está dando leite.");
    }

    public Produto getGarrafasLeite() {
        return garrafasLeite;
    }

        public Produto produzirGarrafasLeite(int quantidade){
        return new Produto(1, "Garrafas de Leite (500ml)", 2);
    }
}








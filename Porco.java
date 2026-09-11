public class Porco extends Animal {

    public Porco(int id, String nome, String raca, double peso, int idade){
        super(id, nome, raca, peso, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("Som: ÓINC-ÓINC");
    }

    @Override
    public void statusDoAnimal() {
        System.out.println("Status Atual: Abaixo do peso esperado.");
    }


}

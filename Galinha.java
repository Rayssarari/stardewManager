public class Galinha extends Animal {

    private Produto ovos;

    public Galinha (int id, String nome, String raca, double peso, int idade){
        super(id, nome, raca, peso, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("Som: PÓ-PÓ");
    }

    @Override
    public void statusDoAnimal() {
        System.out.println("Status Atual: Botando ovo.");
    }


    public Produto getOvos() {
        return ovos;
    }

    public Produto coletarOvos(int quantidade){
        return new  Produto(3, "Ovos",5);
    }

}

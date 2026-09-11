public class Ovelha extends Animal {

    private Produto laKg;

    public Ovelha(int id, String nome, String raca, double peso, int idade) {
        super(id, nome, raca, peso, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: BÉÉÉÉ");
    }

    @Override
    public void statusDoAnimal() {
        System.out.println("Status Atual: Lã pronta para ser retirada.");
    }

    public Produto getLaKg() {
        return laKg;
    }

    public Produto coletarLa(int quantidade) {
        return new Produto(2, "Lã (Kg)", 3);
    }
}



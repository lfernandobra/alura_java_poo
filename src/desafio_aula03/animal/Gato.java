package desafio_aula03.animal;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Miau Miau!!!");
    }

    public void arranharMoveis() {
        System.out.println("Som de arranhar de moveis.mp3");
    }
}

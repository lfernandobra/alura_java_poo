package desafio_aula03.animal;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au Au Au!!!");
    }

    public void abanarRabo() {
        System.out.println("Som de abano de rabo.mp3");
    }
}

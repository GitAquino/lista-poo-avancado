import animais.*;
import atributos.AnimalAB;

public class Main {
    public static void main(String[] args) {

        Leao leao = new Leao("Rengar", "Leao", 3, "Selva", 0.3f, 4.0f, 4);
        Gato gato = new Gato("Yuumi", "Gato", 3, "Doméstico", 0.3f, 4.0f, 4);
        Peixe peixe = new Peixe("Tham kent", "Peixe", 1, "Aquário", 0.1f, 0.2f);
        Pombo pombo = new Pombo("Azir", "Pombo", 2, "Urbano", 0.4f, 0.5f, 2, 0.6f);
        Cachorro cachorro = new Cachorro("Warwick", "Cachorro", 5, "Doméstico", 0.5f, 20.0f, 4);
        Elefante elefante = new Elefante("Sion", "Elefante", 10, "Selva", 3.0f, 5000.0f, 4);

        processarAnimal(leao);
        processarAnimal(cachorro);
        processarAnimal(elefante);
        processarAnimal(gato);
        processarAnimal(peixe);
        processarAnimal(pombo);
    }

    private static void processarAnimal(AnimalAB animal) {
        animal.comer();
        animal.mover();
        if (animal instanceof Peixe) {
            ((Peixe) animal).nadar();
        } else if (animal instanceof Pombo) {
            ((Pombo) animal).voar();
        } else {
        }
        animal.dormir();
        System.out.println("");
        System.out.println(animal.getTipoAnimal() + ":");
        System.out.println("Nome: " + animal.getNomeAnimal());
        System.out.println("Tipo: " + animal.getTipoAnimal());
        System.out.println("Idade: " + animal.getIdadeAnimal());
        System.out.println("Habitat: " + animal.getHabitat());
        System.out.println("Altura: " + animal.getAlturaAnimal());
        System.out.println("Peso: " + animal.getPesoAnimal());
        System.out.println("Quantidade de Comida: " + animal.getQuantComida());
        System.out.println("Distância Percorrida: " + animal.getDistPercorrida());
        System.out.println("Tempo Dormido: " + animal.getTempoDormido());
        System.out.println("");
        System.out.println("* --- * --- * --- *");
        System.out.println("");

    }
}

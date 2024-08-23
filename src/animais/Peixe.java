package animais;

import lombok.ToString;
import tiposAnimais.AnimalMarinhoAB;

@ToString(callSuper = true)
public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nomeAnimal, String tipoAnimal, int idadeAnimal, String habitat, float alturaAnimal, float pesoAnimal) {
        super(nomeAnimal, tipoAnimal, idadeAnimal, habitat, alturaAnimal, pesoAnimal);
    }

    @Override
    public void comer() {
        quantComida += 2;
        System.out.println("O peixe comeu 2 bolinhas de ração");
    }

    @Override
    public void mover() {
        distPercorrida += 3;
        System.out.println("Peixe nadou 3 metros");
    }

    @Override
    public void dormir() {
        tempoDormido += 4;
        System.out.println("Peixe dormiu por 4 horas.");
    }

    @Override
    public void nadar() {
        System.out.println("Peixe está nadando.");
    }
}

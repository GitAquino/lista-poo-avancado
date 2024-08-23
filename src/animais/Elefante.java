package animais;

import lombok.ToString;
import tiposAnimais.AnimalTerrestreAB;

@ToString(callSuper = true)
public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nomeAnimal, String tipoAnimal, int idadeAnimal, String habitat, float alturaAnimal, float pesoAnimal, int quantidadePatas) {
        super(nomeAnimal, tipoAnimal, idadeAnimal, habitat, alturaAnimal, pesoAnimal, quantidadePatas);
    }

    @Override
    public void comer() {
        quantComida += 5;
        System.out.println("O Elefante comeu 5 melancias.");
    }

    @Override
    public void mover() {
        distPercorrida += 150;
        System.out.println("O elefante andou 150 metros.");
    }

    @Override
    public void dormir() {
        tempoDormido += 5;
        System.out.println("O elefante dormiu por 5 horas.");
    }
}

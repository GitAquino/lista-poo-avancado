package animais;

import lombok.ToString;
import tiposAnimais.AnimalTerrestreAB;

@ToString(callSuper = true)
public class Leao extends AnimalTerrestreAB {

    public Leao(String nomeAnimal, String tipoAnimal, int idadeAnimal, String habitat, float alturaAnimal, float pesoAnimal, int quantidadePatas) {
        super(nomeAnimal, tipoAnimal, idadeAnimal, habitat, alturaAnimal, pesoAnimal, quantidadePatas);
    }

    @Override
    public void comer() {
        quantComida += 3;
        System.out.println("O leão comeu 3 animais");
    }

    @Override
    public void mover() {
        distPercorrida += 200;
        System.out.println("O leão andou 200 metros");
    }

    @Override
    public void dormir() {
        tempoDormido += 3;
        System.out.println("O leão dormiu por 3 horas");
    }
}

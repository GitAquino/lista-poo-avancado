package animais;

import lombok.ToString;
import tiposAnimais.AnimalTerrestreAB;

@ToString(callSuper = true)
public class Gato extends AnimalTerrestreAB {

    public Gato(String nomeAnimal, String tipoAnimal, int idadeAnimal, String habitat, float alturaAnimal, float pesoAnimal, int quantidadePatas) {
        super(nomeAnimal, tipoAnimal, idadeAnimal, habitat, alturaAnimal, pesoAnimal, quantidadePatas);
    }

    @Override
    public void comer() {
        quantComida += 1;
        System.out.println("O gato comeu 1 pote de ração");
    }

    @Override
    public void mover() {
        distPercorrida += 100;
        System.out.println("O gato andou 100");
    }

    @Override
    public void dormir() {
        tempoDormido += 2;
        System.out.println("O gato dormiu por 2 horas.");
    }
}

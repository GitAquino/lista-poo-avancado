package animais;

import lombok.ToString;
import tiposAnimais.AnimalTerrestreAB;

@ToString(callSuper = true)
public class Cachorro extends AnimalTerrestreAB {

    public Cachorro(String nomeAnimal, String tipoAnimal, int idadeAnimal, String habitat, float alturaAnimal, float pesoAnimal, int quantidadePatas) {
        super(nomeAnimal, tipoAnimal, idadeAnimal, habitat, alturaAnimal, pesoAnimal, quantidadePatas);
    }

    @Override
    public void comer() {
        quantComida += 3;
        System.out.println("O cachorro comeu 3 potes de ração");
    }

    @Override
    public void mover() {
        distPercorrida += 45;
        System.out.println("O cachorro andou 45 metros");
    }

    @Override
    public void dormir() {
        tempoDormido += 3;
        System.out.println("O cachorro dormiu por 3 horas");
    }
}

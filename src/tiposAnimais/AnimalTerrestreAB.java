package tiposAnimais;

import atributos.AnimalAB;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public abstract class AnimalTerrestreAB extends AnimalAB {

    protected int quantidadePatas;

    public AnimalTerrestreAB(String nomeAnimal, String tipoAnimal, int idadeAnimal, String habitat, float alturaAnimal, float pesoAnimal, int quantidadePatas) {
        super(nomeAnimal, tipoAnimal, idadeAnimal, habitat, alturaAnimal, pesoAnimal);
        this.quantidadePatas = quantidadePatas;
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void mover();

    @Override
    public abstract void dormir();
}

package tiposAnimais;

import atributos.AnimalAB;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public abstract class AnimalMarinhoAB extends AnimalAB {

    public AnimalMarinhoAB(String nomeAnimal, String tipoAnimal, int idadeAnimal, String habitat, float alturaAnimal, float pesoAnimal) {
        super(nomeAnimal, tipoAnimal, idadeAnimal, habitat, alturaAnimal, pesoAnimal);
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void mover();

    @Override
    public abstract void dormir();

    public abstract void nadar();
}

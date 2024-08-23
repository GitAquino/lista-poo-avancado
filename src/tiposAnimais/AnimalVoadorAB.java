package tiposAnimais;

import atributos.AnimalAB;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public abstract class AnimalVoadorAB extends AnimalAB {

    protected int quantidadeAsas;
    protected double envergaduraAsa;

    public AnimalVoadorAB(String nomeAnimal, String tipoAnimal, int idadeAnimal, String habitat, float alturaAnimal, float pesoAnimal, int quantidadeAsas, double envergaduraAsa) {
        super(nomeAnimal, tipoAnimal, idadeAnimal, habitat, alturaAnimal, pesoAnimal);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsa = envergaduraAsa;
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void mover();

    @Override
    public abstract void dormir();

    public abstract void voar();
}

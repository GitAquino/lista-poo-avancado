package atributos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import metodos.AnimalIF;

@Getter
@Setter
@ToString
public abstract class AnimalAB implements AnimalIF {

    protected int quantComida;
    protected int distPercorrida;
    protected int tempoDormido;

    protected String nomeAnimal;
    protected int idadeAnimal;
    protected String habitat;
    protected float pesoAnimal;
    protected float alturaAnimal;
    protected String tipoAnimal;

    public AnimalAB(String nomeAnimal, String tipoAnimal, int idadeAnimal, String habitat, float alturaAnimal, float pesoAnimal) {
        this.nomeAnimal = nomeAnimal;
        this.tipoAnimal = tipoAnimal;
        this.idadeAnimal = idadeAnimal;
        this.habitat = habitat;
        this.alturaAnimal = alturaAnimal;
        this.pesoAnimal = pesoAnimal;
        this.quantComida = 0;
        this.distPercorrida = 0;
        this.tempoDormido = 0;
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void mover();

    @Override
    public abstract void dormir();
}

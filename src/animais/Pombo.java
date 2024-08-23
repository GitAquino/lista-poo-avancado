package animais;

import lombok.ToString;
import tiposAnimais.AnimalVoadorAB;

@ToString(callSuper = true)
public class Pombo extends AnimalVoadorAB {

    public Pombo(String nomeAnimal, String tipoAnimal, int idadeAnimal, String habitat, float alturaAnimal, float pesoAnimal, int quantidadeAsas, double envergaduraAsa) {
        super(nomeAnimal, tipoAnimal, idadeAnimal, habitat, alturaAnimal, pesoAnimal, quantidadeAsas, envergaduraAsa);
    }

    @Override
    public void comer() {
        quantComida += 1;
        System.out.println("O pombo comeu 1 alpiste");
    }

    @Override
    public void mover() {
        distPercorrida += 250;
        System.out.println("O pombo voou 250 metros");
    }

    @Override
    public void dormir() {
        tempoDormido += 5;
        System.out.println("Pombo dormiu por 5 horas.");
    }

    @Override
    public void voar() {
        System.out.println("Pombo está voando.");
    }
}

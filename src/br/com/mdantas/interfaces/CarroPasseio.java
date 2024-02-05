package br.com.mdantas.interfaces;

/**
 * @author marcelo.dantas
 */
public class CarroPasseio implements ICarro{

    @Override
    public void andar() {
        System.out.println("Carro está andando rápido");
    }
}

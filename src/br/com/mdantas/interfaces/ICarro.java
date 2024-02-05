package br.com.mdantas.interfaces;

/**
 * @author marcelo.dantas
 */
public interface ICarro {

    public default void parar() {
        System.out.println("Carro está em parando");
    }

    public void andar();
}

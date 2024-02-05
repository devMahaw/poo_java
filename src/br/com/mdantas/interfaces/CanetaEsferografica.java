package br.com.mdantas.interfaces;

/**
 * @author marcelo.dantas
 */
public class CanetaEsferografica implements ICaneta{

    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor " + texto + " na classe " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Preta";
    }
}

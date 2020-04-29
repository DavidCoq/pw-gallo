package it.tss;

/**
 * Prodotto
 */
public class Prodotto {

    String nome, marca;

    public Prodotto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

}
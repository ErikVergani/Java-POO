package Aula19;

/**
 * @author ErikVergani
 * @date 07/05/2021
 **/

public class MaquinaSorvete {

    private int leite, emulsificante, chocolate, morango;
    private int numBolasChoco, numBolasMorango, litrosVendidos;

    public MaquinaSorvete() {
        this.leite = 6000;
        this.emulsificante = 6000;
        this.chocolate = 6000;
        this.morango = 6000;
    }

    public void reabastecer() {
        this.leite = 6000;
        this.emulsificante = 6000;
        this.chocolate = 6000;
        this.morango = 6000;
    }

    public int getNumBolasChoco() {
        return numBolasChoco;
    }

    public void addNumBolasChoco(int numBolasChoco) {
        this.numBolasChoco += numBolasChoco;
    }

    public int getNumBolasMorango() {
        return numBolasMorango;
    }

    public void addNumBolasMorango(int numBolasMorango) {
        this.numBolasMorango += numBolasMorango;
    }

    public int getLitrosVendidos() {
        return this.litrosVendidos;
    }

    public void addLitrosVendidos(int litrosVendidos) {
        this.litrosVendidos += litrosVendidos;
    }

    public int getLeite() {
        return leite;
    }

    public void useLeite(int leite) {
        this.leite -= leite;
    }

    public int getEmulsificante() {
        return emulsificante;
    }

    public void useEmulsificante(int emulsificante) {
        this.emulsificante -= emulsificante;
    }

    public int getChocolate() {
        return chocolate;
    }

    public void useChocolate(int chocolate) {
        this.chocolate -= chocolate;
    }

    public int getMorango() {
        return morango;
    }

    public void useMorango(int morango) {
        this.morango -= morango;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7.entidades;

public class Sion {
    
    private String gordura;
    private int altura;
    private int peso;
    private int maldad;

    public Sion(int altura, int peso, int maldad) {
        this.altura = altura;
        this.peso = peso;
        this.maldad = maldad;
    }

    public Sion() {
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    @Override
    public String toString() {
        return "Sion{" + "altura=" + altura + ", peso=" + peso + ", maldad=" + maldad + '}';
    }
    
    
}

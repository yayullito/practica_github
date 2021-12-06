
package javaapplication7.entidades;


public class Veigar {
    
    private int altura;
    private int peso;
    private int maldad;

    public Veigar(int altura, int peso, int maldad) {
        this.altura = altura;
        this.peso = peso;
        this.maldad = maldad;
    }

    public Veigar() {
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
        return "Veigar{" + "altura=" + altura + ", peso=" + peso + ", maldad=" + maldad + '}';
    }
    
    
}

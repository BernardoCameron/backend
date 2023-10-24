package EJ_Mesa;

public class Arbol {
    private String tipoArbol;
    private int alto;
    private int ancho;
    private String color;

    private static int contador =0;

    public Arbol(String tipoArbol, int alto, int ancho, String color) {
        this.tipoArbol = tipoArbol;
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
        contador++;
        System.out.println("Objetos creados: "+contador);
    }

    public String getTipoArbol() {
        return tipoArbol;
    }

    public void setTipoArbol(String tipoArbol) {
        this.tipoArbol = tipoArbol;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

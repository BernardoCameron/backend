package Presencial;

public class Computadora {
    private int ram;
    private int discoDuro;
    private String id;
    private static Integer contador = 0;

    public Computadora(int ram, int discoDuro) {
        this.ram = ram;
        this.discoDuro = discoDuro;
        id = "RAM: "+ram + " HDD: "+discoDuro;
        contador++;
        System.out.println("Objetos creado: "+contador);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

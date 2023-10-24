package EJ_Mesa;

public class Bosque {
    public static void main(String[] args) {
        ArbolFactory plantar = new ArbolFactory();



        for (int i = 0; i < 500; i++) {

            Arbol arbolOrnamental = plantar.getArbol("Ornamental", 200,400,"verde");

            Arbol arbolFrutal = plantar.getArbol("Frutal", 500,300, "Rojo");

        }
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() -
                runtime.freeMemory()) / (1024 * 1024));

    }
}

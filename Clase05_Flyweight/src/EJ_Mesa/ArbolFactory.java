package EJ_Mesa;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    private static Map<String, Arbol> arbolMap;

    public ArbolFactory(){
        arbolMap = new HashMap<>();
    }

    public Arbol getArbol(String tipoArbol,int alto, int ancho, String color ){
        String clave = "Arbol " + tipoArbol + " alto: " + alto + " ancho: " + ancho + " de color "+color;
        if (!arbolMap.containsKey(clave)){
            arbolMap.put(clave, new Arbol(tipoArbol, alto, ancho, color));
            System.out.println("Creado el arbol: " + clave);
        }
        System.out.println("Reutilizado el arbol: " + clave);
        return arbolMap.get(clave);
    }
}

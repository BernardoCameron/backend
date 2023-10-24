package Presencial;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {
    private static Map<String, Computadora> computadoraMap;
    public ComputadoraFactory(){
        computadoraMap = new HashMap<>();
    }
    public Computadora getComputadora(int ram, int discoDuro){
        String clave = "k: " + ram +" hdd: " +discoDuro;
        if (!computadoraMap.containsKey(clave)){
            computadoraMap.put(clave, new Computadora(ram, discoDuro));
        }
        return computadoraMap.get(clave);
    }
}

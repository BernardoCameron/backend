package Presencial;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static final Logger logger=Logger.getLogger(App.class);
    private List<Integer> listaEnteros;

    public App(){
        listaEnteros = new ArrayList<>();
        logger.warn("Creacion de la instancia de la lista");
    }

    public void agregarElementos(Integer numero){
        listaEnteros.add(numero);
        if (listaEnteros.size()> 5){
            //si es mayor a 5 debo loggear
            logger.info("La lista contiene mas de 5 elementos. Elementos totales: "+ listaEnteros.size());
        }
    }
}

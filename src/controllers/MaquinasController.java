package controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Maquina;

public class MaquinasController {
    /* 
    Metodo que ordene un listado de maquinas
    Por su suvred y luego por el nombre
    si ambas son iguales se consideran maquinas iguales
    y se descartan
    */

    public Set<Maquina> ordenarPorSubred(List<Maquina> maquinas){
        Set<Maquina> maquinas0 = new TreeSet<>();
        for(Maquina maquina : maquinas){
            maquinas0.add(maquina);
        }
        return maquinas0;
    }
}
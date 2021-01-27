package com.company;

/**
 * Created by USRKAP on 03/05/2017.
 */
public class Semaforo {
    ColorSemaforo estado;

    public Semaforo() {
        estado = ColorSemaforo.ROJO;
    }

    public void accion(){
        switch (estado){
            case  ColorSemaforo.ROJO:
                System.out.print("parar");
                break;
        }
    }
}

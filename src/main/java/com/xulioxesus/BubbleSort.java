package com.xulioxesus;

/**
 * Clase que contiene un método de ordenación.
 */

class BubbleSort {
    /**
     * El método recibe una lista de números y su tamaño y los ordena.
     * @param arrayDeNumeros
     * @param elementosDelArray
     */
    public void ordenar(int[] arrayDeNumeros, int elementosDelArray) {
        int elementosOrdenados;
        int posicion;
        int valorSuperior;
        boolean cambioDeSitio;
        for (elementosOrdenados = 0; elementosOrdenados < elementosDelArray - 1; elementosOrdenados++) {
            cambioDeSitio = false;
            for (posicion = 0; posicion < elementosDelArray - elementosOrdenados - 1; posicion++) {
                if (arrayDeNumeros[posicion] > arrayDeNumeros[posicion + 1]) {
                    valorSuperior = arrayDeNumeros[posicion];
                    arrayDeNumeros[posicion] = arrayDeNumeros[posicion + 1];
                    arrayDeNumeros[posicion + 1] = valorSuperior;
                    cambioDeSitio = true;
                }
            }

            if (!cambioDeSitio) {
                break;
            }
        }
    }
}

package service;

import entitys.ArrayEntity;
import java.util.Arrays;

public class ArrayService {
    /**
     * Se inicializan los Arrays A y B
     *
     * @return
     */
    public ArrayEntity initializeArrays() {
        double[] arrayA = new double[50];
        double[] arrayB = new double[20];

        return new ArrayEntity(arrayA, arrayB);
    }

    /**
     * Se crea crea la variable newArray de forma global
     * Se inicializa la variable newArray y se guarda el ArrayA en la misma Se
     * rellena el array con números random
     *
     * @param array
     */
    private double[] newArray;

    public void fillArrayA(ArrayEntity array) {
        int tam = array.getArrayA().length;
        newArray = new double[tam];
        newArray = array.getArrayA();

        for (int i = 0; i < tam - 1; i++) {
            newArray[i] = Math.round(Math.random() * 10);
        }
    }

    /**
     * Se imprime el ArrayA
     *
     * @param array
     */
    public void showArrayA(ArrayEntity array) {
        System.out.println("Array A");
        for (int i = 0; i < newArray.length - 1; i++) {
            System.out.print("[" + array.getArrayA()[i] + "]");
        }
        System.out.println("");
    }

    /**
     * Se ordena de menor a mayot los valores del ArrayA, guardados en la
     * variable newArray
     *
     * @param array
     */
    public void orderLeastToGreatest(ArrayEntity array) {
        Arrays.sort(newArray);
    }

    /**
     * Se crea la variable arraySmall para guardar los primeros diez numeros del
     * arrayA
     */
    private double[] arraySmall = new double[10];

    public void topTen(ArrayEntity array) {
        System.out.println("Array Small");
        for (int i = 0; i <= 9; i++) {
            arraySmall[i] = newArray[i];
            System.out.print("[" + arraySmall[i] + "]");
        }
        System.out.println("");
    }

    /**
     * La variable newArray ahora guarda el arrayB Este array recibe los 10
     * valores de arraySmall Tambien, guarda otros 10 valores que son generados
     * de forma aleatoria
     *
     * @param array
     */
    public void fillArrayB(ArrayEntity array) {
        int tam = array.getArrayB().length;
        newArray = array.getArrayB();

        for (int i = 0; i <= (tam / 2) - 1; i++) {
            newArray[i] = arraySmall[i];
        }

        for (int i = (tam / 2); i < tam - 1; i++) {
            newArray[i] = Math.round(Math.random() * 10);
        }
    }

    /**
     * Se imprime el arrayB
     *
     * @param array
     */
    public void showArrayB(ArrayEntity array) {
        System.out.println("Array B");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print("[" + newArray[i] + "]");
        }
        System.out.println("");
    }
}

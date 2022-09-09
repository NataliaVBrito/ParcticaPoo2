/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_poo;

import entitys.ArrayEntity;
import service.ArrayService;

/**
 *
 * @author natyb
 */
public class Ejercicio10_poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        ArrayEntity arrayEntity = arrayService.initializeArrays();

        arrayService.fillArrayA(arrayEntity);
        arrayService.showArrayA(arrayEntity);
        arrayService.orderLeastToGreatest(arrayEntity);
        arrayService.topTen(arrayEntity);
        arrayService.fillArrayB(arrayEntity);
        arrayService.showArrayB(arrayEntity);

    }

}

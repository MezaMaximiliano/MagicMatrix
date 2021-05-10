/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi
 */
public class Principal {
    public static void main(String[] args) {
        Matriz m = new Matriz(3);
        
        m.showMatriz();
        
        if (m.isMagic()){
            System.out.println("LA MATRIZ ES MAGICA.");
        }else{
            System.out.println("LA MATRIZ NO ES MAGICA.");
        }
    }
}

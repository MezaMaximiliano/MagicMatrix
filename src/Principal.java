/*
 Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas)
que tiene como propiedad especial que la suma de las filas, las columnas y las
diagonales es igual
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

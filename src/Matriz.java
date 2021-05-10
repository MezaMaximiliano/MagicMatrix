
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi
 */
public class Matriz {
    private int n;
    private int matrix[][]= new int [n][n];
    static Scanner input = new Scanner(System.in);
    //Constructor sin parametros
    public Matriz(){
       // Scanner input = new Scanner(System.in);
        System.out.print("INGRESE LA DIMENSION DE LA MATRIZ CUADRADA: ");
        this.n=input.nextInt();
        int m[][]=new int[n][n];
        
        for(int i =0;i<n;i++){
            for (int j =0;j<n;j++){
                System.out.print("INGRESE UN NUMERO: ");
                m[i][j]=(int)input.nextInt();
            }
        }
        this.matrix=m;
    }
    
    //sobrecarga de constructor
    public Matriz(int n){
        this.n=n;
        
        int m[][]=new int [n][n];
        for(int i =0;i<n;i++){
            for (int j =0;j<n;j++){
                System.out.print("INGRESE UN NUMERO: ");
                m[i][j]=((int)input.nextInt());
            }
        }
        this.matrix=m;
    }
    
    public void showMatriz(){

        for (int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(this.matrix[i][j] +" ");
            }
            System.out.println("");
        }
    }
    
    public boolean isMagic(){
        boolean  rta =(diagonals() && row() && column());
        return rta;
    }
    
    private boolean diagonals(){
        int sumP=0,sumO=0;
        
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n;j++){
                if(j==i){
                    sumP=sumP+this.matrix[i][j];
                }
            }
        }
        
         for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n;j++){
                if(j+i==this.n-1){
                    sumO=this.matrix[i][j]+sumO;
                }
            }
        }
         
        
        return (sumO==sumP);
    }
    
    private boolean row(){
       int sum=0,sumAux=0;
       boolean rta=true;
       for(int i =0;i<this.n;i++){
           sum=sum+matrix[0][i];
       }
       
       for(int i =0;i<this.n;i++){
           for(int j=0;j<this.n;j++){
               sumAux=sumAux+this.matrix[i][j];
           }
           if (sum!=sumAux){
               rta=false;
           }
           sumAux=0;
       }
        
        return rta;
    }
    
     private boolean column(){
       int sum=0,sumAux=0;
       boolean rta=true;
       for(int i =0;i<this.n;i++){
           sum=sum+matrix[i][0];
       }
       
       for(int i =0;i<this.n;i++){
           for(int j=0;j<this.n;j++){
               sumAux=sumAux+this.matrix[j][i];
           }
           if (sum!=sumAux){
               rta=false;
           }
           sumAux=0;
       }
        
        return rta;
    }
    
    public int[][] getMatrix(){
        return this.matrix;
    }
}

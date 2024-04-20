/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio;

public class Exercicio {

   
    public static void main(String[] args) {
      int n1 = 0,n2 = 0,n3= 0,maior;
      int menor;
      
      //Verifica qual é maior n1 ou n2
        if(n1 > n2){
            //caso n1 for maior a variavel maior recebe n1
            System.out.println("maior" + n1);
        maior = n1;
        menor = n2;
        
        }else{
            //senao n2 recebe maior
        maior = n2;
        menor = n1;
        }
        if(maior > n3){
            System.out.println("Maior número "+ maior);
        }else{
            System.out.println("Maior número"+n3 );
        }
        if(menor < n3){
            System.out.println("menor número" + menor);
        }
        
    }
    
}

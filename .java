package praticando.com;

import java.util.Scanner;


public class Tabuada {

  public static void main(String[] args) {
  
  // O programa irá mostrar a tabuada do número que o usuario digitar 
   
   Scanner entre= new Scanner(System.in);
   System.out.println("Digite um número: ");
   int n=entre.nextInt();
   
   for(int i=0;i<11;i++){
   
   int mult= n*i;
   
   System.out.println(+n+"X"+i+"="+mult);
   
    }
   
   entre.close(); 


  }

}

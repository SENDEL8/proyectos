
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        
        int a;
        int b;
        int opc;
        Scanner tecla = new Scanner(System.in);
        
        //primer numero
        System.out.println("ingrese el primer numero");
        a = tecla.nextInt();
        tecla.nextLine();
        //segundo numero
        System.out.println("ingrese el primer numero");
        b = tecla.nextInt();
        tecla.nextLine();
        
                
        System.out.println("eliga la operacion:");
        System.out.println("Sumar - 1");
        System.out.println("Restar - 2");
        System.out.println("multiplicar - 3");
        System.out.println("Dividir - 4");
        opc = tecla.nextInt();
        tecla.nextLine();
        
        /*if(opc==1)
        {
        System.out.println("la suma es:"+(a+b));
        }
        
        else
        {
            if(opc==2)
            {
            System.out.println("la resta es:"+(a-b));
            }
            else
            {
            
            }
        }*/
        
      switch(opc)
      {
          case 1:
              {
                System.out.println("la suma es:"+(a+b));
              }break;
          case 2:
              {
                System.out.println("la resta es:"+(a-b));
              }break;    
          case 3:
              {
                System.out.println("la multiplicacion es:"+(a*b));
              }break;
          case 4:
              {
                if(a==0)
                {
                    System.out.println("no se puede realizar");
                }
                else
                {
                    if(b==0)
                    {
                        System.out.println("no de puede realizar");
                    }
                    else 
                    {
                       System.out.println("la divicion es:"+(a/b)); 
                    }
                }
              }break;   
              
         default:
         {
             System.out.println("debe elegir entre el numeto de opciones");
         }
      }
    }
    
}

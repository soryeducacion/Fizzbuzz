/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fizzbuzz;

/**
 *
 * @author soryl
 */
public class FizzBuzz {
    
    public static void main(String[] a){
        int n = 14;
        double b;
        String valor;
        String mensaje = "hola";
        valor = ( n % 3 ) ==0 ? "fizz" : "";
        
        for(int x=1; x<=15; x++){
            boolean fizz = (x%3==0), buzz = (x%5==0);
            //System.out.println(fizz ? buzz ? "FizzBuzz" : "Fizz" : buzz ? "Buzz" : (x/(2*Math.PI)));
            
            System.out.println( (x%15 == 0) ? "FizzBuzz" : (x%3 ==0) ? "Fizz" : (x%5 ==0) ? "Buzz" : Math.PI*(Math.pow(x,x)) );
            
                  
        }
        
       float da=10; 
        float con=(float) ((da*Math.PI)/180);//convercion de radianes a sexagesimales
      
        System.out.println("dato "+Math.sin(con));//jTextField1.setText(String.valueOf(Math.sin(con)));
      
                        
        
        //b = (n/(2*Math.PI));
        //System.out.print(b);
        
        
        
    }
    
}

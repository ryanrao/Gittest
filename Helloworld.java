/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;


public class Helloworld {
   
    public static double average (double[] numbers) 
{
  double ans = 0.00;
  int counter = 0;
  int len = numbers.length;
  double x = 0.00;
  while(counter<len){
     
      x=x+numbers[counter];
       counter++;
}
  
  ans = x / len;
  return (x / len);
}

    
    
    public static void main(String[] args){
    
    double[] numbers = new double[10];
    
    numbers[0] = 1.0;
    numbers[1] = 2.0;
    numbers[2] = 3.0;
    numbers[3] = 4.0;
    numbers[4] = 5.0;
    numbers[5] = 6.0;
    numbers[6] = 7.0;
    numbers[7] = 8.0;
    numbers[8] = 9.0;
    numbers[9] = 10.0;
    
    
    
        System.out.println("The Average Is" + average(numbers));
    
    

    
        
    
        
    }
        
    
    
    
            
        
        
        
        
        
        
        
        

            
        }
               
            
           
            
                    




    


/*
Lab 4
Partners: Alyssa Adams and Jillian Sizemore
Date: 9 February 2021
*/
import java.util.Random;

class Main {
  public static void main(String[] args) {
  Random r = new Random();

  int randomInt = r.nextInt(50)+1;
  
  for(int count = randomInt; count >= 0; count--)
   {	
    System.out.println(count);
    }

  System.out.println("The Random Number is: " +randomInt);

 
  if (randomInt <= 5 ){
    System.out.println("Ahoy Mateys!"); 
  }
  if (randomInt > 25 && randomInt< 42){
    System.out.println("Cannonball!"); 
  }
  else {System.out.println("Blast Off!"); }
  
  }
}
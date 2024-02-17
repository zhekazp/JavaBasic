package homeWorks.homeWork12.classes;

import classes.UserInput;

public class Factorial {
   public int calculateFactorial(int n){
       int factorial=1;
       for(int i=2;i<=n;i++){
           factorial*=i;
       }
       return factorial;
   }
}

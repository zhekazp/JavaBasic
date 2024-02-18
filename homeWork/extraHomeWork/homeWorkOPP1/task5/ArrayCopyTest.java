package homeWorkOPP1.task5;

import java.util.Arrays;

/*Develop a class with a method that copies numbers in a given range
from one array to another:

int[] copyInRange(int[] in, int numberFrom, int numberTo)

This method should return a new array that contains
only those numbers that are greater than or equal to numberFrom and less than or equal to numberTo.
The size of the output array must be equal to the number of elements in it.

The logic must be implemented in a separate ArrayCopy class.

*/
public class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopy app=new ArrayCopy();
        int[] originArray= {17, 9, 11, 7, 17, 18, 12, 0, 10, 12, 19, 6};
        int[] newArray= app.copyInRange(originArray,6,7);
        boolean test=true;
        if(newArray.length!=2){
            test=false;
        } else {
            for (int i = 0; i < newArray.length; i++) {
                if (newArray[i] < 6 || newArray[i] > 7) {
                    test = false;
                    break;
                }
            }
        }
        if(test){
            System.out.println("application works correct");
        }else{
            System.out.println("application works incorrect");
        }
    }
}

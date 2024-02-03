package homeWork14.classes;

public class ManagerHW14_1 {
    private boolean[] numbers;

    private void testArrayInit(int[] numbers) {
        this.numbers=new boolean[numbers.length+1];

        for (int i=0;i< numbers.length;i++){
            this.numbers[numbers[i]-1]=true;
        }
    }
    public int getMissingNumber(int[] array){
        testArrayInit(array);
        for (int i=0;i<numbers.length-1;i++){
            if(!numbers[i]){
                return i+1;
            }
        }
        return 0;
    }
    public void printResult(int[] array){
        int res=getMissingNumber(array);
        if(res!=0){
            System.out.println("Missing number is :"+res);
        }else{
            System.out.println("There is no one missing number");
        }
        System.out.println();
    }
}

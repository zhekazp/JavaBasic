package homeWorkOPP1.task5;

public class ArrayCopy {
    private int[] array;
    private int[] resultArray;

    public ArrayCopy() {
        createData();
    }
    private void createData(){
        int count=(int)(Math.random()*15)+5;
        array=new int[count];
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*21);
        }
    }
    public int[] getArray(){
        return array;
    }
    public int[] copyInRange(int[] in, int numberFrom, int numberTo){
        array=in;
        resultArray=new int[getRange(numberFrom,numberTo)];
        int index=0;
        for (int i=0;i<array.length;i++){
            if(test(array[i],  numberFrom,  numberTo)){
                resultArray[index]=array[i];
                index++;
            }
        }
        return resultArray;
    }
    private int getRange(int numberFrom, int numberTo){
        int result=0;
        for (int i=0;i<array.length;i++){
            if(test(array[i],numberFrom,numberTo)){
                result++;
            }
        }
        return result;
    }
    private boolean test(int testedNumber, int min, int max){
        return (testedNumber >=min) &&  (testedNumber <=max);
    }

}

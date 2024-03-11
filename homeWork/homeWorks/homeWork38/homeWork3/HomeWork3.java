package homeWorks.homeWork38.homeWork3;

public class HomeWork3 {
    public static void main(String[] args) {
        testPalindrom newTest=(str)->{
            int j=0;
            for(int i=str.length()-1;i>=str.length()/2;i--){
                if(str.charAt(i)!=str.charAt(j)){
                    return false;
                }
                j++;
            }
            return true;
        };
        System.out.println(newTest.test("partatrap"));
    }
    interface testPalindrom{
        boolean test(String str);
    }
}

package homeWork1;

public class Home_Work1_3 {
    public static void main(String[] args) {
        UserInput ui=new UserInput();
        int n=ui.inputInt("Enter number from 1 to 9");
        System.out.println("Here is multiplication table:");
        System.out.println(n+" * 1= "+n);
        System.out.println(n+" * 2= "+n*2);
        System.out.println(n+" * 3= "+n*3);
        System.out.println(n+" * 4= "+n*4);
        System.out.println(n+" * 5= "+n*5);
        System.out.println(n+" * 6= "+n*6);
        System.out.println(n+" * 7= "+n*7);
        System.out.println(n+" * 8= "+n*8);
        System.out.println(n+" * 9= "+n*9);

    }
}

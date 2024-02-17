package homeWorks.homeWork9;

public class HomeWork9_2 {
    public static void main(String[] args) {
        int n1=(int)(Math.random()*100+1);
        int n2=(int)(Math.random()*100+1);
        int n3=(int)(Math.random()*100+1);
        int n4=(int)(Math.random()*100+1);

        System.out.println("We have 4 random numbers: "+n1+" "+n2+" "+n3+" "+n4);

        if(n1 > n2 && n1 > n3 && n1 > n4){
            System.out.println("The biggest number is "+n1);
        } else if (n2 > n3 && n2 > n4){
            System.out.println("The biggest number is "+n2);
        }else if (n3 > n4){
            System.out.println("The biggest number is "+n3);
        }else {
            System.out.println("The biggest number is "+n4);
        }
    }
}

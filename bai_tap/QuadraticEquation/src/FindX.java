import java.util.Scanner;

public class FindX {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("---Program solve Quadratic Equation---");
        System.out.println("Please input a,b,c");
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();

    QuadraticEquation quadraticEquation= new QuadraticEquation(a,b,c);
    if (a==0){
        if(b!=0 & c!=0){
        System.out.println("phương trình có nghiệm là: x= "+ (-c/b));
    } if (b==0 & c!=0){
            System.out.println("phương trình vô  nghiệm");
        }if (b==0 & c==0){
            System.out.println("phương trình vô số nghiệm");
        }
    }
    if (a!=0) {
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("phương trình có nghiệm kép: " + quadraticEquation.getRoot1());
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("phương trình có 2 nghiệm là: " + "x1= " + quadraticEquation.getRoot1() + " x2= " + quadraticEquation.getRoot2());
        }
    }
}
}
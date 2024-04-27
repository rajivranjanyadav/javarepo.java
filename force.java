import java.util.Scanner;

public class force {

    public static void main(String []args)
    {
        Scanner k=new Scanner(System.in);
        int m,a;
        System.out.print("Enter mass and acceleration");
        m=k.nextInt();
        a=k.nextInt();
        int f;
        f=m*a;
        System.out.print("force"+f);
        k.close();

    }
}
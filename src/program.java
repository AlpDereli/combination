import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Please enter the number n for C(n,r): ");
        int n = take.nextInt();
        System.out.println("Please enter r value: ");
        int r = take.nextInt();
        int nfa = 1;
        int rfa = 1;
        int nrfa =1;
        for (int i = 1; i <= n;i++)
        {
            nfa*=i;
        }
        for (int j = 1; j<=r; j++)
        {
            rfa *=j;
        }
        int fark = n-r;
        for (int e = 1; e <=fark; e++ )
        {
            nrfa*=e;
        }
        System.out.println("C(n,r)= " + (nfa/(rfa*nrfa)));
    }
}

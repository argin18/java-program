package Method;

public class Factorial {
    public static void fact (int a){
        if(a<0){
            System.out.println("Invalid Number");
        }
        int f=1;
        for(int i= a; i>=1; i--){
            f*=i;
        }
        System.out.println("Factorial number is :" + f);
        return;
    }

    public static void main(String[] args) {
        int n=5;
        fact(n);
    }
}

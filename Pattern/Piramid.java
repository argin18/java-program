public class Piramid {
    public static void main(String[] args) {
        int n =5;

        for (int i = 1; i<=n; i++){
            
            for(int k= 1; k<=n-i; k++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("palindromic number pyramid");

        // palindromic number pyramid.
        for (int i = 1; i<=n; i++){
            
            for(int k= 1; k<=n-i; k++){
                System.out.print(" ");
            }

            for(int j = i; j>=1; j--){
                System.out.print(j);
            }

            for(int j = 2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();


        //Half piramid
        System.out.println("Half piramid of number");
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //Inverted Half piramid
        System.out.println("Inverted Half piramid of number");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

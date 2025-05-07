public class SolidRombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            int space =n-i;
            for(int j= 1; j<=space; j++){
                System.out.print("  ");
            }

            for(int k = 1; k<=n;  k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Hollow Rombus
        System.out.println();
        
        for(int i=1; i<=n; i++){
            int space =n-i;
            for(int j= 1; j<=space; j++){
                System.out.print("  ");
            }

            for(int k = 1; k<=n;  k++){
                if(i==1 || k==1 || k==n ||  n==i ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

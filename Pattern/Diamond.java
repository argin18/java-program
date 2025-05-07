public class Diamond {
    public static void main(String[] args) {
        int n=4;
        // upper side
        for(int i = 1; i<=n; i++){

            for(int k= 1; k<=n-i; k++){
                System.out.print(" ");
            }

            for(int j = i; j>=1; j--){
                System.out.print("*");
            }

            for(int j = 2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Down side
        for(int i = n; i>=1; i--){

            for(int k= 1; k<=n-i; k++){
                System.out.print(" ");
            }

            for(int j = i; j>=1; j--){
                System.out.print("*");
            }

            for(int j = 2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

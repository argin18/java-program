public class PascleTrangle {
    public static void main(String[] args) {
        int n=5;
        for(int i =0; i<n; i++){
            for(int k= 1; k<=n-i; k++){
                System.out.print(" ");
            }
            int value=  1;
            for(int j =0; j<=i; j++){
                System.out.print(value+" ");
                value= value*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}

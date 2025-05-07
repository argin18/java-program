
public class HalfPiramid {
    public static void main(String[] args) {
        int n = 4;
        // left side
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        // Right side
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        // inverted half piramid(rotate 180 Degree)
        for(int i=n; i>=1; i--) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            
            for(int j=0; j<=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        n=5;
        // left side number
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        
        // right side number
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        int num= 1;
        // left side number serial
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

        System.out.println();

        // 0/1 trangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               int sum= i+j;
               if(sum %2 ==0){
                System.out.print("1 ");
               }else{
                System.out.print("0 ");
               }
            }
            System.out.println();
        }

    
    }
}

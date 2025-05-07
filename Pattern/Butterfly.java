public class Butterfly {
    public static void main(String[] args) {
        int n =4;
        //upper side
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        //lower side
        for(int i = n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(n-i);

            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();

        n=5;
        //Hollow butterfly
        //upper side
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==1 || j==1 || j==n ||  j==i ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            int space = 2*(n-i);
            
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++){
                if(i==1 || j==1 || j==n ||  j==i ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
        //lower side
        for(int i = n; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(i==1 || j==1 || j==n ||  j==i ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            int space = 2*(n-i);

            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                if(i==1 || j==1 || j==n ||  j==i ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

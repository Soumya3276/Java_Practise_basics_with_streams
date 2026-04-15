package Patterns;
public class PatternDemo6 {

//     *******
//      ***** 
//       ***  
//        *   
    public static void main(String[] args) {
        //inverted pyramid

        int n = 4;

        for(int i=1;i<=n;i++){

            //left part
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }

            for(int k= 1;k<=n-i+1;k++){
                System.out.print("*");
            }

            //right part
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("*");
            }

            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }

            System.out.println();

            }
        }
    }
    


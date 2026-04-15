package Patterns;
public class PatternDemo7 {
    
// 1
// 01
// 101
// 0101

static void binTriangle(int n){
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++){

            if((i+j)%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }

        for(int k=1;k<=n-i;k++){
        System.out.print(" ");
        }
        System.out.println();
        
    }
}

static void bin2Triangle(int n)
{
        int value = 1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(value);
                value = 1-value;
            }
                
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
}




    public static void main(String[] args) {
        
    System.out.println("Using matrix logic: "+"\n");    
    binTriangle(5);

    System.out.println("Using flipping logic: "+"\n");
    bin2Triangle(5);
    }
}




public class Rohmbuspattern {
    public static void main(String[] args) {
        int n= 4;
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i-1;j++){
                System.out.print(" ");
            }
            if(i!=0){
                System.out.print("*"); 
            }
            System.out.println();


        }
         for(int i=0;i<n-1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<n-i-2;j++){
                System.out.print(" ");
            }
            if(i==0){
                System.out.print(" "); 
            }
            if(i!=n-1-1){
                System.out.print("*"); 
            }

            System.out.println();
         }


    }
}

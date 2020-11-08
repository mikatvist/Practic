package LOOP1;

public class NestedLoop {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){

            for (int j=0; j<=4; j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++=");
         for(int k=1; k<=7; k++){
             //System.out.println("*");
             for (int q=1; q<=k; q++){
                 System.out.print("*");

             }
             System.out.println();
         }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         int d=0;
         int c=7;
         for (d=0; d<c-2; d+=2){
             System.out.println(d+" ");
         }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         int z = 0;
         while (z<=4){
             z++;
             System.out.println(z);

         }
        System.out.println("________________________________________________________-");
         int e = 5;
         for (int a =5; a>0; a--){
             e+=a;
             System.out.println(e);
         }

    }
}

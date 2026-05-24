public class NumberSquare {
    public static void main(String[] args){
       int count=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(count<=9){
                    System.out.print(count++ +"  ");
                }
                else{
                    System.out.print(count++ +" ");
                }

            }
            System.out.println();
        }
    }
}

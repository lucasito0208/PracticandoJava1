public class Asteriscos4 {
    public static void main(String[] args){
        int k = 0;
        for(int i = 1; i <= 7; i++){
            int b = i <= 4 ? k++ : k--;
            for(int j = 1; j <= 7; j++){
                if(j >= 5 - b && j<= 3 + b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}

public class Asteriscos3 {
    public static void main(String[] args){

        for(int i = 1; i <= 5; i++){
            char a = '1';
            for(int j = 1; j <= 9; j++){
                if(j>=5-i && j<=3+i){
                    System.out.print(a);
                    char b = j < 4 ? a++ : a--;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}

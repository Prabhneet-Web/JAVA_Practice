package general_practice;

public class array {
    public static void main(String[] args) {
        String[][] arr = { { "Hey ", "there! " }, { "I ", "hope " },
                { "you ", "are " }, { "doing ", "well" } };
        for(int i = 0; i < 4; i++){
            for(int j = 0; j<2; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}

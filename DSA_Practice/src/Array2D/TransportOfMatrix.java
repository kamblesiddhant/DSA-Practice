package Array2D;

public class TransportOfMatrix {

    public static void main(String args[]){
        int row = 2, col = 3;
        String array[][] = {{"a11", "a12", "a13"},
                            {"a21", "a22", "a23"}};

        String[][] transport = new String[col][row];
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                transport[j][i] = array[i][j];
            }
        }

        for (int i = 0; i<transport.length; i++){
            for (int j = 0; j<transport[0].length; j++){
                System.out.print(transport[i][j]+" ");
            }
            System.out.println();
        }
    }
}

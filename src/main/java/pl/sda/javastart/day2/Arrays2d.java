package pl.sda.javastart.day2;

public class Arrays2d {

    public static void main(String[] args) {

       // printGrid(5, 5);
        fillWithNumbers();
    }

    public static void printGrid(int n, int m) {

        int[][] arrays = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print(arrays[i][j]+ "  ");
            }

            System.out.println();
        }
    }

    public static  void fillWithNumbers(){

        int [] [] ints = new int [5][5];

        for (int i = 0; i < ints.length; i++) {
            for(int j =0; j< ints[i].length; j++){ //pammietaj dwu wymiarowa xdd

                if(i==j){

                    ints[i][j]=j;
                }

                System.out.print(ints[i][j]);
            }

            System.out.println();
        }

    }

}

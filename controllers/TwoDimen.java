public class TwoDimen {
    
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];

        matrix[0][0] = 1; matrix[0][1] = 2; matrix[0][2] = 3; matrix[0][3] = 4;
        matrix[1][0] = 5; matrix[1][1] = 6; matrix[1][2] = 7; matrix[1][3] = 8;
        matrix[2][0] = 9; matrix[2][1] = 10; matrix[2][2] = 11; matrix[2][3] = 12;

        int[][] numbers = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}

        };

        //---------------------------------------------------------------separate functions-------------------------------------------//

        //for (int row=0; row<matrix.length; row++){
        //  for (int col=0; col<matrix[row].length; col++){ //2nd statement macamni sbb matrix dah tukar jd row in 1st for statement, so kena mention matrix ubah jadi row hence col<matrix[row]
        //      System.out.println(matrix[row][col]);
        //}


        // method number 2


        for (int[] number: numbers){
            for (int value: number){
                System.out.println(value);
            }
        }
    }
}


public class ArraysDemo {
    public static void main(String[] args) {

        // 1. Declare + Initialize with values
        int numbers[] = {10,20,30,40,50,60};

        // Printing array using for loop
        System.out.print("Numbers: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(" "+numbers[i]);
        }
        System.out.println();

        // 2. Declare size first, assign later
        double scores[] = new double[6]; // creates [0,0,0,0,0]
        scores[0] = 400.9;
        scores[1] = 589.00;
        scores[2] = 697.10;
        scores[3] = 769.40;
        scores[4] = 885.7;
        scores[5] = 999.00;


        // Printing array using enhanced for loop
         System.out.print("Scores: ");
        for(double score : scores){
            System.out.print(" "+score);
        }
         System.out.println();

        // 3. String array
        String names[] = {"Pop","Kop","Mop"};       

        // Printing array using while loop
         System.out.print("Names: ");

        int index = 0;
        while( index < names.length){
            System.out.print(" "+names[index]);
            index++;
        }
         System.out.println();

         // Two - Dimensional Array
        int matrix[][] = {
            {10,20,30},
            {10,20,30},
            {10,20,30}
        };

         System.out.println("Matrix: ");
       for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
             System.out.print(matrix[i][j] + " ");
        }
           System.out.println();
     }


    }
    
}

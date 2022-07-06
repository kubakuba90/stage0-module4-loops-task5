package school.mjc.stage0.loops.task5;

public class Triangle {


    public void printTriangle(int cathetusLength) {
        int i, j;

        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<cathetusLength; i++)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement


            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("8");
            }
            for(j=1*(cathetusLength-i); j-2 >= 0; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            // ending line after each row
            System.out.println();
        }
    }

}

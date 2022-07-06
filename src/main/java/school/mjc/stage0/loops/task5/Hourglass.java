package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {


        if(height%2==0) {
            hourGlassEven(height/2);
        }
        else {
            hourGlassOdd((height/2)+1);
        }


    }

    public static void hourGlassOdd(int nRows)
    {
        int i,j,k,l;

        for(i=0;i<nRows;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<nRows-i;k++)
            {
                System.out.print("8");
            }
            for(l=0;l<nRows-i-1;l++)
            {
                System.out.print("8");
            }
            for(int x = nRows - i; x < nRows; x++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for(i=0;i<nRows-1;i++)
        {
            for(j=0;j<nRows-i-2;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<i+2;k++)
            {
                System.out.print("8");
            }
            for(l=0;l<i+1;l++)
            {
                System.out.print("8");
            }
            // problemowy fragment
            for(j=0;j<nRows-i-2;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void hourGlassEven(int nRows)
    {
        int i,j,k,l;

        for(i=0;i<nRows;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<nRows-i;k++)
            {
                System.out.print("8");
            }
            for(l=0;l<nRows-i;l++)
            {
                System.out.print("8");
            }
            for(int x = nRows - i; x < nRows; x++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for(i=0;i<nRows;i++)
        {
            for(j=0;j<nRows-i-1;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<i+1;k++)
            {
                System.out.print("8");
            }
            for(l=0;l<i+1;l++)
            {
                System.out.print("8");
            }
            // problemowy fragment
            for(j=0;j<nRows-i-1;j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

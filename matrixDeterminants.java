import java.util.Scanner;
public class matrixDeterminants
{
    int [][] matrix;

    public matrixDeterminants(int dimension)
    {
        matrix = new int[dimension][dimension];
    }

    public void populateMatrix()
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                matrix[i][j] = (int)(Math.random() * (10));
            }
        }
    }

    public void printMatrix()
    {
        for(int [] row : matrix)
        {
            for(int element : row)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public int calculateDeterminant()
    {
        if(matrix[0].length == 1)
        {
            int a = matrix[0][0];
            return a;
        }

        if(matrix[0].length == 2)
        {
            int a = matrix[0][0];
            int b = matrix[0][1];
            int c = matrix[1][0];
            int d = matrix[1][1];
            return (a * d) - (b * c);
        }

        if(matrix[0].length == 3)
        {
            int a = matrix[0][0];
            int b = matrix[0][1];
            int c = matrix[0][2];
            int d = matrix[1][0];
            int e = matrix[1][1];
            int f = matrix[1][2];
            int g = matrix[2][0];
            int h = matrix[2][1];
            int i = matrix[2][2];
            int detA = a * ((e * i) - (f * h));
            int detB = b * ((d * i) - (g * f));
            int detC = c * ((d * h) - (e * g));
            return detA - detB + detC;
        }

        return 0;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows/columns of your square matrix: ");
        int dimension = scanner.nextInt();
        matrixDeterminants matrixDeterminants = new matrixDeterminants(dimension);
        matrixDeterminants.populateMatrix();
        System.out.println("Matrix:");
        matrixDeterminants.printMatrix();
        System.out.println("Matrix determinant: " + matrixDeterminants.calculateDeterminant());
    }

}

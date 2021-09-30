import java.util.*;
class pgm4
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int m,n,i,j;
        System.out.println("enter no of rows & columns of matrices:");
        m=s.nextInt();
        n=s.nextInt();
        int[][] first=new int[m][n];
        int[][] second=new int[m][n];
        int[][] sum=new int[m][n];
        System.out.println("enter elements of 1st matrix:");
        for(i=0;i<m;i++)
        for(j=0;j<n;j++)
        first[i][j]=s.nextInt();
        System.out.println("enter elements of 2nd matrix:");
        for(i=0;i<m;i++)
        for(j=0;j<n;j++)
        second[i][j]=s.nextInt();
        sum[i][j]= first[i][j]+second[i][j];

    }
}
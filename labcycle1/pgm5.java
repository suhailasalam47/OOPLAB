import java.util.Scanner;

class pgm5 {
    public static void main(String args[]){
        int m,n,i,j;
        System.out.println("enter order of matrix");
        Scanner s=new Scanner(System.in);
        m=s.nextInt();
        n=s.nextInt();
        int mat[][]=new int[m][n];
        System.out.println("enter elements of matrix");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++)
            mat[i][j]=s.nextInt();

        }
        System.out.println("dispalying matrix");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(mat[i][j]+"\t");
                
                
            }
            System.out.println();
        }
        if(m!=n)
                System.out.println("not symmetric ,colum and row are diiferent");
        else
        {
            boolean temp=false;
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    if(mat[i][j]==mat[j][i]){
                        temp=true;
                       
                    }
                }

                }
                if(temp)
                System.out.println("symmetric");
                else
                System.out.println(" not symmetric");
        }        
    }
    
}

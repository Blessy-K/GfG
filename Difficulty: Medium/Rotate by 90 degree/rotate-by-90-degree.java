class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat.length/2;j++)
                {
                    int t = mat[i][j];
                    mat[i][j]=mat[i][mat.length-j-1];
                    mat[i][mat.length-j-1]=t;
                }
            }
            for(int i=0;i<mat.length-1;i++)
            {
                for(int j=i+1;j<mat.length;j++)
                {
                    int t = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = t;
                }
            }
        //   for(int i=0;i<mat.length;i++)
        //   {
        //       for(int j=0;j<mat.length;j++)
        //       {
        //           System.out.print(mat[i][j]+" ");
        //       }
        //       System.out.println();
        //   }
          
    }
}
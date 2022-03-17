//https://leetcode.com/problems/reshape-the-matrix/
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        ArrayList<Integer> list = new ArrayList();
        if(mat.length * mat[0].length == r*c){
            int[][] arr =  new int[r][c];

            for(int i=0; i < mat.length; i++){

                for(int j=0;j < mat[i].length; j++){

                    list.add(mat[i][j]);

                }

            }
           
            int i = 0, j = 0;

            for(int k=0; k < list.size(); k++){
               // System.out.println(arr[i][j]);
                arr[i][j++] = list.get(k);

                if(j==c){
                    i++;
                    j=0;
                }

            }
            return arr;
        }else
            return mat;
    }
}
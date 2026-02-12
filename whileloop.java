class Matrix Transpose {
 
 public static void main (String[]args){
 int[] originalMatrix ={
 int[][] originalMatrix ={
 {1,2,3,}
 {4,5,6,}
}; 
int rows =originalMatrix.length;
int columb =originalMatrix[0].length;

//creat a new matrix for the transposed data 
int[][] transposedMatrix=new int[colims][rows];


//Loop through the original Matrix andd transposed its values 
for(int i=0;i<rows;j++){
  for(int j=0;j<columbs;j++){
   transposedMatrix[j][i]=originalMatrix[i][j];
    
  }
 } 
//Dispaly the original matrix
system.out.print("Original Matrix:");
printMatrix(originalMatrix);


//Display the transposed matrix
system.out.print("\n Transposed Matrix:");
printMatrix(transposdMatrix);
 
} 

//Helper method to print a matrix
public static void printMatrix(int[][] matrix 
  for(int i=0;i<matrix.length;i++){
   for(int j=0;j<matrix[0].length;j++){
    syustem.out.print(matrix[i][j]+" ");
    }
    sysem.out.print();//Move to the next row
    }
   }
 }
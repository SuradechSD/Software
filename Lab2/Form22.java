package Lab2;

public class Form22 {
    public static void main(String[] args) {

            final int size = 5;
            int[][] grid = new int[size][size];
            for(int i=0;i<size;i++){
                for (int j=0;j<size;j++){
                    grid[i][j] = i*size+j+1;
                    System.out.print(grid[i][j]+"\t");
                }   //สร้างช่องตัวเลข
                System.out.println();
            }
//-------------------------------------------------------------
            System.out.println();
            for(int j=0; j<size; j++) {
                for(int i=0; i<size; i++) {
                    System.out.print(grid[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println();
            for(int i=0; i<size;i++) {
                if(i%2==0) {
                for(int j=0; j<size; j++) {
                    System.out.print(grid[i][j]+"\t");
                }
                }
                else {
                    for(int j=size-1; j>=0; j--) {
                        System.out.print(grid[i][j]+"\t");
                    }
                }
                System.out.println();
            }      
    }
    
} 

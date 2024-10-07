import java.util.Arrays;
public class ArrayMD {

    public static void main(String[]args){
        int [][] matrix = { {1,2,3},{4,5,6,7},{8,9}};
        int ArraySizeRows=matrix.length;
        
        //main matric lenght
        System.out.println( "The lenght of the matric is :" + matrix.length);
        

        //length of each subarray
        for (int i=0; i<matrix.length; i++){
            System.out.println("Sub array length for line " + i + " is " + matrix[i].length);
        }
        

        // this is if use String method source https://www.programiz.com/java-programming/examples/print-array
        System.out.println(Arrays.deepToString(matrix));

        // this is using nested
        for(int i = 0; i < matrix.length; i++){ 
            for(int j = 0; j < matrix[i].length; j++){ 
                System.out.print("{" + matrix[i][j]+ "}");
               
            }
            System.out.println();
        }
    } 
    
}

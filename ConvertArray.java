import java.util.Arrays;

public class ConvertArray
{
    int[][] array = {{11,22,33,44},
                     {55,66,77,88}};

    //print the array instance variable
    void printArray()
    {
        for(int[] index: array) {
            System.out.println(Arrays.toString(index));
        }
    }

    //convert the array rows to columns
    void convertColRow()
    {
        //rearranging the current 2d array of integer elements to a new 2d array 
        int[][] newArray = new int[array[0].length][array.length];
        
        for(int c = 0; c<array[0].length;c++){
            //for each col
            for(int r = 0; r<array.length; r++){
                //for each column in row index
                newArray[c][r] = array[r][c];
            }
        }
        //be sure to declare this, otherwise it 
        array=newArray;
    }

}

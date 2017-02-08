import java.util.Arrays;//this will come in handy for the enhanced for loop trust me

public class ConvertArrayNotes {
    int[][] array = {{11,22,33,44},
                     {55,66,77,88}};

    //print the array instance variable
    void printArray()
    {
        //I used an enhanced for loop for going through the array of integer objects here 
        
        //(inside the enhanced for loop should only require one line of code)
        
        //reference this : 
            // http://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array?rq=1 
    }

    //convert the array rows to columns
    void convertColRow()
    {
        //rearranging the current 2d array of integer elements to a new 2d array 
        
        //create new one of those int[][] arrays from the instance variable zone here (only requires one line of code)
        //it'll take you a while to figure out the syntax so instead of the {{numbers},{morenumbers}};
                //do something like new int[][] and put in array[0].length and array.length in the right spots
                                            // you can figure that out on your own.
                                            
                                            
                                            
        //youll want a for loop here
        for(int c = 0; c < array[0].length ;c++){ //if you want to know more about when to use array.length vs array[0].length lemme know.
            for(int r = 0; r < array.length; r++){
                //have the newArray be populated by the columns in place for the old rows, and the rows in place for the old arrays columns
                //(in here should only require one line of code)
            }
        }
        //be sure to declare that the old array = the newly created array otherwise it wont change when you try to print it out the second time.
        //(should only require one line of code.)
    }

}

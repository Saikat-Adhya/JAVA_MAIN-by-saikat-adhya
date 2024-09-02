public class Jagged2D_Array {
    public static void main(String[] args) {
        int nums[][]=new int[4][]; //Array size i= row and j= coloum

        nums[0] = new int[3];
        nums[1] = new int[2];  // array element size declare means how many elements in eaach row
        nums[2] = new int[1];
        nums[3] = new int[4];

        nums[0][0] = 2;
        nums[0][1] = 4;
        nums[0][2] = 6;
        //nums[0][3] = ;  
        nums[1][0] = 8;   // array elements position
        nums[1][1] = 10;
        //nums[1][2] = 4;
       // nums[1][3] = 4;
        nums[2][0] = 12;
        //nums[2][1] = 4;
        //nums[2][2] = 4;
        //nums[2][3] = 4;
        nums[3][0] = 14;
        nums[3][1] = 16;
        nums[3][2] = 18;
        nums[3][3] = 20;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
                
            }
            System.out.println();
            
        }
    }

    
    
}

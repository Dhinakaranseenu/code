import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class even{
    public static void main(String[] args) {
        
        ArrayList<Integer> eve = new ArrayList<Integer>();
       

        int[]number=new int[8];
        Scanner read = new Scanner (System.in);

        System.out.print("Enter number :" );

        for(int i=0;i<number.length;i++){
            number[i]=read.nextInt(); 

            if(number[i]%2==0){
                eve.add(number[i]);  
                System.out.println("Even number is " + eve);
            }
    }
}
}
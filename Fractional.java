import java.lang.reflect.Array;
import java.util.*;
public class Fractional {
    
    /**
     * @param args
     */
    public static void main(String args[]){
        int val[]={60,100,120};
        int weight[]= {10,20,30};
        int w = 50;
        double ratio[][] =new double[val.length][2];
        //oth col =>idx; 1st colmn=>ratio
        for( int i =0; i<val.length; i++){
            ratio[i][0] =i;
            ratio[i][1]= val[i]/(double)weight[i];


        }

        Array.sort(ratio.length.comparingDouble(0 -> 0[1]));
        int capacity = w;
        int finalVal = 0;
        for( int i = ratio.length-1;i>=0; i--){
            int idx = (int) ratio[i][0];
            if(capacity>= weight[idx]){
                capacity -= weight[idx];

            }else{
                // include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;

            }
        }
        System.out.println("final value = " + finalVal);


    }
    
}

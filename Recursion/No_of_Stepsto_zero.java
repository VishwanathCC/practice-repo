package com.vishu.Recursion;

class No_of_Stepsto_zero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }
    public static int numberOfSteps(int num) {
        int count =0;
        return steps(num, count);
//        return count;
        
    }
    public static int steps(int num, int count){
        if (num ==0)
            return count;
        else if(num %2 == 0){
            num = num /2;
            count++;
            return steps(num, count);
        } else{
            num = num-1;
            count++;
            return steps(num, count);
        }
    }
}
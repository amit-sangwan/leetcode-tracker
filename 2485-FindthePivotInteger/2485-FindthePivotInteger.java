// Last updated: 17/08/2025, 18:41:45
class Solution {
    public int pivotInteger(int n) {
        int min = 0;
        int fin = n ;
        for (int max = 1; max <= fin; max++) {
            min += max ; 
            System.out.println(
                    min
            );

        }
        int x = (int) Math.sqrt(min);
        if(x*x == min){
            return x;
        }
        
        return -1 ;
    }
}
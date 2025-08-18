// Last updated: 18/08/2025, 13:06:47
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n > 0) {
            for (int i : nums2) {
                nums1[m++] = i;
            }
        Arrays.sort(nums1);
            
           // sortArr(nums1 , nums1.length - 1);
        }
    }

    public void sortArr(int[] arr , int len){
        int temp = 0 ;
        for(int i = 0 ; i <= len ; i++){
            for(int j = i+1 ; j <=len ; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
        }
    
    }
}
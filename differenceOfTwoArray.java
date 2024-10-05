// Difference of two arrays .

public class differenceOfTwoArray {

    public static void  diffOfArray(int[] nums1 , int [] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int [] diff = new int [n2];

        int i = n1-1;
        int j = n2-1;
        int k = diff.length-1;

        int c =0;

        while(k>=0){
            int d = 0;
            int num1 = i >=0 ? nums1[i] : 0;
            if(nums2[j] + c >= num1){
                d = nums2[j] + c - num1;
                c = 0;
            }
            else{
                d = nums2[j] + c +  10 - num1;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }

            // not to print zero before
            int idx = 0;
            while(idx < diff.length){
                if(diff[idx] == 0){
                    idx++;
                }
                else{
                    break;
                }
            }

            while(idx<diff.length){
                System.out.println(diff[idx]);
                idx ++;
            }
    }

    public static void main(String[] args) {
        int [] nums1 = { 1};
        int [] nums2 = {1,0};
        diffOfArray(nums1, nums2);
    }
}

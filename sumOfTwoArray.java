// Sum of two arrays .

public class sumOfTwoArray{

    public static void sumOfArray(int [] nums1 , int [] nums2){
            int n1 = nums1.length;
            int n2 = nums2.length;
            int c = 0;
            int [] sum = new int [n1>n2? n1 : n2];
            int i = n1-1;
            int j = n2-1;
            int k = sum.length-1;

            while(k>=0){
                int d = c;
                if(i>=0){
                    d += nums1[i];
                }
                if(j>=0){
                    d+=nums2[j];
                }
                c = d / 10;
                d= d%10;
                sum[k]= d;
                i--;
                j--;
                k--;
            } 
            if(c != 0){
                System.out.println(c);
            }
            for(int val:sum){
                System.out.println(val);
            }
            
    }
    public static void main(String[] args) {
        int [] nums1 = {9,9,9};
        int [] nums2 = {9,9};
        
        sumOfArray(nums1, nums2);
    }
}

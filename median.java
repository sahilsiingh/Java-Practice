public class median {
    

    public static double medianOfSortedArray (int [] nums1 , int [] nums2 ){

        if(nums1 == null || nums2 == null){
            return 0;
        }
        int n1 = nums1.length;
        double median1;

        // Step 2: Calculate the median
        if (n1 % 2 == 0) {
            // Even number of elements
            median1  = (nums1[n1 / 2 - 1] + nums1[n1 / 2]) / 2.0;
        } else {
            // Odd number of elements
            median1 = nums1[n1 / 2];
        }
    
        int n2 = nums2.length;
    double median2;

    // Step 2: Calculate the median
    if (n2 % 2 == 0) {
        // Even number of elements
        median2  = (nums2[n2 / 2 - 1] + nums2[n2 / 2]) / 2.0;
    } else {
        // Odd number of elements
        median2 = nums2[n2 / 2];
    }

    if( nums1.length==0){
        return median2;
    }

    if(nums2.length==0){
        return median1;
    }

    return (median2 + median1) / 2;


}

    
    public static void main(String[] args) {

        int [] nums1 = {};
        int [] nums2 = {4,5,6};

        System.out.println(medianOfSortedArray(nums1, nums2));

    }
}

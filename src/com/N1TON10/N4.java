package com.N1TON10;

public class N4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        if(nums1 == null || nums1.length == 0 ){
            return zhong(nums2);
        }
        if(nums2 == null || nums2.length == 0){
            return zhong(nums1);
        }

        int[] nums3 = new int[nums1.length + nums2.length ];
        for (int i = 0,j = 0 ,k = 0; k < nums3.length;k++ ) {
            if(i == nums1.length ){
                nums3[k] = nums2[j];
                j++;
                continue;
            }
            if(j == nums2.length){
                nums3[k] = nums1[i];
                i++;
                continue;
            }
            if(nums1[i] <= nums2[j]){
                nums3[k] = nums1[i];
                i++;
            }else{
                nums3[k] = nums2[j];
                j++;
            }
        }



        return zhong(nums3);
    }

    public double zhong(int[] a){
         if(a.length % 2 == 0){
            return (a[a.length / 2 -1] +a[a.length / 2  ])/2d;
        }else{
            return a[(a.length +1)/2 -1];
        }
    }
}

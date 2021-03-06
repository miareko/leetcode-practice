package me.dddew.leetcode.p004;

public class Solution {
	
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        if((m+n) % 2 == 0) {
        	return (findKth(nums1, nums2, 0, 0, m, n, (m+n)/2) + findKth(nums1, nums2, 0, 0, m, n, (m+n)/2 + 1))/2;
        } 
        
        return findKth(nums1, nums2, 0, 0, m, n, (m+n)/2 + 1);
    }
    
    public double findKth(int[] nums1, int[] nums2, int p1, int p2, int len1, int len2, int k) {
    	
    	if(len1 > len2) {
    		return findKth(nums2, nums1, p2, p1, len2, len1, k);
    	}
    	
    	if(len1 == 0) {
			return nums2[p2+k-1];
    	}
    	
    	if(k == 1) {
    		return Math.min(nums1[p1], nums2[p2]);
    	}
    	
    	int a = Math.min(k/2, len1);
    	int b = k - a;
    	
    	if(nums1[p1+a-1] > nums2[p2+b-1]) {
    		return findKth(nums1, nums2, p1, p2+b, len1, len2-b, k-b);
    	} else if(nums1[p1+a-1] < nums2[p2+b-1]) {
    		return findKth(nums1, nums2, p1+a, p2, len1-a, len2, k-a);
    	} else {
    		return nums1[p1+a-1];
    	}
    	
    }
    
    public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = {3,4};
		
		System.out.println(new Solution().findMedianSortedArrays(a, b));
	}

}

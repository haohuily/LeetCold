package test88;

//链表从前往后分析可行，数组在前端插入，后端都要移动。
// 纯借鉴   m+n不能超过nums1的大小，表示nums2前n个有序插入到nums1前m个中，m元素后移
public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
	    while(n>0){
	        if(m>0&&nums1[m-1]>nums2[n-1]){
	            nums1[m+n-1] = nums1[m-1];
	            m--;
	        }
	        else{
	            nums1[m+n-1] = nums2[n-1];
	            n--;
	        }
	    }
	}
}

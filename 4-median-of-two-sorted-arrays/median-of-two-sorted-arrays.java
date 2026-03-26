class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int len1 = nums1.length;
        int len2 = nums2.length;
        int total = len1 + len2;
        int half = (total + 1) / 2;

        int left = 0;
        int right = len1;

        while (left <= right) {
            int lhalf = left + (right - left) / 2;
            int rhalf = half - lhalf;

            int left1 = (lhalf == 0) ? Integer.MIN_VALUE : nums1[lhalf - 1];
            int right1 = (lhalf == len1) ? Integer.MAX_VALUE : nums1[lhalf];

            int left2 = (rhalf == 0) ? Integer.MIN_VALUE : nums2[rhalf - 1];
            int right2 = (rhalf == len2) ? Integer.MAX_VALUE : nums2[rhalf];

            if (left1 <= right2 && left2 <= right1) {
                if (total % 2 == 0) {
                    return ((double) Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return (double) Math.max(left1, left2);
                }
            } else if (left1 > right2) {
                right = lhalf - 1;
            } else {
                left = lhalf + 1;
            }
        }

        return 0.0;
    }
}
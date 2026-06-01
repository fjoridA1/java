package Classic150;

public class 移除元素27 {
    
}


//解法一：对撞双指针
class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length;
        while (i<j) {
            if(nums[i]==val){
                nums[i] = nums[j-1];
                j--;
            }else{
                i++;
            }
        }
        return j;
    }
}



//解法二：快慢指针
class aSolution {
    public int removeElement(int[] nums, int val) {
        int slow = 0; // 慢指针：记录新数组该填入的位置

        // fast 快指针：负责遍历整个原数组
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast]; // 只要不是 val，就搬到前面来
                slow++; // 慢指针往前走一步
            }
        }
        return slow; // slow 刚好就是新数组的长度
    }
}
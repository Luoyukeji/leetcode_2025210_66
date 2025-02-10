import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        // 从数组的最后一位开始处理
        //[1,2,3]
        for (int i = digits.length - 1; i >= 0; i--) {
            // 如果当前位(数组最后一位）小于9，直接加1并返回结果
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // 如果当前位是9，加1后变成0，继续处理上一位
            digits[i] = 0;
        }
            // 如果所有位都处理完并且都产生了进位，说明数组需要扩展
            int[] newDigits = new int[digits.length + 1]; // 创建一个新数组，长度是原数组长度加 1
            newDigits[0] = 1; // 新数组的最高位放入 1
            return newDigits; // 返回扩展后的新数组
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] digits = {8, 9, 9};
            int[] result = solution.plusOne(digits);
            System.out.println(Arrays.toString(result));  // 输出 [1, 0, 0, 0]
        }

}
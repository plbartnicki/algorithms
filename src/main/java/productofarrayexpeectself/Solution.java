package productofarrayexpeectself;

/*


 */
public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int []res = new int[nums.length];

        int zeroNum = 0;
        for(int x : nums) {
            if(x == 0) {
                zeroNum++;
            }

            if(zeroNum == 2) {
                break;
            }
        }

        if(zeroNum == 0) {
            int mult = 1;
            for(int x : nums) {
                mult *= x;
            }

            for(int i = 0; i < nums.length; i++) {
                res[i] = mult / nums[i];
            }
            return res;
        }

        if(zeroNum == 1) {
            int mult = 1;
            for(int x : nums) {
                if(x != 0) {
                    mult *= x;
                }
            }
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] != 0) {
                    res[i] = 0;
                } else {
                    res[i] = mult;
                }
            }

            return res;
        }

        //zeroNum == 2
        for(int i = 0; i < nums.length; i++) {
            res[i] = 0;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] res = productExceptSelf(new int[]{-1,1,0,-3,3});
        for(int x : res) {
            System.out.println(x);
        }
    }
}

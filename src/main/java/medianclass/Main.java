package medianclass;

import java.util.LinkedList;
import java.util.List;

public class Main {

    private List<Integer> nums = new LinkedList<>();

    public void insertNum(int num) // stores the number in the class
    {
        int i = 0;
        boolean inserted = false;
        while(i < nums.size()) {
            if(num < nums.get(i)) {
                nums.add(i, num);
                inserted = true;
                break;
            }
            i++;
        }

        if(!inserted) {
            nums.add(nums.size(), num);
        }
    }
    public double findMedian() throws Exception // returns the median of all numbers inserted in the class
    {
        if(nums.size() == 0) {
            throw new Exception("no median");
        }
        if(nums.size() == 1) {
            return nums.get(0);
        }
        if(nums.size() % 2 == 0) {
            int mid1 = nums.size() / 2;
            int mid2 = mid1 - 1;
            return (double)(nums.get(mid1) + nums.get(mid2)) / 2;
        } else {
            return nums.get(nums.size() / 2);
        }
    }

    public List<Integer> getNums() {
        return nums;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.insertNum(3);
        main.insertNum(1);
        main.insertNum(4);
  //     main.insertNum(2);

        System.out.println(main.getNums());
        try {
            System.out.println(main.findMedian());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

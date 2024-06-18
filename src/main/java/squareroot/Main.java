package squareroot;

public class Main {

    static int searchRoot(int n)
    {
         int l = 0;
         int m;
         int r = n + 1;

        while (l != r - 1)
        {
            m = (l + r) / 2;

            if (m * m <= n)
                l = m;
            else   // m*m > n
                r = m;
        }

        return l;
    }
//    static int searchRoot (int num) {
//
//        if(num == 1) {
//            return 1;
//        }
//
//        int i = 0;
//        int j = num;
//
//        int s = 0;
//
//        while(true) {
//            s = (i + j) / 2;
//            int diff = s*s - num;
//            if(diff < 0) {
//                diff = -diff;
//            }
//            if(diff >= 0 && diff <=1) {
//                break;
//            }
//
//            if(s*s > num) {
//                j = s;
//            } else {
//                i = s;
//            }
//
//        }
//
//        return s;
//    }
    public static void main(String[] args) {

        System.out.println(searchRoot(0) == 0);
        System.out.println(searchRoot(1) == 1);
        System.out.println(searchRoot(2) == 1);
        System.out.println(searchRoot(16) == 4);
        System.out.println(searchRoot(5) == 2);
        System.out.println(searchRoot(9) == 3);
        System.out.println(searchRoot(3) == 1);
         System.out.println(searchRoot(12) == 3);
    }
}

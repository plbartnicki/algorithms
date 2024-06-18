package secondlargest;

public class Main {


    private static int second_max(int tab[]) throws Exception {
        if (tab.length < 2) {
            throw new Exception("no value");
        }

        int m = Integer.MIN_VALUE;
        int sm = Integer.MIN_VALUE;

        for(int i = 0; i < tab.length; i++) {
            if(tab[i] > m) {
                sm = m;
                m = tab[i];
            } else if(tab[i] > sm && tab[i] != m)
            {
                sm = tab[i];
            }
        }

        return sm;
    }

    private static int second_min(int tab[]) throws Exception {
        if (tab.length < 2) {
            throw new Exception("no value");
        }

        int m = Integer.MAX_VALUE;
        int sm = Integer.MAX_VALUE;

        for(int i = 0; i < tab.length; i++) {
            if(tab[i] < m) {
                sm = m;
                m = tab[i];
            } else if(tab[i] < sm && tab[i] != m)
            {
                sm = tab[i];
            }
        }

        return sm;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(second_max(new int[]{3,2}));
        System.out.println(second_max(new int[]{3,2,1}));
        System.out.println(second_max(new int[]{3,2,1,4}));
        System.out.println(second_max(new int[]{2,2,3}));

        System.out.println();

        System.out.println(second_min(new int[]{3,2}));
        System.out.println(second_min(new int[]{3,2,1}));
        System.out.println(second_min(new int[]{3,2,1,4}));
        System.out.println(second_min(new int[]{2,2,3}));
    }
}

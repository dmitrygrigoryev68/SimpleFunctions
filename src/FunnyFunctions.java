import java.util.Collections;
import java.util.List;

public class FunnyFunctions {

    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {0, 2, 4};
        int[] c = {};
        int[] d = {17, 3, 6, 90, 8, 36, 7, 48, 49, 2};
        int[] e = {0, 4, 1, 5, 0, 6, 0, 7, 0, 9};
        int[] f = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        printBool(sleepIn(true, false));
        printInt(diff21(11));
        printStr(endUp("hhh"));
        printInt(intMax(10, 11, 10));
        printBool(commonEnd(a, b));
        printInt(sum2(c));
        printInt(countEvens(d));
        printArrInt(e);
        printArrInt(zeroMax(e));
        printArrInt(f);
        printArrInt(schiftLeft(f));
        printStr(nonStart("Vasya","Pupkind"));
        printStr(middleTwo("Popandopulop"));
    }

    public static boolean sleepIn(boolean weekday, boolean holiday) {
        if ((weekday) && (holiday) || ((!weekday) && (holiday)) || ((!weekday) && (!holiday))) {
            return true;
        }
        return false;
    }

    public static int diff21(int n) {
        if (n > 21) {
            return Math.abs((n - 21) * 2);
        }
        return Math.abs(n - 21);
    }

    public static String endUp(String s) {
        if (s.length() <= 3) {
            return s.toUpperCase();
        } else {
            return s.substring(0, s.length() - 3) + s.substring(s.length() - 4, s.length() - 1).toUpperCase();
        }
    }

    public static int intMax(int a, int b, int c) {
        int res = 0;
        if (a > b) {
            res = a;
        } else {
            res = b;
        }
        if (res < c) {
            res = c;
        }
        return res;
    }

    public static boolean commonEnd(int[] a, int[] b) {
        if ((a.length == 0) || (b.length == 0)) {
            return false;
        }
        if ((a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1])) {
            return true;
        }
        return false;
    }

    public static int sum2(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        if (a.length < 2) {
            return a[0];
        } else {
            return a[0] + a[1];
        }
    }

    private static int countEvens(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }


    public static int[] zeroMax(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i - 1] == 0) && (nums[i] % 2 != 0)) {
                nums[i - 1] = nums[i];
            }
        }
        return nums;
    }

    public static int[] schiftLeft(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = a.length - 1;
        return a;
    }

    public static String nonStart (String s1, String s2) {
        return s1.substring(1)+s2.substring(1);
    }

    public static String middleTwo(String str){
        if (str.length()%2 !=0){
            return "Bad parameter";
        }
        return str.substring(str.length()/2-1,str.length()/2+1);
    }

    public static void printBool(boolean b) {
        System.out.println(b);
        System.out.println("\n");
    }

    public static void printInt(int i) {
        System.out.println(i);
        System.out.println("\n");
    }

    public static void printStr(String s) {
        System.out.println(s);
        System.out.println("\n");
    }

    public static void printArrInt(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("\n");
    }
}

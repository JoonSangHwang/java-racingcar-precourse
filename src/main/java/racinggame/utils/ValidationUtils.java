package racinggame.utils;

public class ValidationUtils {

    public static final int MIN_NO = 1;
    public static final int MAX_NO = 5;

    public static boolean isValidNaming(String[] names) {
        int aimCnt = names.length;
        int curCnt = 0;

        for (String name : names) {
            curCnt += validCount(name);
        }

        return curCnt == aimCnt;
    }

    private static int validCount(String name) {
        if (isCorrectNaming(name))
            return 1;

        return 0;
    }

    private static boolean isCorrectNaming(String name) {
        return  !"".equals(name)
                && !(name == null)
                && name.length() >= MIN_NO
                && name.length() <= MAX_NO;
    }
}

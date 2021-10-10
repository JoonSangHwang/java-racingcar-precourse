package racinggame.utils;

public class ValidationUtils {

    public static final int MIN_NO = 1;
    public static final int MAX_NO = 5;

    public static boolean isValidNames(String[] names) {
        int curCnt = 0;
        for (String name : names) {
            curCnt = isValidName(name)
                    ? curCnt++
                    : curCnt;
        }

        // 문자열 names 의 길이만큼 검증이 통과해야 true
        return curCnt == (names.length);
    }

    private static boolean isValidName(String name) {
        return  !"".equals(name)
                && !(name == null)
                && name.length() >= MIN_NO
                && name.length() <= MAX_NO;
    }
}

import java.util.Map;

public class KioskUtils {

    public static Integer calculateTotalPrice(Integer price, Integer count) {
        return price * count;
    }

    public static boolean isValidMenuOption(int option, int maxOption) {
        boolean validOption = (0 < option & option < maxOption) ? true : false;
        return validOption;
    }

    public static boolean isValidQuantity(int quantity) {
        // 리턴을 조건식만 반환해도됨
        boolean valid = (0 < quantity & quantity < 100) ? true : false;
        return valid;
    }

    public static int maxOptionCalculater(Map map) {
        return map.size() + 1;
    }
}

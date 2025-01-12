package ss4_java_overview_stringbuilder_date;

public class Question3 {
    public static void main(String[] args) {
        //a
        byte byteValue = 125;
        short shortValue = byteValue; // ngầm định
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        //b.
        double doubleValue2 = 125;
        float floatValue2 = (float) doubleValue2; // tường minh
        long longValue2 = (long) floatValue2;
        int intValue2 = (int)longValue2;
        short shortValue2 = (short)intValue2;
        byte byteValue2 = (byte)shortValue2;

        //c.
        double doubleValue3 = 999999999.99;
        float floatValue3 = (float) doubleValue3;
        long longValue3 = (long) floatValue3;
        int intValue3 = (int) longValue3;
        short shortValue3 = (short)intValue3;
        byte byteValue3 = (byte)shortValue3;
    }
}

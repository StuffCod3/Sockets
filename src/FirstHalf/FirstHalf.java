package FirstHalf;

import java.util.List;

public class FirstHalf implements Result{
    private String result = "";
    public FirstHalf(String str) {

        int[] values;
        int evenStr = 0;
        int oddStr = 0;
        String[] stringValues = str.split(",\\s*");
        values = new int[stringValues.length];
        for (int i = 0; i < stringValues.length; i++) {
            values[i] = Integer.parseInt(stringValues[i]);
        }

        for (int i = 0; i < values.length; i++){
            if (values[i] % 2 == 0){
                evenStr++;
            }else {
                oddStr++;
            }
        }
        result += "/////////////////////////\n" + "Вывод из String коструктора\n\n" + "Четных = " + evenStr + "\n" + "Нечетных = " + oddStr + "\n/////////////////////////";
    }

    public FirstHalf(Double[] array) {
        int evenArr = 0;
        int oddArr = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                evenArr++;
            }else {
                oddArr++;
            }
        }
        result += "Вывод из коструктора массива\n\n" + "Четных = " + evenArr + "\n" + "Нечетных = " + oddArr + "\n/////////////////////////";
    }

    public FirstHalf(List<Double> list) {
        int evenList = 0;
        int oddList = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                evenList++;
            }else {
                oddList++;
            }
        }
        result += "Вывод из коструктора массива\n\n" + "Четных = " + evenList + "\n" + "Нечетных = " + oddList + "\n/////////////////////////";
    }

    @Override
    public String getResult() {
        return result;
    }
}

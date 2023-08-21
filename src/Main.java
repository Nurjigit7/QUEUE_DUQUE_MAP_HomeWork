import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car, AutoDate> hashMap = new HashMap<>();
        hashMap.put(new Car(1, 7717), new AutoDate(2003, "Toyota ", 700000, "Black"));
        hashMap.put(new Car(3, 8118), new AutoDate(2005, "Fit ", 300000, "Greey"));
        hashMap.put(new Car(5, 2002), new AutoDate(2008, "Camry ", 800000, "Red"));
        hashMap.put(new Car(7, 6699), new AutoDate(2010, "Lexsus", 900000, "Blue"));
        hashMap.put(new Car(10, 1802), new AutoDate(2000, " Bmw", 780000, "White"));
        for (Map.Entry<Car, AutoDate> map : hashMap.entrySet()) {
            System.out.println(map.getKey() + "_" + map.getValue());
        }


    }
}
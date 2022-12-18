package family_and_city;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FamilyAndCity {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>();
        String keyCity;
        String valueSurname;
        boolean flag = false;
        for (;;) {
            System.out.println("Введіть назву міста:");
            keyCity = scanner.nextLine();
            System.out.println("Введіть призвище:");
            valueSurname = scanner.nextLine();
            hashMap.put(keyCity, valueSurname);
            System.out.println("Ввести наступні місто та призвище? y/n");
            char answer = scanner.nextLine().charAt(0);
            if (answer == 'n') break;
            else if (answer != 'y') throw new Exception("Немає такого варіанту вибору");
        }

        System.out.println("Введіть для пошуку назву міста:");
        String city = scanner.nextLine();

        for (Map.Entry<String, String> temp : hashMap.entrySet()) {
            if (city.equals(temp.getKey())) {
                System.out.println(temp.getValue());
                flag = true;
            }
        }
         if (!flag) {
            try {
                throw new NoSuchValueException("Такого міста нема у списку");
            }catch (NoSuchValueException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

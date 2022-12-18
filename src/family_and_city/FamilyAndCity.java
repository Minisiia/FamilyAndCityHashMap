package family_and_city;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FamilyAndCity {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Москва", "Іванови");
        hashMap.put("Київ", "Петрови");
        hashMap.put("Лондон", "Абрамовичі");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву міста:");
        String city = scanner.nextLine();
        boolean flag = false;
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

package family_and_city;

import java.util.Map;

/**
 * Завдання 4
 * Програма визначає, яка сім'я (прізвище) живе у місті.
 */

public class FamilyAndCity {
    public static void main(String[] args){
        Handler handler = new Handler();
        Map<String, String> hashMap = handler.fillMap();

        System.out.println("Surname: " + handler.findSurnameByCity(hashMap));

        System.out.println(hashMap);

    }
}

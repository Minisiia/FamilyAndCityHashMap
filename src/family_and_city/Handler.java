package family_and_city;

import java.util.*;

public class Handler {

    private final Scanner scanner;

    public Handler() {
        scanner = new Scanner(System.in);
    }

    public Map<String, String> fillMap() {
        Map<String, String> hashMap = new HashMap<>();
        String keyCity;
        String valueSurname;
        while (true) {
            System.out.println("Enter city or exit:");
            keyCity = scanner.nextLine();
            if (Objects.equals(keyCity, "exit")) {
                break;
            }
            System.out.println("Enter surname or exit:");
            valueSurname = scanner.nextLine();
            if (Objects.equals(valueSurname, "exit")) {
                break;
            }
            hashMap.put(keyCity, valueSurname);
        }
        return hashMap;
    }

    public String enterCity() {
        System.out.println("Enter a city name to search:");
        return scanner.nextLine();
    }

    public String findSurnameByCity(Map<String, String> map) {
        String surname = null;
        String city = enterCity();
        for (Map.Entry<String, String> temp : map.entrySet()) {
            if (city.equals(temp.getKey())) {
                surname = temp.getValue();
            }
        }
        return Optional.ofNullable(surname)
                .orElseThrow(() -> {
                    throw new NoSuchElementException("Wrong city");
                });
    }
}

import java.util.*;

public class Main {


    public static void fillDeliveryMap(Map<Address, Integer> map) {
        map.put(new Address("Россия", "Москва"), 10);
        map.put(new Address("Россия", "Санкт-Петербург"), 12);
        map.put(new Address("Россия", "Казань"), 14);
        map.put(new Address("Россия", "Новосибирск"), 16);
        map.put(new Address("Казахстан", "Алмата"), 25);
        map.put(new Address("Грузия", "Тбилиси"), 30);
    }


    public static void main(String[] args) {

        Map<Address, Integer> deliveryMap = new HashMap<>();
        fillDeliveryMap(deliveryMap);

        Set<String> countrySet = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        Address address;
        int deliveryPrice = 0;
        int sumDelivery = 0;
        while (true) {
            System.out.println("\nВведите заказы или end для выхода\n");
            System.out.println("Заполнение нового заказа.");

            System.out.print("Введите страну: ");
            String country = sc.nextLine();
            if (country.equalsIgnoreCase("end")) {
                break;
            }

            System.out.print("Введите город: ");
            String city = sc.nextLine();
            if (city.equalsIgnoreCase("end")) {
                break;
            }

            System.out.print("Введите вес (кг): ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            Integer weight = Integer.parseInt(input);

            address = new Address(country, city);
            if (deliveryMap.containsKey(address)) {
                deliveryPrice = deliveryMap.get(address) * weight;
                sumDelivery += deliveryPrice;
                countrySet.add(address.getCountry());

                System.out.println("Стоимость доставки составит: " + deliveryPrice + " руб.");
                System.out.println("Общая стоимость всех доставок:: " + sumDelivery + " руб.");
                System.out.println("Страны доставки: " + countrySet.toString());
            } else {
                System.out.println("Доставки по этому адресу нет");
            }

        }

        sc.close();
        System.out.println("Программа завершила работу.");
    }
}

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<ProductExercise1> productExercise1 = new ArrayList<>();

        productExercise1.add(new ProductExercise1("Pen", 50));
        productExercise1.add(new ProductExercise1("Book", 350));
        productExercise1.add(new ProductExercise1("Clock", 750));
        productExercise1.add(new ProductExercise1("Book", 550));
        productExercise1.add(new ProductExercise1("Book", 200));

        List<ProductExercise2> productExercise2 = new ArrayList<>();

        productExercise2.add(new ProductExercise2("Pen", 50, false));
        productExercise2.add(new ProductExercise2("Book", 30, false));
        productExercise2.add(new ProductExercise2("Clock", 750, false));
        productExercise2.add(new ProductExercise2("Book", 550, true));
        productExercise2.add(new ProductExercise2("Book", 200, true));

        List<ProductExercise4> productExercise4 = new ArrayList<>();

        productExercise4.add(new ProductExercise4("Pen", 50, false,
                LocalDateTime.of(2021, Month.JULY, 9, 11, 6, 22)));

        productExercise4.add(new ProductExercise4("Book", 300, false,
                LocalDateTime.of(2022, Month.APRIL, 7, 12, 5, 25)));

        productExercise4.add(new ProductExercise4("Clock", 750, false, LocalDateTime.now()));

        productExercise4.add(new ProductExercise4("Book", 550, true,
                LocalDateTime.of(2020, Month.APRIL, 11, 06, 5, 25)));

        productExercise4.add(new ProductExercise4("Book", 200, true, LocalDateTime.now()));

//        1.2 Реализовать метод получения всех продуктов в виде списка,
//        категория которых эквивалентна “Book” и цена более чем 250.
        List<ProductExercise1> productBookMore250 = productExercise1.stream().
                filter(x -> x.getProductType().equals("Book") && x.getProductPrice() > 250).toList();
        System.out.println("\n 1.2: " + productBookMore250);


//        2.2 Реализовать метод получения всех продуктов в виде списка,
//        категория которых эквивалентна “Book” и с возможностью применения скидки.
//        Финальный список должен содержать продукты с уже примененной скидкой 10%.
//        Так если Продукт A был с ценой 1.0 USD, то его финальная цена будет оставлять 0.9 USD
        List<String> productBookDiscount = productExercise2.stream().
                filter(x -> x.getProductType().equals("Book") && x.isDiscount()).
                map(x -> x.getProductType() + ", with discount 10%: "
                        + (x.getProductPrice() - (x.getProductPrice() * 0.1)) + " $").
                collect(Collectors.toList());
        System.out.println("\n 2.2: " + productBookDiscount);


//        3.2 Реализовать метод получения самого дешевого продукта из категории “Book”
        List<ProductExercise2> minimalBookPrice = List.of(productExercise2.stream().
                filter(x -> x.getProductType().equals("Book")).
                min(Comparator.comparing(ProductExercise2::getProductPrice)).get());
        System.out.println("\n 3.2: " + "Minimal price of book: " + minimalBookPrice);

//        3.3 В случае, если ни один продукт не найден
//        (ситуация, когда нет продукта с искомой категорией), выбросить исключение с сообщением
//        “Продукт [категория: имя_категории] не найден”.
        String type = "Ring";
        if (productExercise2.stream().noneMatch(x -> x.getProductType().equals(type))) {
            System.out.println("\n 3.3: " + "Producte " + type + "is not found");
        }

//        4.2 Реализовать метод получения трех последних добавленных продуктов
        List<ProductExercise4> exercise4 = productExercise4.stream().
                sorted(Comparator.comparing(ProductExercise4::getDataOfAdd).reversed()).
                limit(3).
                collect(Collectors.toList());
        System.out.println("\n 4.2: " + exercise4);

//        5.2 Реализовать метод калькуляции общей стоимости продуктов, которые отвечаю следующим критериям:
//        - продукт добавлен в течении текущего года
//        - продукт имеет тип “Book”
//        - цена продукта не превышает 75
        List<ProductExercise4> exercise5 = productExercise4.stream().
                filter(s -> s.getProductType().equals("Book") &&
                        s.getProductPrice() > 75 &&
                        s.getDataOfAdd().getYear() == 2022).
                collect(Collectors.toList());
        System.out.println("\n 5.2: " + exercise5);

        double exercise51 = productExercise4.stream().
                filter(s -> s.getProductType().equals("Book") &&
                        s.getProductPrice() > 75 &&
                        s.getDataOfAdd().getYear() == 2022).
                mapToDouble(ProductExercise4::getProductPrice).sum();
        System.out.println("\n 5.2: " + exercise51);
    }


}


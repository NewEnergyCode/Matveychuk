import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AppExercise {

    public List<ProductExercise1> productBookMore250(List<ProductExercise1> list) {
        return list.stream().
                filter(x -> x.getProductType().equals("Book") && x.getProductPrice() > 250).
                toList();
    }

    public List<String> productBookDiscount(List<ProductExercise2> list) {
        return list.stream().
                filter(x -> x.getProductType().equals("Book") && x.isDiscount()).
                map(x -> x.getProductType() + ", with discount 10%: "
                        + (x.getProductPrice() - (x.getProductPrice() * 0.1)) + " $").
                collect(Collectors.toList());
    }

    public List<ProductExercise2> minimalBookPrice(List<ProductExercise2> list) {
        return List.of(list.stream().
                filter(x -> x.getProductType().equals("Book")).
                min(Comparator.comparing(ProductExercise2::getProductPrice)).get());
    }

    public void productIsNotFound(List<ProductExercise2> list, String type) {

        if (list.stream().noneMatch(x -> x.getProductType().equals(type))) {
            System.out.println("\n 3.3: " + "Producte " + type + "is not found");
        } else {
            System.out.println("\n 3.2: " + "Minimal price of " + type + ": " +
                    List.of(list.stream().
                            filter(x -> x.getProductType().equals(type)).
                            min(Comparator.comparing(ProductExercise2::getProductPrice)).get()));
        }
    }

    public List<ProductExercise4> threeLastProduct(List<ProductExercise4> list) {
        return list.stream().
                sorted(Comparator.comparing(ProductExercise4::getDataOfAdd).reversed()).
                limit(3).
                collect(Collectors.toList());
    }

    public void totalCostOfProduct(List<ProductExercise4> list) {
        List<ProductExercise4> exercise5 = list.stream().
                filter(s -> s.getProductType().equals("Book") &&
                        s.getProductPrice() > 75 &&
                        s.getDataOfAdd().getYear() == 2022).
                collect(Collectors.toList());

        double exercise51 = list.stream().
                filter(s -> s.getProductType().equals("Book") &&
                        s.getProductPrice() > 75 &&
                        s.getDataOfAdd().getYear() == 2022).
                mapToDouble(ProductExercise4::getProductPrice).sum();
        System.out.println("""
                \n 5.2: Total price the next products: \n""" + exercise5 +
                """
                        \n is:\040""" + exercise51);
    }

}

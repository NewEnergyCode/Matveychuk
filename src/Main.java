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
        productExercise2.add(new ProductExercise2("Book", 350, false));
        productExercise2.add(new ProductExercise2("Clock", 750, false));
        productExercise2.add(new ProductExercise2("Book", 550, true));
        productExercise2.add(new ProductExercise2("Book", 200, true));

//        List<ProductExercise1> hw1 = new ArrayList<>();
//        productExercise1.stream().
//                filter(x -> x.getProductType().equals("Book") && x.getProductPrice() > 250).
//                forEach(s->{
//                    hw1.add(new ProductExercise1(s.getProductType(),s.getProductPrice()));
//                });
//        System.out.println(hw1);

        productExercise1.stream().
                filter(x -> x.getProductType().equals("Book") && x.getProductPrice() > 250).
                forEach(System.out::println);

        productExercise2.stream().
                filter(x -> x.getProductType().equals("Book") && x.isDiscount()).
                map(x -> x.getProductType() + ", with discount 10%: "
                        + (x.getProductPrice() - (x.getProductPrice() * 0.1)) + " $").
                forEach(System.out::println);


        List<ProductExercise2> minimalBookPrice = List.of(productExercise2.stream().
                filter(x -> x.getProductType().equals("Book")).
                min(Comparator.comparing(ProductExercise2::getProductPrice)).get());
        System.out.println(minimalBookPrice);

        String type = "Ring";
        if (productExercise2.stream().noneMatch(x -> x.getProductType().equals(type))) {
            System.out.println("Producte " + type + "is not found");
        }


    }


}


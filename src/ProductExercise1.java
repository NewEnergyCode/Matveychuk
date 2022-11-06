public class ProductExercise1 {

    private String productType;
    private double productPrice;

    public ProductExercise1(String productType, double productPrice) {
        this.productType = productType;
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productType='" + productType + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}

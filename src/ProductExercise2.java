public class ProductExercise2 {
    private String productType;
    private double productPrice;
    private boolean discount;

    public ProductExercise2(String productType, double productPrice, boolean discount) {
        this.productType = productType;
        this.productPrice = productPrice;
        this.discount = discount;
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

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "ProductExercise2{" +
                "productType='" + productType + '\'' +
                ", productPrice=" + productPrice +
                ", discount=" + discount +
                '}';
    }
}

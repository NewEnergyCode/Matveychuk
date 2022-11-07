import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class ProductExercise4{

    private String productType;
    private double productPrice;
    private boolean discount;
    private LocalDateTime dataOfAdd;

    public ProductExercise4(String productType, double productPrice, boolean discount, LocalDateTime dataOfAdd) {
        this.productType = productType;
        this.productPrice = productPrice;
        this.discount = discount;
        this.dataOfAdd = dataOfAdd;
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

    public LocalDateTime getDataOfAdd() {
        return dataOfAdd;
    }

    public void setDataOfAdd(LocalDateTime dataOfAdd) {
        this.dataOfAdd = dataOfAdd;
    }

    @Override
    public String toString() {
        return "ProductExercise4{" +
                "productType='" + productType + '\'' +
                ", productPrice=" + productPrice +
                ", discount=" + discount +
                ", dataOfAdd=" + dataOfAdd +
                '}';
    }
}


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProductDTO {
    private long id;
    private String productName;
    private String productManufacturer;
    private int productPrice;
    private int productStock;
    private String productCreatedAt;

    public ProductDTO() {

    }

    public ProductDTO(String productName, String productManufacturer, int productPrice, int productStock) {
        this.productName = productName;
        this.productManufacturer = productManufacturer;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productCreatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년MM월dd일"));
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public String getProductCreatedAt() {
        return productCreatedAt;
    }

    public void setProductCreatedAt(String productCreatedAt) {
        this.productCreatedAt = productCreatedAt;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productManufacturer='" + productManufacturer + '\'' +
                ", productPrice=" + productPrice +
                ", productStock=" + productStock +
                ", productCreatedAt='" + productCreatedAt + '\'' +
                '}';
    }
}

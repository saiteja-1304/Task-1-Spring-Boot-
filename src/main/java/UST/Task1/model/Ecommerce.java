package UST.Task1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="ecommerce")
public class Ecommerce {
@Id
    public long orderid;
    public String customername;
    public String orderItem;
    public String date;
    public int price;
    public String deliveryStatus;
}

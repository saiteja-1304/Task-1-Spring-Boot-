package UST.Task1.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ecommercedto {


    public long orderid;

    @NotNull(message = "Customer name cannot be null")
    @NotEmpty(message = "Customer name cannot be empty")
    public String customername;

    @NotNull(message = "Order cannot be null")
    @NotEmpty(message = "Order cannot be empty")
    public String orderItem;

    @NotNull(message = "Date cannot be null")
    @NotEmpty(message = "Date cannot be empty")
    public String date;

    public int price;

    @Pattern(regexp = "^(Completed|Cancelled|Restitute|Continuing)$", message = "Status should be Completed or Cancelled or Restitute or Continuing")
    public String deliveryStatus;
}

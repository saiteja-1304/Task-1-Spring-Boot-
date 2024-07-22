package UST.Task1.repository;

import UST.Task1.model.Ecommerce;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EcommerceRepo extends JpaRepository<Ecommerce,Long> {


    List<Ecommerce> findByDate(String date);

    List<Ecommerce> findByPrice(int price);

    List<Ecommerce> findByDeliveryStatus(String deliveryStatus);

    List<Ecommerce> findByCustomername(String customername);


    Optional<Ecommerce> findByOrderid(long orderid);
}

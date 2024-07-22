package UST.Task1.service;

import UST.Task1.dto.Ecommercedto;
import UST.Task1.model.Ecommerce;
import UST.Task1.repository.EcommerceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcommerceService {
    @Autowired
private EcommerceRepo ecommerceRepo;

    public Ecommerce addOrder(Ecommercedto ecommerce) {
        Ecommerce e1 = Ecommerce.builder()
                .orderid(ecommerce.getOrderid())
                .customername(ecommerce.getCustomername())
                .orderItem(ecommerce.getOrderItem())
                .date(ecommerce.getDate())
                .price(ecommerce.getPrice())
                .deliveryStatus(ecommerce.getDeliveryStatus())
                .build();
        return ecommerceRepo.save(e1);
    }

    public List<Ecommerce> getAllOrders(){
        return ecommerceRepo.findAll();
    }

    public Ecommerce getOrderById(long orderid){
        return ecommerceRepo.findByOrderid(orderid).orElse(null);
    }

    public List<Ecommerce> getOrderByname(String customername){
        return ecommerceRepo.findByCustomername(customername);
    }

    public List<Ecommerce> getOrderByDate(String date){
        return ecommerceRepo.findByDate(date);
    }

    public List<Ecommerce> getOrderByPrice(int price){
        return ecommerceRepo.findByPrice(price);
    }

    public List<Ecommerce> getOrderByDeliveryStatus(String deliveryStatus){
        return ecommerceRepo.findByDeliveryStatus(deliveryStatus);
    }




}

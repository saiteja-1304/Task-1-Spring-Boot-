package UST.Task1.controller;

//import UST.Task1.dto.Ecommercedto;
import UST.Task1.dto.Ecommercedto;
import UST.Task1.model.Ecommerce;
import UST.Task1.service.EcommerceService;
import jakarta.validation.Valid;
//import okhttp3.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecommerce")
public class EcommerceCrontoller {

    @Autowired
    private EcommerceService ecommerceService;

    @PostMapping("/addorder")
    public Ecommerce addOrder(@RequestBody @Valid Ecommercedto ecommerce){
        return ecommerceService.addOrder(ecommerce);
    }

    @GetMapping("/allorders")
    public List<Ecommerce>diplayAllOrders(){
        return ecommerceService.getAllOrders();
    }

    @GetMapping("/order1/{orderid}")
    public Ecommerce getOrderById(@PathVariable("orderid") long orderid){
        return ecommerceService.getOrderById(orderid);
    }

    @GetMapping("/order2/{customername}")
    public List<Ecommerce> getOrderByname(@PathVariable("customername") String customername){
        return ecommerceService.getOrderByname(customername);
    }

    @GetMapping("/order3/{orderItem}")
    public List<Ecommerce> getOrderByItemName(@PathVariable String orderItem){
        return ecommerceService.getOrderByname(orderItem);
    }

    @GetMapping("/order4/{date}")
    public List<Ecommerce> getOrderByDate(@PathVariable String date){
        return ecommerceService.getOrderByDate(date);
    }

    @GetMapping("/order5/{price}")
    public List<Ecommerce> getOrderByPrice(@PathVariable int price){
        return ecommerceService.getOrderByPrice(price);
    }

    @GetMapping("/order6/{deliveryStatus}")
    public List<Ecommerce> getOrderByDeliveryStatus(@PathVariable String deliveryStatus){
        return ecommerceService.getOrderByDeliveryStatus(deliveryStatus);
    }

}

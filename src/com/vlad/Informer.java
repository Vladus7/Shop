package com.vlad;
import  com.vlad.resources.*;

public class Informer {
    public void buy(User user, Products product){
        double price = product.callDescription(user);
        user.Buy(price);
       System.out.println(user.getName() +" купил " + product.getName() + " за " + price +" Заказ отправлен на склад");
    }
}

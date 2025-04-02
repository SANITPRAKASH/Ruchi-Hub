package com.nanu.ruchihub.request;

import com.nanu.ruchihub.model.Address;
import lombok.Data;

@Data
public class OrderRequest {

    private Long restaurantId;
    private Address deliveryAddress;
}

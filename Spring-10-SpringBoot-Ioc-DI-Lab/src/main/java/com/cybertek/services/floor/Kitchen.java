package com.cybertek.services.floor;

import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

public class Kitchen implements Floor {
    @Value("${diameter}")
    BigDecimal radius;

    @Override
    public BigDecimal getArea() {
        return radius.pow(2).multiply(BigDecimal.valueOf(Math.PI));
    }



}

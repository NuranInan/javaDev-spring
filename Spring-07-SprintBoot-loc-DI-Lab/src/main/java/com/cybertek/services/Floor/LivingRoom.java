package com.cybertek.services.Floor;

import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class LivingRoom implements Floor {

    @Value("5")
    BigDecimal width;

    @Value("10")
    BigDecimal length;

    @Override
    public BigDecimal getArea() {
        return width.multiply(length);
    }
}

package com.cybertek.interfaces.carpetPrices;

import com.cybertek.enums.City;

import java.math.BigDecimal;

public interface Carpet {
    BigDecimal getsqFtPrice(City city);
}


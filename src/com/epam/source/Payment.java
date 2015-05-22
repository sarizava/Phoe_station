package com.epam.source;

import java.util.Date;

/**
 * Created by Ruzhkov Nikolay on 22.05.2015.
 */
public class Payment {
    Date dayOFpayment = new Date();
    int cost;
    public Payment(Date dayOFpayment, int cost){
        this.dayOFpayment = dayOFpayment;
        this.cost = cost;
    }
}

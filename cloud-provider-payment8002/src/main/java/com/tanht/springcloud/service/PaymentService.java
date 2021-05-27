package com.tanht.springcloud.service;

import com.tanht.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:Tanht
 * @Description:
 * @Date:4:36 PM 1/4/2021
 * @version:1.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

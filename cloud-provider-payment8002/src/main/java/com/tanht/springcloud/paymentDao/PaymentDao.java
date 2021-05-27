package com.tanht.springcloud.paymentDao;

import com.tanht.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:Tanht
 * @Description:
 * @Date:4:09 PM 1/4/2021
 * @version:1.0
 */

@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

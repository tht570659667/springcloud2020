package com.tanht.springcloud.service.impl;

import com.tanht.springcloud.entities.Payment;
import com.tanht.springcloud.paymentDao.PaymentDao;
import com.tanht.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:Tanht
 * @Description:
 * @Date:4:36 PM 1/4/2021
 * @version:1.0
 */

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}

package com.cydeo.bootstrap;

import com.cydeo.entity.Payment;
import com.cydeo.entity.PaymentDetail;
import com.cydeo.enums.Status;
import com.cydeo.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;

    public DataGenerator(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Payment payment1=new Payment(new BigDecimal(150000), LocalDate.of(2022,4,19), Status.SUCCESS);
        PaymentDetail paymentDetail1=new PaymentDetail(new BigDecimal(140000),new BigDecimal(10000),LocalDate.of(2022,4,24));
        payment1.setPaymentDetail(paymentDetail1);

        Payment payment2=new Payment(new BigDecimal(120000), LocalDate.of(2022,3,17), Status.SUCCESS);
        PaymentDetail paymentDetail2=new PaymentDetail(new BigDecimal(110000),new BigDecimal(10000),LocalDate.of(2022,3,23));
        payment2.setPaymentDetail(paymentDetail2);

        paymentRepository.saveAll(Arrays.asList(payment1,payment2));

        paymentRepository.delete(payment1);

    }
}

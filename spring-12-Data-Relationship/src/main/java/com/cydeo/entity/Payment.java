package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
@NoArgsConstructor
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;
    private BigDecimal amount;

    @Column(columnDefinition = "Date")
    private LocalDate createdDate;

    @Enumerated(EnumType.STRING)
    private Status paymentStatus;

    @OneToOne(cascade = CascadeType.ALL) // when we do any change(remove,merge,persist,detach) in payment.Same action is going to happen in payment detail table.
    @JoinColumn(name="paymentDetail") // we change the column name
    private PaymentDetail paymentDetail;

    public Payment(BigDecimal amount, LocalDate createdDate, Status paymentStatus) {
        this.amount = amount;
        this.createdDate = createdDate;
        this.paymentStatus = paymentStatus;
    }
}

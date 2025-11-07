package com.yourapp.modules.payment.repository;


import com.yourapp.modules.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
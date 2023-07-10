package com.mancera.imali.reposritories;

import com.mancera.imali.models.Payment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}

package com.finno.finno_payments_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finno.finno_payments_service.entity.PaymentDTO;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentDTO, Integer> {

}

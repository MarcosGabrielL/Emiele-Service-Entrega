package com.softsaj.gibgasentrega.repository;

import com.softsaj.gibgasentrega.model.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

    List<Request> findByOrderId(long id);

    Request findByOrderIdAndCourierId(long orderId, long courierId);

    List<Request> findByCourierId(long id);

}
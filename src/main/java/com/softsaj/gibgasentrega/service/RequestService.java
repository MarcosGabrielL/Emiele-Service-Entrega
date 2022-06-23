package com.softsaj.gibgasentrega.service;

import com.softsaj.gibgasentrega.model.entity.Request;

import java.util.List;

public interface RequestService {

    Request getById(long id);

    List<Request> findByOrderId(long userId);

    Request findByOrderIdAndCourierId(long orderId, long courierId);

    void addRequest(Request request);

    void saveOrUpdate(Request request);

    List<Request> findByCourierId(long userId);

}
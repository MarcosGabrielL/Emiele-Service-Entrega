package com.softsaj.gibgasentrega.service.impl;

import com.softsaj.gibgasentrega.model.entity.Request;
import com.softsaj.gibgasentrega.repository.RequestRepository;
import com.softsaj.gibgasentrega.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RequestServiceImpl implements RequestService {

    final
    RequestRepository requestRepository;

    @Autowired
    public RequestServiceImpl(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @Override
    public List<Request> findByOrderId(long userId) {
        return requestRepository.findByOrderId(userId);
    }

    @Override
    public void addRequest(Request request) {
        requestRepository.save(request);
    }

    @Override
    public Request findByOrderIdAndCourierId(long orderId, long courierId) {
        return requestRepository.findByOrderIdAndCourierId(orderId, courierId);
    }

    @Override
    public Request getById(long id) {
        return requestRepository.getById(id);
    }

    @Override
    public void saveOrUpdate(Request request) {
        requestRepository.save(request);
    }

    @Override
    public List<Request> findByCourierId(long userId) {
        return requestRepository.findByCourierId(userId);
    }
}

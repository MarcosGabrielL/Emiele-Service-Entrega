package com.softsaj.gibgasentrega.service;

import com.softsaj.gibgasentrega.model.entity.Review;

import java.util.List;

public interface ReviewService {

    List<Review> findByUserId(long userId);

    List<Review> findByCourierId(long courierId);

}
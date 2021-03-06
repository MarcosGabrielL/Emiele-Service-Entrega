package com.softsaj.gibgasentrega.service;

import com.softsaj.gibgasentrega.model.entity.Address;
import com.softsaj.gibgasentrega.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AddressService {

    List<Address> findByUserId(long userId);

    Page<Address> findAllByPage(Pageable pageable);

    Page<Address> findByUserId(long userId, Pageable pageable);

    void saveOrUpdate(Address address);

    Address findByName(String name);

    Address findByNameAndUser(String name, User user);

    Address findOne(long addressId);

    void delete(long addressId);

    Long count();

    Long countByUserId(long userId);

}
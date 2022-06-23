package com.softsaj.gibgasentrega.service.impl;

import com.softsaj.gibgasentrega.model.entity.Address;
import com.softsaj.gibgasentrega.model.entity.User;
import com.softsaj.gibgasentrega.repository.AddressRepository;
import com.softsaj.gibgasentrega.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> findByUserId(long userId) {
        return addressRepository.findByUserId(userId);
    }

    @Override
    public void saveOrUpdate(Address address) {
        addressRepository.save(address);
    }

    @Override
    public Address findByName(String name) {
        return addressRepository.findByName(name);
    }

    @Override
    public Address findByNameAndUser(String name, User user) {
        return addressRepository.findByNameAndUser(name, user);
    }

    @Override
    public Address findOne(long addressId) {
        return addressRepository.getById(addressId);
    }

    @Override
    public Page<Address> findAllByPage(Pageable pageable) {
        return addressRepository.findAll(pageable);
    }

    @Override
    public Page<Address> findByUserId(long userId, Pageable pageable) {
        return addressRepository.findByUserId(userId, pageable);
    }

    @Override
    public Long count() {
        return addressRepository.count();
    }

    @Override
    public void delete(long addressId) {
        addressRepository.deleteById(addressId);
    }

    @Override
    public Long countByUserId(long userId) {
        return addressRepository.countByUserId(userId);
    }
}

package com.softsaj.gibgasentrega.service.impl;

import com.softsaj.gibgasentrega.model.entity.User;
import com.softsaj.gibgasentrega.repository.AuthRepository;
import com.softsaj.gibgasentrega.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthRepository authRepository;

    @Override
    public void register(User user) {
        authRepository.save(user);
    }

}

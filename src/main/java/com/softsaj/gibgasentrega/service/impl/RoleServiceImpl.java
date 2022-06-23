package com.softsaj.gibgasentrega.service.impl;

import com.softsaj.gibgasentrega.model.entity.Role;
import com.softsaj.gibgasentrega.repository.RoleRepository;
import com.softsaj.gibgasentrega.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findRole(long id) {
        return roleRepository.getById(id);
    }
}

package com.softsaj.gibgasentrega.service;

import com.softsaj.gibgasentrega.model.entity.User;

public interface SecurityService {

    boolean hasPermissions(User user, long userId);
    boolean hasAdminPermissions(User user);

}
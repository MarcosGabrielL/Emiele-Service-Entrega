package com.softsaj.gibgasentrega.service.impl;

import com.softsaj.gibgasentrega.model.entity.Role;
import com.softsaj.gibgasentrega.model.entity.User;
import com.softsaj.gibgasentrega.service.SecurityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SecurityServiceImpl implements SecurityService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityServiceImpl.class);

    @Override
    public boolean hasPermissions(User user, long userId) {
        // if user from @AuthenticationPrincipal id is equal to userId from @PathVariable
        LOGGER.info("hasPermissions with @AuthPrincipal user id: " + user.getId() + " : userId from @PathVariable: " + userId);

        // todo refactor this some small shit and extract "ROLE_ADMIN"!!!
        for (Role role : user.getRoles()) {
            if (role.getName().equalsIgnoreCase("ROLE_ADMIN")) {
                LOGGER.info("detected admin permissions (ROLE_ADMIN)");
                return true;
            }
        }

        return user.getId() == userId;
    }

    @Override
    public boolean hasAdminPermissions(User user) {
        for (Role role : user.getRoles()) {
            if (role.getName().equalsIgnoreCase("ROLE_ADMIN")) {
                LOGGER.info("detected admin permissions (ROLE_ADMIN)");
                return true;
            }
        }

        return false;
    }
}

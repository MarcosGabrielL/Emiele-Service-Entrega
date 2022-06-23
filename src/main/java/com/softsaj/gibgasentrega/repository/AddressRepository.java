package com.softsaj.gibgasentrega.repository;

import com.softsaj.gibgasentrega.model.entity.Address;
import com.softsaj.gibgasentrega.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findByUserId(long id);

    Page<Address> findByUserId(long id, Pageable pageable);

    Address findByName(String name);

    Address findByNameAndUser(String name, User user);

    Long countByUserId(long userId);

}
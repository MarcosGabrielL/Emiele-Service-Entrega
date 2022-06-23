package com.softsaj.gibgasentrega.repository;

import com.softsaj.gibgasentrega.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AuthRepository extends CrudRepository<User, Long> {



}

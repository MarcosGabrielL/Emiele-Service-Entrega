package com.softsaj.gibgasentrega.repository;

import com.softsaj.gibgasentrega.model.entity.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findByUserId(long id);

    Page<Ticket> findByUserId(long id, Pageable pageable);

    Long countByUserId(long userId);

}
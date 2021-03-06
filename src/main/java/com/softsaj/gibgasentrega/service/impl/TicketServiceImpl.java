package com.softsaj.gibgasentrega.service.impl;

import com.softsaj.gibgasentrega.model.entity.Ticket;
import com.softsaj.gibgasentrega.repository.TicketRepository;
import com.softsaj.gibgasentrega.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket getById(long id) {
        return ticketRepository.getById(id);
    }

    @Override
    public List<Ticket> findByUserId(long userId) {
        return ticketRepository.findByUserId(userId);
    }

    @Override
    public void saveOrUpdate(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public Page<Ticket> findByUserId(long userId, Pageable pageable) {
        return ticketRepository.findByUserId(userId, pageable);
    }

    @Override
    public Long countByUserId(long userId) {
        return ticketRepository.countByUserId(userId);
    }

    @Override
    public Long count() {
        return ticketRepository.count();
    }

    @Override
    public Page<Ticket> findAllByPage(Pageable pageable) {
        return ticketRepository.findAll(pageable);
    }
}

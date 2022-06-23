package com.softsaj.gibgasentrega.service;

import com.softsaj.gibgasentrega.model.entity.Message;

import java.util.List;

public interface MessageService {

    List<Message> findByTicketId(long ticketId);

    Message getById(long messageId);

    void saveOrUpdate(Message message);

}

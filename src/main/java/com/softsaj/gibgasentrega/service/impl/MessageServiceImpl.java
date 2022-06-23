package com.softsaj.gibgasentrega.service.impl;

import com.softsaj.gibgasentrega.model.entity.Message;
import com.softsaj.gibgasentrega.repository.MessageRepository;
import com.softsaj.gibgasentrega.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepository messageRepository;

    @Override
    public List<Message> findByTicketId(long ticketId) {
        return messageRepository.findByTicketId(ticketId);
    }

    @Override
    public Message getById(long messageId) {
        return messageRepository.getById(messageId);
    }

    @Override
    public void saveOrUpdate(Message message) {
        messageRepository.save(message);
    }
}

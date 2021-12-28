package com.contact.service;

import com.contact.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list = List.of(
            new Contact(1L, "kishor@gmail.com", "kishor", 1L),
            new Contact(2L, "plabon@gmail.com", "plabon", 1L),
            new Contact(3L, "rahat@gmail.com", "rahat", 2L),
            new Contact(4L, "Abrar@gmail.com", "Abrar", 3L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long id) {
        return this.list.stream().filter(contact -> contact.getUserId().equals(id)).collect(Collectors.toList());
    }
}

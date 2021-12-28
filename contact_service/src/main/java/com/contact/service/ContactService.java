package com.contact.service;

import com.contact.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long id);
}

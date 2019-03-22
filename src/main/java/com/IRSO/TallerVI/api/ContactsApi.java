package com.IRSO.TallerVI.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.IRSO.TallerVI.dao.ContactRepository;
import com.IRSO.TallerVI.model.Contact;


@RestController
public class ContactsApi {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public Iterable<Contact> getAll(){
       return contactRepository.findAll();
    }
	@RequestMapping(value="/contact/{id}", method=RequestMethod.GET)
	public Contact getById(@PathVariable Long id){
       return contactRepository.findOne(id);
    }
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public Contact saveContact(@RequestBody Contact contact){
        return contactRepository.save(contact);
    }
}

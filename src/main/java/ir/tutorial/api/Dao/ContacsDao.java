package ir.tutorial.api.Dao;

import ir.tutorial.api.entity.Contact;

import java.util.List;

public interface ContacsDao {
    // CRUD operation
    public Contact addContact(Contact contact) throws DaoException;
    public Contact findContactById(Long Id) throws DaoException;
    public Contact updateContact(Contact contact) throws DaoException;
    public Contact deleteContact(Contact contact) throws DaoException;

    // query
    public List<Contact> findAll(Contact contact) throws DaoException;
    public List<Contact> findByName(Contact contact) throws DaoException;
    public List<Contact> findByLastName(Contact contact) throws DaoException;




}

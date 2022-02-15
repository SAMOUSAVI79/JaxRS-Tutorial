package ir.tutorial.api.Dao;

import ir.tutorial.api.entity.Contact;

import java.util.List;

public class JdbsContactDao implements ContacsDao{

    @Override
    public Contact addContact(Contact contact) throws DaoException {
        return null;
    }

    @Override
    public Contact findContactById(Long Id) throws DaoException {
        return null;
    }

    @Override
    public Contact updateContact(Contact contact) throws DaoException {
        return null;
    }

    @Override
    public Contact deleteContact(Contact contact) throws DaoException {
        return null;
    }

    @Override
    public List<Contact> findAll(Contact contact) throws DaoException {
        return null;
    }

    @Override
    public List<Contact> findByName(Contact contact) throws DaoException {
        return null;
    }

    @Override
    public List<Contact> findByLastName(Contact contact) throws DaoException {
        return null;
    }
}

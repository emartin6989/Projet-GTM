package service;

import java.util.Collection;

import metier.Adresse;
import metier.Contact;

public interface IService {

	int ajouterAdresse(Adresse a);

	int ajouterContactAdresse(Contact c, Adresse a);

	int modifierAdresse(Adresse a);

	Collection<Contact> findAllContacts();

	Adresse findAdresse(int idAdresse);

	void deleteAdresse(Adresse a);

}
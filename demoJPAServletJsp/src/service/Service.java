package service;

import java.util.Collection;

import dao.Dao;
import dao.IDao;
import metier.Adresse;
import metier.Contact;

public class Service implements IService {

	private IDao id= new Dao();
	
	/* (non-Javadoc)
	 * @see service.IService#ajouterAdresse(metier.Adresse)
	 */
	@Override
	public int ajouterAdresse(Adresse a){
		return id.ajouterAdresse(a);
	}

	/* (non-Javadoc)
	 * @see service.IService#ajouterContactAdresse(metier.Contact, metier.Adresse)
	 */
	@Override
	public int ajouterContactAdresse(Contact c, Adresse a){
		return id.ajouterContactAdresse(c, a);
	}

	/* (non-Javadoc)
	 * @see service.IService#modifierAdresse(metier.Adresse)
	 */
	@Override
	public int modifierAdresse(Adresse a){
		return id.modifierAdresse(a);
	}

	/* (non-Javadoc)
	 * @see service.IService#findAllContacts()
	 */
	@Override
	public Collection<Contact> findAllContacts(){
		return id.findAllContacts();
	}

	/* (non-Javadoc)
	 * @see service.IService#findAdresse(int)
	 */
	@Override
	public Adresse findAdresse(int idAdresse){
	return id.findAdresse(idAdresse);
	};

	/* (non-Javadoc)
	 * @see service.IService#deleteAdresse(metier.Adresse)
	 */
	@Override
	public void deleteAdresse(Adresse a){
		id.deleteAdresse(a);
	};
}

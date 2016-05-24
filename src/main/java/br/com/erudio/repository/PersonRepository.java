package br.com.erudio.repository;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import br.com.erudio.models.Person;
import br.com.erudio.repository.generic.GenericRepository;
import br.com.erudio.repository.interfaces.IPersonRepository;

@Repository
public class PersonRepository extends GenericRepository<Person> implements IPersonRepository{

	private static final long serialVersionUID = 1L;
	
	private Logger logger = Logger.getLogger(PersonRepository.class);
	
	public PersonRepository() {
		super(Person.class);
	}
}

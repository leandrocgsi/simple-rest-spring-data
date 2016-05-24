package br.com.erudio.repository.interfaces;

import org.springframework.data.repository.CrudRepository;

import br.com.erudio.models.Person;

public interface IPersonRepository extends CrudRepository<Person, Long> {

}
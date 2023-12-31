package com.example.batchprocessing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person>  {

	private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);
	
	@Override
	public Person process(final Person person) throws Exception {
		final String firstName = person.firstName().toUpperCase();
		final String lastName = person.lastName().toUpperCase();
		final String fullName = firstName+lastName;
		
		final Person  transformPerson = new Person(firstName, lastName, fullName);
		
		log.info("Converting (" + person +  ") into (" + transformPerson + ")");
		return transformPerson;
	}

}

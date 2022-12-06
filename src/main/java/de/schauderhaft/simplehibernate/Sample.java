package de.schauderhaft.simplehibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sample {
	@Id
	Long id;
	String name;
}

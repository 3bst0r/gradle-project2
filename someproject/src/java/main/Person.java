package main;
import java.util.Date;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

public class Person implements Comparable<Person> {
	
	public String firstname, lastname;
	public String svn;
	public Date dateOfBirth;
	public int weight;
	
	public Person(String firstname, String lastname, String svn,
		Date dateOfBirth, int weight) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.svn = svn;
		this.dateOfBirth = dateOfBirth;
		this.weight = weight;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(firstname,lastname,svn,dateOfBirth,weight);
	}
	
	
	@Override
	public int compareTo(Person that) {
		return ComparisonChain.start()
	             .compare(this.firstname, that.firstname)
	             .compare(this.lastname, that.lastname)
	             .compare(this.dateOfBirth, that.dateOfBirth, Ordering.natural().nullsLast())
	             .result();
	}

	public void main(String[] args) {
		Person p = new Person("Johannes","Ebster","0a1231431j42",new Date(),70);		
		System.out.println(p.firstname + " " + p.lastname);
	}
}

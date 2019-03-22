package ontology;

import jade.content.onto.BeanOntology;
import jade.content.onto.BeanOntologyException;
import jade.content.onto.Ontology;

public class TimeTableOntology extends BeanOntology{
	
	private static Ontology theInstance = new TimeTableOntology("my_ontology");
	
	public static Ontology getInstance(){
		return theInstance;
	}
	//singleton pattern
	private TimeTableOntology(String name) {
		super(name);
		try {
			add("ontology.elements");
		} catch (BeanOntologyException e) {
			e.printStackTrace();
		}
	}
}
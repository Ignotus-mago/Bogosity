import java.util.ArrayList;

import processing.core.PApplet;
import net.paulhertz.util.*;


public class AssignRandomly extends PApplet {


	String[] hypers =   {"Alexi Shulgin", "JODI.org", "Heath Bunting", "Natalie Bookchin", "Young-Hae Chang", "Mouchette"};

	String[] students = {"Yasmine", "Laura", "Chenyu", "Dylan", 
	           "Tyler", "Maurice", "Gabriella", 
	           "Kunning", "Caleb", "Kacie", "Somin", "Jonathon", 
	           "Deanna", "Katherine", "Jonathon", "Samantha", 
	           "Bobby", "Caitlin", "Liqian"};

	String[] ppl = {"A. Bill Miller", "Antonio Roberts", "Kyle Evans", "James Connolly", 
			"Jason Soliday", "Jeff Kolar", "Joseph Y0lk Chiocchi", "Jon Satrom", 
			"Ben Syverson", "Nick Briz", "Rob Ray", "Nick Kegeyan",  
			"Curt Cloninger", "Shawné Michelain Holloway", "jonCates", 
			"Melissa Barron", "Lisa Slodki", "Paul Hertz", 
			"Alfredo Salazar-Caro", "stAllio!", "I <3 Presets", "Channel TWo", "PoxParty"};
	
	
	String[] unichars;
	
	RandUtil rando;
	ArrayList studentsList;
	ArrayList hypersList;
	ArrayList pplList;

	/**
	 * @param args
	 * Entry point used in Eclipse IDE
	 */
	public static void main(String[] args) {
		PApplet.main(new String[] { "--present", "AssignRandomly" });
	}


	public void setup() {
	  size(640, 480);
	  smooth();
	  rando = new RandUtil();
	  studentsList = new ArrayList();
	  hypersList = new ArrayList();
	  pplList = new ArrayList();
	  for(String stu : students) {
	    studentsList.add(stu);
	  }
	  for(String hyp : hypers) {
		    hypersList.add(hyp);
		  }
	  for(String person : ppl) {
		    pplList.add(person);
		  }
	  assignReading();
	  noLoop();
	}


	public void draw() {
	  
	}


	public void assignReading() {
	  rando.shuffle(studentsList);
	  rando.shuffle(hypersList);
	  rando.shuffle(pplList);
	  int i = 0;
	  for(Object stu : studentsList) {
	    println((String)stu +": "+ hypersList.get(i++ % hypersList.size()));
	  }
	  for (i = 0; i < 20; i++) {
		  rando.shuffle(pplList);
		  for(Object person : pplList) {
			  print((String)person +" • ");
		  }
	  }
	  println();
	}
}

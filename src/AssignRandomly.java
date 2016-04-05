import java.util.ArrayList;

import processing.core.PApplet;
import net.paulhertz.util.*;


public class AssignRandomly extends PApplet {

	/*
	String[] hypers =   {"Grammatron (Mark Amerika)", "World of Awe (Yael Kanarek)", "_Datableeding (Mary-Anne Mez Breeze)", 
	                     "Anecdoted Topography of Chance (Daniel Spoerri)", "Translucidity (Talan Memmott)", 
	                     "These Waves of Girls (Caitlin Fisher)"};
	String[] students = {"Isabel Bogarin", "Gabrielle Bohr", "Diana Chenault", "Mark Deleon", "Anthony Edwards-Bacon", 
	                     "Brandon Herford", "Ryan Hrovat", "Olivia Jones-Hernandez", "Hyunji Kang", "Timothy Kelly", 
	                     "Taylor Knight", "Chia Chang Koo (Jack)", "Elliott Mickleburgh", "Diandra Miller", "Miguel Perez", 
	                     "Heather Platen", "Darcy Provencher", "Emily Simpson", "Samuel Smith", "Ana Treffinger", 
	                     "Andrew Valenzuela", "Keith Whittaker"};
	*/
	/*
	String[] hypers =   {"World of Awe", "GRAMMATRON", "Paths of Luminous Painting", "Reach", "My Body"};

	String[] students = {"Tim W Adamczyk", "Laura Andrea Campuzano", "Kevin Carey", "Kyrie Alexis Demay", 
	                     "James George DiGilio Jr.", "William Arthur Eriksson", "Hunter James Foster", 
	                     "Jeremy Douglas Gloster", "Lisa Greene", "Sam Grossinger", "Sanglim Han", 
	                     "Brooke Herzing", "Sandy King", "Christopher Michael McLaughlin", "Hayden Worth Myrick", 
	                     "Lindsey Ellen Neiman", "Tyler Joseph Nieset", "Alison Noggle", "Brian Peterson", 
	                     "Sana Qazi", "Anna Russett", "JuHyung Ryou", "Anya Hayley Shapiro", "Samuel Curtis Shapiro", 
	                     "Chelsea Traynor", "Ian Wallach"};
	                     */

	String[] hypers =   {"Alexi Shulgin", "JODI.org", "Heath Bunting", "Natalie Bookchin", "Young-Hae Chang", "Mouchette"};

	String[] students = {"Yasmine Fouad Aghabi", "Laura Sevall Bise", "Chenyu Chen", "Dylan O'Neill Cooper", 
	           "Tyler Anthony Thomas Gunn", "Maurice Hampton", "Gabriella Elizabeth Hileman", 
	           "Kunning Huang", "Caleb Kaiser", "Kacie Elizabeth Lambert", "Somin Lee", "Jonathon Lee McJunkin", 
	           "Deanna Sandra Musurlian", "Katherine T Rapheal", "Jonathon Scott", "Samantha D Siew", 
	           "Bobby T Swainhart", "Caitlin Brooke Weres", "Liqian Xu"};

	String[] ppl = {"A. Bill Miller", "Antonio Roberts", "Kyle Evans", "James Connolly", 
			"Jason Soliday", "Jeff Kolar", "Joseph Y0lk Chiocchi", "Jon Satrom", 
			"Ben Syverson", "Nick Briz", "Rob Ray", "Nick Kegeyan",  
			"Curt Cloninger", "Shawné Michelain Holloway", "jonCates", 
			"Melissa Barron", "Lisa Slodki", "Paul Hertz", 
			"Alfredo Salazar-Caro", "stAllio!", "I <3 Presets", "Channel TWo", "PoxParty"};
	
	/*

	///// names only /////
	"A. Bill Miller", "Antonio Roberts", "Kyle Evans", "James Connolly", 
	"Jason Soliday", "Jeff Kolar", "Joseph Y0lk Chiocchi", "Jon Satrom", 
	"Ben Syverson", "Nick Briz", "Nick Kegeyan", "Rob Ray", "Rosa Menkman", 
	"Curt Cloninger", "Shawné Michelain Holloway", "Jon Cates", 
	"Melissa Barron", "Lisa Slodki", "Theodore Darst", "Jessica Westbrook", 
	"Adam Trowbridge", "Paul Hertz", "Alfredo Salazar-Caro", "Benjamin Berg"
	
	///// names and identities /////
	"A. Bill Miller", "Antonio Roberts", "Kyle Evans", "James Connolly", 
	"Jason Soliday", "Jeff Kolar", "Joseph Y0lk Chiocchi", "Jon Satrom", 
	"Ben Syverson", "Nick Briz", "Nick Kegeyan", "Rob Ray", "Rosa Menkman", 
	"Curt Cloninger", "Shawné Michelain Holloway", "Jon Cates", 
	"Melissa Barron", "Lisa Slodki", "Theodore Darst", "Jessica Westbrook", 
	"Adam Trowbridge", "Paul Hertz", "Alfredo Salazar-Caro", "Benjamin Berg",
	"stAllio!", "I <3 Presets", "Channel TWo", "PoxParty"

	 */
	
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

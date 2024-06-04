package lt.viko.eif.lblauzdys.electronicsstoreclient.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Store class holds information about the Store inventory.
 *
 * @author laurynas.blauzdys@stud.viko.lt
 * @see Shelf
 * @since 1.0
 */

@XmlRootElement
public class Store {
	private String Name;

	private String Location;

	private List<Shelf> Shelves = new ArrayList<>(); //// List of shelves in the store

	public Store(String name, String location) { //Constructor with name and location parameters
		Name = name;
		Location = location;
	}

	public Store() {
	}

	@Override
	public String toString() { //Converts the store details to a string representation
		return String.format("Store:\n" +
						"\tName: %s\n" +
						"\tLocation: %s\n" +
						"%s",
				this.Name,
				this.Location,
				constructInventoryList());
	}

	//Constructs a string representation of the inventory list. Return A string containing details of all shelves in the store.
	private String constructInventoryList() {
		String result = "";
		for (Shelf shelf : Shelves) {
			result += shelf;
		}
		return result;
	}

	//Getter and setter
	@XmlElement(name = "Shelves")
	public List<Shelf> getShelves() {
		return Shelves;
	}

	@XmlAttribute(name = "Location")
	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	@XmlAttribute(name = "Name")
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}

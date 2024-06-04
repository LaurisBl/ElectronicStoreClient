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

	private List<Shelf> Shelves = new ArrayList<>();

	public Store(String name, String location) {
		Name = name;
		Location = location;
	}

	public Store() {
	}

	@Override
	public String toString() {
		return String.format("Store:\n" +
						"\tName: %s\n" +
						"\tLocation: %s\n" +
						"%s",
				this.Name,
				this.Location,
				constructInventoryList());
	}

	private String constructInventoryList() {
		String result = "";
		for (Shelf shelf : Shelves) {
			result += shelf;
		}
		return result;
	}

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
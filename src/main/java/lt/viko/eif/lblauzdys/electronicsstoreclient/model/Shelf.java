package lt.viko.eif.lblauzdys.electronicsstoreclient.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Shelf class holds information about the inventory of the store
 *
 * @author laurynas.blauzdys@stud.viko.lt
 * @see Store
 * @see Computer
 * @since 1.0
 */

public class Shelf {
	private int ShelfID;
	private List<Computer> Computers = new ArrayList<>();

	public Shelf(int shelfID) {
		ShelfID = shelfID;
	}

	public Shelf() {
	}

	@Override
	public String toString() {
		return String.format("\tShelf:\n" +
						"\t\tID: %d\n" +
						"%s",
				this.ShelfID,
				constructInventoryList());
	}

	private String constructInventoryList() {
		String result = "";
		for (Computer computer : Computers) {
			result += computer;
		}
		return result;
	}

	@XmlAttribute(name = "ID")
	public int getShelfID() {
		return ShelfID;
	}

	public void setShelfID(int shelfID) {
		ShelfID = shelfID;
	}

	@XmlElement(name = "Computers")
	public List<Computer> getComputers() {
		return Computers;
	}
}

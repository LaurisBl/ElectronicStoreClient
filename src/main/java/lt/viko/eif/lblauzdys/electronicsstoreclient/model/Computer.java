package lt.viko.eif.lblauzdys.electronicsstoreclient.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.text.DecimalFormat;

/**
 * Computer class holds information about the computers held in the shelves of a store.
 *
 * @author laurynas.blauzdys@stud.viko.lt
 * @see Shelf
 * @see Store
 * @since 1.0
 */

public class Computer {  // Fields to store information about the computer
	private String Name;
	private String Manufacturer;
	private String UseCase;
	private String Specification;
	private float Price;

	// Constructor with parameters to initialize a Computer object
	public Computer(String name, String manufacturer, String useCase, String specification, float price) {
		Name = name;
		Manufacturer = manufacturer;
		UseCase = useCase;
		Specification = specification;
		Price = price;
	}

	// Default constructor for JAXB
	public Computer() {
	}

	// Overriding the toString() method to provide a string representation of the Computer object
	@Override
	public String toString() {
		// Formatting the price to two decimal places
		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(2);

		// Returning the string representation of the Computer object
		return String.format("\t\t%s:\n" +
						"\t\t\tManufacturer: %s\n" +
						"\t\t\tUse case: %s\n" +
						"\t\t\tSpecification: %s\n" +
						"\t\t\tPrice: %s\n",
				this.Name,
				this.Manufacturer,
				this.UseCase,
				this.Specification,
				df.format(this.Price));
	}

	// Getter and setter methods with @XmlAttribute annotation for XML serialization
	@XmlAttribute(name = "Name")
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@XmlAttribute(name = "Manufacturer")
	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	@XmlAttribute(name = "UseCase")
	public String getUseCase() {
		return UseCase;
	}

	public void setUseCase(String useCase) {
		UseCase = useCase;
	}

	@XmlAttribute(name = "Specification")
	public String getSpecification() {
		return Specification;
	}

	public void setSpecification(String specification) {
		Specification = specification;
	}

	@XmlAttribute(name = "Price")
	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}
}

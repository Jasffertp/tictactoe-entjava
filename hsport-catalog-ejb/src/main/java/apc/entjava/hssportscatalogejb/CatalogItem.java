package apc.entjava.hssportscatalogejb;

//import java.time.LocalDate;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="CATALOG_ITEM")
public class CatalogItem {
	@Id
	@Column(name="CATALOG_ITEM_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long itemId;

	@Column(name="NAME")
	private String name;

	@Column(name="MANUFACTURER")
	private String manufacturer;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "AVAILABLE_DATE")
	private Date availableDate;

	public CatalogItem() {
		
	}
	
	public CatalogItem(String name, String manufacturer, String description, Date availableDate) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.availableDate = availableDate;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}

	@Override
	public String toString() {
		return "CatalogItem [itemId=" + itemId + ", name=" + name + ", manufacturer=" + manufacturer + ", description="
				+ description + ", availableDate=" + availableDate + "]";
	}

}

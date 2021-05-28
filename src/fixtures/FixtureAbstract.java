package fixtures;

abstract class FixtureAbstract {
	public String name="";
	public String shortDescription="";
	public String longDescription="";	
	//Constructor to set the values that are inputed by user
	public FixtureAbstract(String name, String shortDescription, String longDescription){
		super();
		this.name=name;
		this.shortDescription=shortDescription;
		this.longDescription=longDescription;
	}
	
	//setters and getters for defining the user description
	public String getName(String name) {
		return name;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription=shortDescription;
	}
	
	public void setLongDescription(String longDescription) {
		this.longDescription=longDescription;
	}
	
	public String getShortDescript(String shortDescription){
		return shortDescription;
	}
	public String getLongDescript(String longDescription) {
		return longDescription;
	}
	public void setName(String name) {
		this.name=name;
	}
}

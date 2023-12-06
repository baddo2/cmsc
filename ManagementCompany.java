
public class ManagementCompany {
	
	static final int MAX_PROPERTY = 5;
	static final int MGMT_DEPTH = 10;
	static final int MGMT_WIDTH = 10;
	private String name;
    private String taxID;
    private double mgmFee;
    private Property[] properties;
    private Plot plot;
    private int numberOfProperties;

	
    public ManagementCompany() {
    	this.name = "";
		this.taxID = "";
		this.mgmFee = 0.0;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}
    
    public ManagementCompany(String name, String taxID, double mgmFee) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFee = mgmFee;
        plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        properties = new Property[MAX_PROPERTY];
    }
    
    public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
	}
    
    public ManagementCompany(ManagementCompany otherCompany) {
        this.name = otherCompany.name;
        this.taxID = otherCompany.taxID;
        this.mgmFee = otherCompany.mgmFee;
        this.plot = new Plot(otherCompany.plot);
        this.properties = new Property[MAX_PROPERTY];
    }
    
    public int addProperty(String name, String city, double rent, String owner) {
        Property newProperty = new Property(name, city, rent, owner);

        if (numberOfProperties >= MAX_PROPERTY) {
            return -1; 
        }

        if (newProperty == null) {
            return -2; 
        }

        if (!plot.encompasses(newProperty.getPlot())) {
            return -3; 
        }

        for (int i = 0; i < numberOfProperties; i++) {
            if (properties[i] != null && properties[i].getPlot().overlaps(newProperty.getPlot())) {
                return -4; 
            }
        }

        properties[numberOfProperties] = newProperty;
        numberOfProperties++;
        return numberOfProperties - 1; 
    }
    
    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
        Property newProperty = new Property(name, city, rent, owner, x, y, width, depth);

        if (newProperty == null) {
            return -2;
        }

        if (!plot.encompasses(newProperty.getPlot())) {
            return -3;
        }

        for (int i = 0; i < numberOfProperties; i++) {
            if (properties[i] != null && properties[i].getPlot().overlaps(newProperty.getPlot())) {
                return -4;
            }
        }

        if (numberOfProperties == MAX_PROPERTY) {
            return -1;
        }

        properties[numberOfProperties] = newProperty;
        numberOfProperties++;

        return numberOfProperties - 1;
    }

    public int addProperty(Property property) {
    	int index = 0;
        if (property == null) {
            return -2;
        }
        if (index >= MAX_PROPERTY) {
            return -1; 
        }

        if (!this.plot.encompasses(property.getPlot())) {
            return -3;
        }

        for (int i = 0; i < index; i++) {
            if (properties[i] != null && properties[i].getPlot().overlaps(property.getPlot())) {
                return -4; 
            }
        }

        properties[index] = new Property(property);
        index++;

        return index - 1; 
    }
    
    public void removeLastProperty() {
        for (int i = properties.length - 1; i >= 0; i--) {
            if (properties[i] != null) {
                properties[i] = null;
            }
        }
    }

    public boolean isPropertiesFull() {
    	if (numberOfProperties == MAX_PROPERTY) {
            return true; 
        } else {
            return false;
        }
    }

    public int getPropertiesCount() {
        int count = 0;
        for (Property property : properties) {
            if (property != null) {
                count++;
            }
        }
        return count;
    }

    public Property getHighestRentProperty() {
        Property highestRentProperty = null;
        double maxRent = 0.0;
        for (Property property : properties) {
            if (property != null && property.getRentAmount() > maxRent) {
                maxRent = property.getRentAmount();
                highestRentProperty = property;
            }
        }
        return highestRentProperty;
    }

    public double getTotalRent() {
        double totalRent = 0.0;
        for (Property property : properties) {
            if (property != null) {
                totalRent += property.getRentAmount();
            }
        }
        return totalRent;
    }
    
    public boolean isMangementFeeValid() {
    	if (mgmFee >= 0.0 && mgmFee <= 100.0) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getTaxID() {
        return taxID;
    }

    public Property[] getProperties() {
        return properties;
    }

    public double getMgmFeePer() {
        return mgmFee;
    }

    public Plot getPlot() {
        return plot;
    }

    @Override
    public String toString() {
        String result = "List of the properties for " + name + ", taxID: " + taxID + "\n";
        result += "______________________________________________________\n";

        for (int i = 0; i < properties.length; i++) {
            if (properties[i] != null) {
                result += properties[i].toString() + "\n";
                result += "______________________________________________________\n";
            }
        }

        double totalManagementFee = mgmFee * getTotalRent() / 100.0;

        result += "\n total management Fee: " + totalManagementFee;

        return result;
    }



}

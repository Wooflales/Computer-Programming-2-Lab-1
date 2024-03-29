import javax.xml.namespace.QName;
import java.util.Scanner;
import java.util.*;
public class Product {
    private String id;
    private String name;
    private String description;
    private int cost;

    public Product(String id, String name, String description, int cost) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String productInfo() {
        return "The " + this.getName()+ " is described as " + this.getDescription() + ", and it costs $" + this.getCost();
    }
    public String toCSVDataRecord() {
        return this.id + ", " + this.name + ", " + this.description + ", " + this.cost;
    }
}

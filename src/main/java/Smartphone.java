import java.util.ArrayList;

public class Smartphone implements Radio, GPS{
    private String modelName;
    private String manufacturName;
    private ArrayList<Contact> contactList;

    public Smartphone(){}

    public Smartphone(String modelName, String manufacturName, ArrayList<Contact> contactList){
        this.modelName = modelName;
        this.manufacturName = manufacturName;
        this.contactList = contactList;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturName() {
        return manufacturName;
    }

    public void setManufacturName(String manufacturName) {
        this.manufacturName = manufacturName;
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String toString() {
        return  "\nModel: '" + modelName+
                "\nHersteller: " + manufacturName +
                "\nKontaktliste: " + contactList;
    }
}

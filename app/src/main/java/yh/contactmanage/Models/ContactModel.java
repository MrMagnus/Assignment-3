package yh.contactmanage.Models;

/**
 * Created by Magnus on 2014-09-16.
 */
public class ContactModel {

    //Class variables
    private String url;
    private String name;
    private String description;

    public ContactModel(String url, String name, String description){

        this.url = url;
        this.name = name;
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

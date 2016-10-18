package bd.edu.httpdaffodilvarsity.jobtrack.model;

import android.provider.ContactsContract;

/**
 * Created by mahmud on 10/17/16.
 */
public class EmployeeList {

    public ContactsContract.Contacts.Photo image;
    public String name;
    public int id;
    public String Designation;


    public ContactsContract.Contacts.Photo getImage() {
        return image;
    }

    public void setImage(ContactsContract.Contacts.Photo image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String Department;

}

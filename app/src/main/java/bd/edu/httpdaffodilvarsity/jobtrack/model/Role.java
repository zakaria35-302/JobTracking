package bd.edu.httpdaffodilvarsity.jobtrack.model;

/**
 * Created by mahmud on 12/15/16.
 */


//import javax.persistence.Embeddable;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Embeddable
//@Table(name = "hrm_role")
public class Role {

    //@Id
    private int role_id;

    private String role;

    public Role() {
        super();
    }

    public Role(int role_id, String role) {
        this.role_id = role_id;
        this.role = role;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

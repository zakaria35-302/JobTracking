package bd.edu.httpdaffodilvarsity.jobtrack.model;

/**
 * Created by mahmud on 12/15/16.
 */

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Embeddable
//@Table(name = "hrm_org_task_status")
public class OrgTaskStatus {

    //@Id
    private int status_id;
    private String status;

    public OrgTaskStatus() {
    }

    public OrgTaskStatus(int status_id, String status) {
        this.status_id = status_id;
        this.status = status;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

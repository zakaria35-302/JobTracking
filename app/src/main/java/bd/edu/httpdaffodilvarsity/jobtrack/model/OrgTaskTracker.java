package bd.edu.httpdaffodilvarsity.jobtrack.model;

/**
 * Created by mahmud on 12/15/16.
 */

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name = "hrm_org_task_tracker")
public class OrgTaskTracker {

    //@Id
    private int task_id;
    private int employee_id;
    private String role;
    private int read_flag;
    private int mem_status;
    private boolean email_want;
    private boolean visible;

    public OrgTaskTracker(int task_id, int employee_id, String role, int read_flag, int mem_status, boolean email_want,
                          boolean visible) {
        this.task_id = task_id;
        this.employee_id = employee_id;
        this.role = role;
        this.read_flag = read_flag;
        this.mem_status = mem_status;
        this.email_want = email_want;
        this.visible = visible;
    }

    public OrgTaskTracker() {
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getRead_flag() {
        return read_flag;
    }

    public void setRead_flag(int read_flag) {
        this.read_flag = read_flag;
    }

    public int getMem_status() {
        return mem_status;
    }

    public void setMem_status(int mem_status) {
        this.mem_status = mem_status;
    }

    public boolean isEmail_want() {
        return email_want;
    }

    public void setEmail_want(boolean email_want) {
        this.email_want = email_want;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}

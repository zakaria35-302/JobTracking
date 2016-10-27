package bd.edu.httpdaffodilvarsity.jobtrack.JobManagement;

/**
 * Created by mahmud on 10/27/16.
 */
public class JobManagementClass {

    private String employeeJobTittle;
    private String employeeJobOwner;
    private String employeeJobDepartment;
    private String employeeJobGivenDate;
    private String employeeJobEstDate;
    private String employeeJobStatus;
    private String employeeJobProgress;
    private String employeeJobPriority;

    public JobManagementClass(String employeeJobTittle, String employeeJobOwner, String employeeJobDepartment,
                              String employeeJobGivenDate, String employeeJobEstDate, String employeeJobStatus,
                              String employeeJobProgress, String employeeJobPriority) {
        this.employeeJobTittle = employeeJobTittle;
        this.employeeJobOwner = employeeJobOwner;
        this.employeeJobDepartment = employeeJobDepartment;
        this.employeeJobGivenDate = employeeJobGivenDate;
        this.employeeJobEstDate = employeeJobEstDate;
        this.employeeJobStatus = employeeJobStatus;
        this.employeeJobProgress = employeeJobProgress;
        this.employeeJobPriority = employeeJobPriority;
    }

    public String getEmployeeJobTittle() {
        return employeeJobTittle;
    }

    public void setEmployeeJobTittle(String employeeJobTittle) {
        this.employeeJobTittle = employeeJobTittle;
    }

    public String getEmployeeJobOwner() {
        return employeeJobOwner;
    }

    public void setEmployeeJobOwner(String employeeJobOwner) {
        this.employeeJobOwner = employeeJobOwner;
    }

    public String getEmployeeJobDepartment() {
        return employeeJobDepartment;
    }

    public void setEmployeeJobDepartment(String employeeJobDepartment) {
        this.employeeJobDepartment = employeeJobDepartment;
    }

    public String getEmployeeJobGivenDate() {
        return employeeJobGivenDate;
    }

    public void setEmployeeJobGivenDate(String employeeJobGivenDate) {
        this.employeeJobGivenDate = employeeJobGivenDate;
    }

    public String getEmployeeJobEstDate() {
        return employeeJobEstDate;
    }

    public void setEmployeeJobEstDate(String employeeJobEstDate) {
        this.employeeJobEstDate = employeeJobEstDate;
    }

    public String getEmployeeJobStatus() {
        return employeeJobStatus;
    }

    public void setEmployeeJobStatus(String employeeJobStatus) {
        this.employeeJobStatus = employeeJobStatus;
    }

    public String getEmployeeJobProgress() {
        return employeeJobProgress;
    }

    public void setEmployeeJobProgress(String employeeJobProgress) {
        this.employeeJobProgress = employeeJobProgress;
    }

    public String getEmployeeJobPriority() {
        return employeeJobPriority;
    }

    public void setEmployeeJobPriority(String employeeJobPriority) {
        this.employeeJobPriority = employeeJobPriority;
    }
}

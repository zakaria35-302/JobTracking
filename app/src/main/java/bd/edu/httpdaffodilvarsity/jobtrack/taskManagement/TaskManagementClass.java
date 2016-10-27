package bd.edu.httpdaffodilvarsity.jobtrack.taskManagement;

/**
 * Created by mahmud on 10/26/16.
 */
public class TaskManagementClass {

    private String employeeJobTittle;
    private String employeeTaskTittle;
    private String employeeTaskOwner;
    private String employeeTaskDepartment;
    private String employeeTaskGivenDate;
    private String employeeTaskEstDate;
    private String employeeTaskStatus;
    private String employeeTaskProgress;
    private String employeeTaskPriority;

    public TaskManagementClass(String employeeJobTittle, String employeeTaskTittle, String employeeTaskOwner,
                               String employeeTaskDepartment, String employeeTaskGivenDate, String employeeTaskEstDate,
                               String employeeTaskStatus, String employeeTaskProgress, String employeeTaskPriority) {
        this.employeeJobTittle = employeeJobTittle;
        this.employeeTaskTittle = employeeTaskTittle;
        this.employeeTaskOwner = employeeTaskOwner;
        this.employeeTaskDepartment = employeeTaskDepartment;
        this.employeeTaskGivenDate = employeeTaskGivenDate;
        this.employeeTaskEstDate = employeeTaskEstDate;
        this.employeeTaskStatus = employeeTaskStatus;
        this.employeeTaskProgress = employeeTaskProgress;
        this.employeeTaskPriority = employeeTaskPriority;
    }

    public String getEmployeeJobTittle() {
        return employeeJobTittle;
    }

    public void setEmployeeJobTittle(String employeeJobTittle) {
        this.employeeJobTittle = employeeJobTittle;
    }

    public String getEmployeeTaskTittle() {
        return employeeTaskTittle;
    }

    public void setEmployeeTaskTittle(String employeeTaskTittle) {
        this.employeeTaskTittle = employeeTaskTittle;
    }

    public String getEmployeeTaskOwner() {
        return employeeTaskOwner;
    }

    public void setEmployeeTaskOwner(String employeeTaskOwner) {
        this.employeeTaskOwner = employeeTaskOwner;
    }

    public String getEmployeeTaskDepartment() {
        return employeeTaskDepartment;
    }

    public void setEmployeeTaskDepartment(String employeeTaskDepartment) {
        this.employeeTaskDepartment = employeeTaskDepartment;
    }

    public String getEmployeeTaskGivenDate() {
        return employeeTaskGivenDate;
    }

    public void setEmployeeTaskGivenDate(String employeeTaskGivenDate) {
        this.employeeTaskGivenDate = employeeTaskGivenDate;
    }

    public String getEmployeeTaskEstDate() {
        return employeeTaskEstDate;
    }

    public void setEmployeeTaskEstDate(String employeeTaskEstDate) {
        this.employeeTaskEstDate = employeeTaskEstDate;
    }

    public String getEmployeeTaskStatus() {
        return employeeTaskStatus;
    }

    public void setEmployeeTaskStatus(String employeeTaskStatus) {
        this.employeeTaskStatus = employeeTaskStatus;
    }

    public String getEmployeeTaskProgress() {
        return employeeTaskProgress;
    }

    public void setEmployeeTaskProgress(String employeeTaskProgress) {
        this.employeeTaskProgress = employeeTaskProgress;
    }

    public String getEmployeeTaskPriority() {
        return employeeTaskPriority;
    }

    public void setEmployeeTaskPriority(String employeeTaskPriority) {
        this.employeeTaskPriority = employeeTaskPriority;
    }
}

package bd.edu.httpdaffodilvarsity.jobtrack.taskManagement;

/**
 * Created by mahmud on 10/26/16.
 */
public class TaskManagementClass {

    private String employeeTaskTittle;
    private String employeeTaskOwner;
    private String employeeTaskGivenDate;
    private String employeeTaskDepartment;
    private String employeeTaskEstDate;
    private String employeeTaskStatus;
    private String employeeTaskProgress;
    private String employeeTaskPriority;

    public TaskManagementClass(String employeeTaskPriority, String employeeTaskTittle, String employeeTaskOwner,
                               String employeeTaskGivenDate, String employeeTaskDepartment, String employeeTaskEstDate,
                               String employeeTaskStatus, String employeeTaskProgress) {
        this.employeeTaskPriority = employeeTaskPriority;
        this.employeeTaskTittle = employeeTaskTittle;
        this.employeeTaskOwner = employeeTaskOwner;
        this.employeeTaskGivenDate = employeeTaskGivenDate;
        this.employeeTaskDepartment = employeeTaskDepartment;
        this.employeeTaskEstDate = employeeTaskEstDate;
        this.employeeTaskStatus = employeeTaskStatus;
        this.employeeTaskProgress = employeeTaskProgress;
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

    public String getEmployeeTaskGivenDate() {
        return employeeTaskGivenDate;
    }

    public void setEmployeeTaskGivenDate(String employeeTaskGivenDate) {
        this.employeeTaskGivenDate = employeeTaskGivenDate;
    }

    public String getEmployeeTaskDepartment() {
        return employeeTaskDepartment;
    }

    public void setEmployeeTaskDepartment(String employeeTaskDepartment) {
        this.employeeTaskDepartment = employeeTaskDepartment;
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

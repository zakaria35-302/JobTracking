package bd.edu.httpdaffodilvarsity.jobtrack.taskManagement;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mahmud on 10/27/16.
 */
public class ListviewAvailableTaskDetailsClass {
    private int taskDetailsImageResource;
    private String taskDetailsName;
    private String taskDetailsRole;
    private String taskDetailsPerticipation;


    public ListviewAvailableTaskDetailsClass(int taskDetailsImageResource, String taskDetailsName,
                                             String taskDetailsRole, String taskDetailsPerticipation) {
        this.taskDetailsImageResource = taskDetailsImageResource;
        this.taskDetailsName = taskDetailsName;
        this.taskDetailsRole = taskDetailsRole;
        this.taskDetailsPerticipation = taskDetailsPerticipation;
    }

    public int getTaskDetailsImageResource() {
        return taskDetailsImageResource;
    }

    public void setTaskDetailsImageResource(int taskDetailsImageResource) {
        this.taskDetailsImageResource = taskDetailsImageResource;
    }

    public String getTaskDetailsName() {
        return taskDetailsName;
    }

    public void setTaskDetailsName(String taskDetailsName) {
        this.taskDetailsName = taskDetailsName;
    }

    public String getTaskDetailsRole() {
        return taskDetailsRole;
    }

    public void setTaskDetailsRole(String taskDetailsRole) {
        this.taskDetailsRole = taskDetailsRole;
    }

    public String getTaskDetailsPerticipation() {
        return taskDetailsPerticipation;
    }

    public void setTaskDetailsPerticipation(String taskDetailsPerticipation) {
        this.taskDetailsPerticipation = taskDetailsPerticipation;
    }
}

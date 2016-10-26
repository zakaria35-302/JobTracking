package bd.edu.httpdaffodilvarsity.jobtrack.taskManagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import bd.edu.httpdaffodilvarsity.jobtrack.R;
import bd.edu.httpdaffodilvarsity.jobtrack.superior.SuperiorClass;

/**
 * Created by mahmud on 10/26/16.
 */
public class TaskManagementAdapter extends ArrayAdapter {

    private List list = new ArrayList();
    public TaskManagementAdapter(Context context, int resource) {
        super(context, resource);
    }


    public void add(TaskManagementClass object) {

        list.add(object);
        super.add(object);
    }

    private class ViewHolder{
        TextView employeeTaskTittle;
        TextView employeeTaskOwner;
        TextView employeeTaskGivenDate;
        TextView employeeTaskDepartment;
        TextView employeeTaskEstDate;
        TextView employeeTaskStatus;
        TextView employeeTaskProgress;
        TextView employeeTaskPriority;

    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row;
        row = convertView;
        ViewHolder holder;

        if (convertView==null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.task_list_employee, parent, false);

            //convertView = inflater.inflate(R.layout.row_superior_setting_view,null);
            holder = new ViewHolder();
            holder.employeeTaskTittle = (TextView) row.findViewById(R.id.text_view_task_title);
            holder.employeeTaskOwner = (TextView) row.findViewById(R.id.text_view_task_owner);
            holder.employeeTaskGivenDate = (TextView) row.findViewById(R.id.text_view_task_department);
            holder.employeeTaskDepartment = (TextView) row.findViewById(R.id.text_task_given_date);
            holder.employeeTaskEstDate = (TextView) row.findViewById(R.id.text_task_est_date);
            holder.employeeTaskStatus = (TextView) row.findViewById(R.id.text_view_task_status);
            holder.employeeTaskProgress = (TextView) row.findViewById(R.id.text_task_progress);
            holder.employeeTaskPriority = (TextView) row.findViewById(R.id.text_task_priority);
            row.setTag(holder);

        }else  {
            holder = (ViewHolder) row.getTag();
            /*SuperiorClass SC = (SuperiorClass) getItem(position);
            holder.imgSuperior.setImageResource(SC.getImage_resource());*/

        }

        //HashMap<String, String> map = list.get(position);
        TaskManagementClass SC = (TaskManagementClass) getItem(position);
        holder.employeeTaskTittle.setText(SC.getEmployeeTaskTittle());
        holder.employeeTaskOwner.setText(SC.getEmployeeTaskOwner());
        holder.employeeTaskGivenDate.setText(SC.getEmployeeTaskGivenDate());
        holder.employeeTaskDepartment.setText(SC.getEmployeeTaskDepartment());
        holder.employeeTaskEstDate.setText(SC.getEmployeeTaskEstDate());
        holder.employeeTaskStatus.setText(SC.getEmployeeTaskStatus());
        holder.employeeTaskProgress.setText(SC.getEmployeeTaskProgress());
        holder.employeeTaskPriority.setText(SC.getEmployeeTaskPriority());
        return row;

        //return super.getView(position, convertView, parent);
    }
}

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
 * Created by mahmud on 10/27/16.
 */
public class ListViewMostUsedTasKDetailsAdapter extends ArrayAdapter {

    private List list = new ArrayList();

    public ListViewMostUsedTasKDetailsAdapter(Context context, int resource) {
        super(context, resource);
    }
    public void add(ListViewMostUsedTasKDetailsClass object) {

        list.add(object);
        super.add(object);
    }
    private class ViewHolder{
        TextView employeeMostUsedTaskDetailName;
        TextView employeeMostUsedTaskDetailTittle;
        TextView employeeMostUsedTaskDetailCommentCreateTime;
        TextView employeeMostUsedTaskDetailComment;
        TextView employeeMostUsedTaskDetailCommentAttachment;

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
            row = inflater.inflate(R.layout.row_most_used_task_details_view, parent, false);

            //convertView = inflater.inflate(R.layout.row_superior_setting_view,null);
            holder = new ViewHolder();

            holder.employeeMostUsedTaskDetailName = (TextView) row.findViewById(R.id.text_view_most_used_task_detail_name);
            holder.employeeMostUsedTaskDetailTittle = (TextView) row.findViewById(R.id.text_view_most_used_task_title);
            holder.employeeMostUsedTaskDetailCommentCreateTime = (TextView) row.findViewById(R.id.text_view_most_used_task_detail_create_time);
            holder.employeeMostUsedTaskDetailComment = (TextView) row.findViewById(R.id.text_view_most_used_task_comment);
            holder.employeeMostUsedTaskDetailCommentAttachment = (TextView) row.findViewById(R.id.text_view_most_used_task_attachment);
            row.setTag(holder);

        }else  {
            holder = (ViewHolder) row.getTag();
            /*SuperiorClass SC = (SuperiorClass) getItem(position);
            holder.imgSuperior.setImageResource(SC.getImage_resource());*/

        }

        //HashMap<String, String> map = list.get(position);
        ListViewMostUsedTasKDetailsClass SC = (ListViewMostUsedTasKDetailsClass) getItem(position);

        holder.employeeMostUsedTaskDetailName.setText(SC.getEmployeeMostUsedTaskDetailName());
        holder.employeeMostUsedTaskDetailTittle.setText(SC.getEmployeeMostUsedTaskDetailTittle());
        holder.employeeMostUsedTaskDetailCommentCreateTime.setText(SC.getEmployeeMostUsedTaskDetailCommentCreateTime());
        holder.employeeMostUsedTaskDetailComment.setText(SC.getEmployeeMostUsedTaskDetailComment());
        holder.employeeMostUsedTaskDetailCommentAttachment.setText(SC.getEmployeeMostUsedTaskDetailCommentAttachment());
        return row;

        //return super.getView(position, convertView, parent);
    }

}

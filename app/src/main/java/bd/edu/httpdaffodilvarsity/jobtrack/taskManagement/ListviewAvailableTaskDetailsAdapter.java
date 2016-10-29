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

/**
 * Created by mahmud on 10/27/16.
 */
    public class ListviewAvailableTaskDetailsAdapter extends ArrayAdapter{

    private List list = new ArrayList();

    public ListviewAvailableTaskDetailsAdapter(Context context, int resource) {
        super(context, resource);
    }


    public void add(ListviewAvailableTaskDetailsClass object) {

        list.add(object);
        super.add(object);
    }

    private class ViewHolder{
        ImageView taskDetailsImageResource;
        TextView taskDetailsName;
        TextView taskDetailsRole;
        TextView taskDetailsPerticipation;

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
            row = inflater.inflate(R.layout.row_available_task_details_view, parent, false);

            //convertView = inflater.inflate(R.layout.row_superior_setting_view,null);
            holder = new ViewHolder();
            holder.taskDetailsImageResource = (ImageView) row.findViewById(R.id.imageViewAvailableTask);
            holder.taskDetailsName = (TextView) row.findViewById(R.id.textViewAvailableTaskName);
            holder.taskDetailsRole = (TextView) row.findViewById(R.id.textViewAvailableTaskRole);
            holder.taskDetailsPerticipation = (TextView) row.findViewById(R.id.textViewAvailableTaskParticipation);

            row.setTag(holder);

        }else  {
            holder = (ViewHolder) row.getTag();
            /*SuperiorClass SC = (SuperiorClass) getItem(position);
            holder.imgSuperior.setImageResource(SC.getImage_resource());*/

        }

        //HashMap<String, String> map = list.get(position);
        ListviewAvailableTaskDetailsClass SC = (ListviewAvailableTaskDetailsClass) getItem(position);
        holder.taskDetailsImageResource.setImageResource(SC.getTaskDetailsImageResource());
        holder.taskDetailsName.setText(SC.getTaskDetailsName());
        holder.taskDetailsRole.setText(SC.getTaskDetailsRole());
        holder.taskDetailsPerticipation.setText(SC.getTaskDetailsPerticipation());

        return row;

        //return super.getView(position, convertView, parent);
    }
}

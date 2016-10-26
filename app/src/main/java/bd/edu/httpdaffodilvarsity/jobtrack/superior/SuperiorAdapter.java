package bd.edu.httpdaffodilvarsity.jobtrack.superior;

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
 * Created by mahmud on 10/26/16.
 */
public class SuperiorAdapter extends ArrayAdapter {

    private List list = new ArrayList();
    public SuperiorAdapter(Context context, int resource) {
        super(context, resource);
    }


    public void add(SuperiorClass object) {

        list.add(object);
        super.add(object);
    }

    private class ViewHolder{
        ImageView imgSuperior;
        TextView setSuperior;
        TextView superiorName;
        TextView superiorId;
        TextView superiorDesignation;
        TextView superiorDepartment;
        TextView setSubordinator;

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
            row = inflater.inflate(R.layout.row_superior_setting_view, parent, false);

            //convertView = inflater.inflate(R.layout.row_superior_setting_view,null);
            holder = new ViewHolder();
            holder.imgSuperior = (ImageView) row.findViewById(R.id.seperiorImage);
            holder.setSuperior = (TextView) row.findViewById(R.id.textViewSetSuperior);
            holder.superiorName = (TextView) row.findViewById(R.id.textViewSuperiorName);
            holder.superiorId = (TextView) row.findViewById(R.id.textViewSuperiorID);
            holder.superiorDesignation = (TextView) row.findViewById(R.id.textViewDesignation);
            holder.superiorDepartment = (TextView) row.findViewById(R.id.textViewDepartment);
            holder.setSubordinator = (TextView) row.findViewById(R.id.textViewSubordinate);
            row.setTag(holder);

        }else  {
            holder = (ViewHolder) row.getTag();
            /*SuperiorClass SC = (SuperiorClass) getItem(position);
            holder.imgSuperior.setImageResource(SC.getImage_resource());*/

        }

        //HashMap<String, String> map = list.get(position);
        SuperiorClass SC = (SuperiorClass) getItem(position);
        holder.imgSuperior.setImageResource(SC.getImage_resource());
        holder.setSuperior.setText(SC.getSuperior_set());
        holder.superiorName.setText(SC.getSuperior_name());
        holder.superiorId.setText(SC.getSuperior_id());
        holder.superiorDesignation.setText(SC.getSuperior_designation());
        holder.superiorDepartment.setText(SC.getSuperior_department());
        holder.setSubordinator.setText(SC.getSet_subordinate());
        return row;

        //return super.getView(position, convertView, parent);
    }
}

package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import bd.edu.httpdaffodilvarsity.jobtrack.R;
import bd.edu.httpdaffodilvarsity.jobtrack.superior.SuperiorAdapter;
import bd.edu.httpdaffodilvarsity.jobtrack.superior.SuperiorClass;

public class SuperiorSettingActivity extends Activity {

    public ArrayList<HashMap<String, String>> list;

    int[] image_resource = {R.drawable.avatar, R.drawable.apple_ex, R.drawable.igfdq,R.drawable.img1, R.drawable.mario};
    String[] superior_name = {"Saiful Islam", "Imran Nazir", "Abdur Rahman Rahman","Mahbub al islam", "Abul Hossain"};
    String[] superior_set = {"Set Superior", "Set Superior", "Set Superior","Set Superior", "Set Superior"};
    String[] superior_id = {"6564458", "5654987", "7888254","5455555", "4785545"};
    String[] superior_department = {"it", "swe", "English","cse", "EEE"};
    String[] superior_designation = {"Director", "Deputy Director", "Senior Assistant Director","Assistant Director", "Officer"};
    String[] set_subordinate = {"Set Subordinator", "Set Subordinator", "Set Subordinator","Set Subordinator", "Set Subordinator"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_superior_setting);

        ListView list_view = (ListView) findViewById(R.id.listViewSeperiorSetting);
        SuperiorAdapter adapter = new SuperiorAdapter(getApplicationContext(),R.layout.row_superior_setting_view);

        int i = 0;
        for (String Name : superior_name){
            SuperiorClass obj  = new SuperiorClass(image_resource[i],superior_name[i], superior_set[i],
                    superior_id[i],superior_department[i],superior_designation[i],set_subordinate[i]);
            adapter.add(obj);
            i++;
        }

        // populateList();

        //ListViewAdapter adapter = new ListViewAdapter(this,list);
        list_view.setAdapter(adapter);

    }



/*extends AppCompatActivity {

    private static ListView list_view_superior_setting;


    private static String[] NAMES = new String[]{"Mahmud","Hasan", "Jafar", "Akas","Manus","Abul", "Limin"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superior_setting);

        *//*RecipeAdapter adapter = new RecipeAdapter(this, recipeList);
        list_view_superior_setting.setAdapter(adapter);*//*

        list_view_superior_setting = (ListView) findViewById(R.id.listViewSeperiorSetting);
// 1
        //final ArrayList<EmployeeList> employeeList = EmployeeList.getEmployee("superior.json", this);
// 2
       // String[] listItems = new String[employeeList.size()];
// 3
       *//* for(int i = 0; i < employeeList.size(); i++){
            EmployeeList employee = employeeList.get(i);
            listItems[i] = employee.name;
        }*//*
// 4
        //list_view = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.row_superior_setting_view);
        list_view_superior_setting.setAdapter(adapter);
        list_view_superior_setting.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) list_view_superior_setting.getItemAtPosition(position);
                Toast.makeText(SuperiorSettingActivity.this, "Position : " + position + " Values : " + value, Toast.LENGTH_LONG).show();
            }
        });

        *//*ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, NAMES);
        list_view_superior_setting.setAdapter(adapter);*//*


        //listView();

    }

    *//*public void listView(){
        list_view_superior_setting = (ListView) findViewById(R.id.listViewSeperiorSetting);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.row_superior_setting_view);
        list_view_superior_setting.setAdapter(adapter);;*//*
        *//*list_view_superior_setting.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) list_view_superior_setting.getItemAtPosition(position);
                Toast.makeText(SuperiorSettingActivity.this, "Position : " + position + " Values : " + value, Toast.LENGTH_LONG).show();
            }
        });*//*

   // }

    *//*public class EmployeeSuperiorAdapter extends ArrayAdapter<EmployeeList> {
        public EmployeeSuperiorAdapter(Context context, ArrayList<EmployeeList> emplistSuperior) {
            super(context, 0, emplistSuperior);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            EmployeeList empList = getItem(position);
            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_superior_setting_view, parent, false);
            }
            // Lookup view for data population
            TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
            TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);
            // Populate the data into the template view using the data object
            tvName.setText();
            tvHome.setText(empList.hometown);
            // Return the completed view to render on screen
            return convertView;
        }
    }*//*

    *//*public class EmployeeAdapter extends BaseAdapter {


        private Context mContext;
        private LayoutInflater mInflater;
        private ArrayList<EmployeeList> mDataSource;

        public EmployeeAdapter(Context context, ArrayList<EmployeeList> items) {
            mContext = context;
            mDataSource = items;
            mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        //1
        @Override
        public int getCount() {
            return mDataSource.size();
        }

        //2
        @Override
        public Object getItem(int position) {
            return mDataSource.get(position);
        }

        //3
        @Override
        public long getItemId(int position) {
            return position;
        }

        //4
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Get view for row item
            View rowView = mInflater.inflate(R.layout.row_superior_setting_view, parent, false);



            // Get title element
            TextView superiorId =
                    (TextView) rowView.findViewById(R.id.textViewID);

// Get subtitle element
            TextView superiorName =
                    (TextView) rowView.findViewById(R.id.textViewName);

// Get detail element
            TextView superiorDesignation =
                    (TextView) rowView.findViewById(R.id.textViewDesignation);

            TextView superiorDepartment =
                    (TextView) rowView.findViewById(R.id.textViewDepartment);

// Get thumbnail element
            ImageView superiorImageView =
                    (ImageView) rowView.findViewById(R.id.seperiorImage);


            // 1
            EmployeeList employeeList = (EmployeeList) getItem(position);

// 2
            superiorId.setText(employeeList.id);
            superiorName.setText(employeeList.name);
            superiorDesignation.setText(employeeList.Department);
            superiorDepartment.setText(employeeList.Designation);

// 3
            Picasso.with(mContext).load(employeeList.).placeholder(R.mipmap.ic_launcher).into(superiorImageView);

            return rowView;
        }
    }*/

}

package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

import bd.edu.httpdaffodilvarsity.jobtrack.R;
import bd.edu.httpdaffodilvarsity.jobtrack.taskManagement.TaskManagementAdapter;
import bd.edu.httpdaffodilvarsity.jobtrack.taskManagement.TaskManagementClass;

public class TaskManagement extends Activity {

    public ArrayList<HashMap<String, String>> list;

    private static String[] EMPLOYEE_JOB_TITTLE = new String[]{"eCure Android Apps","Job Tracking System in Android " +
            "Platform", "Hospital Management", "Student Portal","School Management system","Attendance System"};
    private static String[] EMPLOYEE_TASK_TITTLE = new String[]{"eCure Android Apps","Job Tracking System in Android " +
            "Platform", "Hospital Management", "Student Portal","School Management system","Attendance System"};
    private static String[] EMPLOYEE_TASK_OWNER = new String[]{"Mahmud Hasan","Abdul Gaffar", "Abu Jafar", "Akas Khan",
            "Anabil karim","Abul Rashed", "Limin Islam"};
    private static String[] EMPLOYEE_TASK_DEPARTMENT = new String[]{"IT","Software", "Computer science",
            "Software Engieering","EEE","IS", "Islamic Studies"};
    private static String[] EMPLOYEE_TASK_GIVEN_DATE = new String[]{"10/10/2015","10/10/2015", "10/10/2015",
            "10/10/2015","10/10/2015","10/10/2015", "10/10/2015"};
    private static String[] EMPLOYEE_TASK_EST_DATE = new String[]{"10/10/2016","10/10/2016", "10/10/2016",
            "10/10/2016","10/10/2016","10/10/2016", "10/10/2016"};
    private static String[] EMPLOYEE_TASK_STATUS = new String[]{"Ongoing","Ongoing", "Completed", "Ongoing","Ongoing",
            "Ongoing", "Ongoing"};
    private static String[] EMPLOYEE_TASK_PROGRESS = new String[]{"50","10", "58", "2","30","80", "47"};
    private static String[] EMPLOYEE_TASK_PRIORITY = new String[]{"High","Very High", "Very High", "Very High","High",
            "Very High", "High"};

    /*int[] image_resource = {R.drawable.avatar, R.drawable.apple_ex, R.drawable.igfdq,R.drawable.img1, R.drawable.mario};
    String[] superior_name = {"Set Superior", "Set Superior", "Set Superior","Set Superior", "Set Superior"};
    String[] superior_set = {"Sabur Khan", "Imran Hossain", "Sabbir Rahman","Mahbub al islam", "Akter Hossain"};
    String[] superior_id = {"6564458", "5654987", "7888254","5455555", "4785545"};
    String[] superior_department = {"it", "swe", "English","cse", "EEE"};
    String[] superior_designation = {"Director", "Deputy", "Senior Assistant","Assistant", "Officer"};
    String[] set_subordinate = {"Set Subordinator", "Set Subordinator", "Set Subordinator","Set Subordinator", "Set Subordinator"};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_management);

        FloatingActionButton buttonCreateTask = (FloatingActionButton) findViewById(R.id.fab);
        buttonCreateTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TaskManagement.this, CreateEmployeeTask.class);
                startActivity(intent);
            }
        });

        ListView list_view_task_management = (ListView) findViewById(R.id.listEmployeeTask);
        TaskManagementAdapter adapter = new TaskManagementAdapter(getApplicationContext(),R.layout.row_employee_task_list);

        int i = 0;
        for (String EMPLOYEETASKTITTILE : EMPLOYEE_TASK_TITTLE){

            /*ArrayAdapter<String> adapter_employee_task_tittle,adapter_employee_task_owner,adapter_employee_task_department,
                    adapter_employee_task_given_date,adapter_employee_task_est_date,adapter_employee_task_status,adapter_employee_task_priority;
            ArrayAdapter<Integer>adapter_employee_task_progress;*/

            TaskManagementClass obj  = new TaskManagementClass(EMPLOYEE_JOB_TITTLE[i],EMPLOYEE_TASK_TITTLE[i],EMPLOYEE_TASK_OWNER[i],
                    EMPLOYEE_TASK_DEPARTMENT[i], EMPLOYEE_TASK_GIVEN_DATE[i],EMPLOYEE_TASK_EST_DATE[i],
                    EMPLOYEE_TASK_STATUS[i],EMPLOYEE_TASK_PROGRESS[i],EMPLOYEE_TASK_PRIORITY[i]);
            adapter.add(obj);
            i++;
        }

        // populateList();

        //ListViewAdapter adapter = new ListViewAdapter(this,list);
        list_view_task_management.setAdapter(adapter);

    }

    /*FloatingActionButton buttonCreateTask;
    private static ListView list_employee_task;
    TextView textViewTaskTitle,textViewTaskOwner, textViewTaskDepartment, textViewTaskGivenDate, textViewTaskEstDate,
            textViewTaskStatus, textViewTaskProgress, textViewTaskPriority;

    ArrayAdapter<String> adapter_employee_task_tittle,adapter_employee_task_owner,adapter_employee_task_department,
            adapter_employee_task_given_date,adapter_employee_task_est_date,adapter_employee_task_status,adapter_employee_task_priority;
    ArrayAdapter<Integer>adapter_employee_task_progress;

    private static String[] EMPLOYEE_TASK_TITTLE = new String[]{"eCure Android Apps","Job Tracking System in Android " +
            "Platform", "Hospital Management", "Student Portal","School Management system","Attendance System"};
    private static String[] EMPLOYEE_TASK_OWNER = new String[]{"Mahmud Hasan","Abdul Gaffar", "Abu Jafar", "Akas Khan",
            "Anabil karim","Abul Rashed", "Limin Islam"};
    private static String[] EMPLOYEE_TASK_DEPARTMENT = new String[]{"IT","Software", "Computer science",
            "Software Engieering","EEE","IS", "Islamic Studies"};
    private static String[] EMPLOYEE_TASK_GIVEN_DATE = new String[]{"10/10/2015","10/10/2015", "10/10/2015",
            "10/10/2015","10/10/2015","10/10/2015", "10/10/2015"};
    private static String[] EMPLOYEE_TASK_EST_DATE = new String[]{"10/10/2016","10/10/2016", "10/10/2016",
            "10/10/2016","10/10/2016","10/10/2016", "10/10/2016"};
    private static String[] EMPLOYEE_TASK_STATUS = new String[]{"Ongoing","Ongoing", "Completed", "Ongoing","Ongoing",
            "Ongoing", "Ongoing"};
    private static Integer[] EMPLOYEE_TASK_PROGRESS = new Integer[]{50,10, 58, 2,30,80, 47};
    private static String[] EMPLOYEE_TASK_PRIORITY = new String[]{"High","Very High", "Very High", "Very High","High",
            "Very High", "High"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_management);

        list_employee_task = (ListView) findViewById(R.id.listEmployeeTask);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, EMPLOYEE_TASK_TITTLE);
        list_employee_task.setAdapter(adapter);

        buttonCreateTask = (FloatingActionButton) findViewById(R.id.fab);
        buttonCreateTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TaskManagement.this, CreateEmployeeTask.class);
                startActivity(intent);
            }
        });
        textViewTaskTitle = (TextView) findViewById(R.id.text_view_task_title);
       *//* textViewTaskTitle.setText("Title : ");*//*

        textViewTaskOwner = (TextView) findViewById(R.id.text_view_task_owner);
        textViewTaskDepartment = (TextView) findViewById(R.id.text_view_task_department);
        textViewTaskGivenDate = (TextView) findViewById(R.id.text_view_task_given_date);
        textViewTaskEstDate = (TextView) findViewById(R.id.text_view_task_est_date);
        textViewTaskStatus = (TextView) findViewById(R.id.text_view_task_status);
        textViewTaskProgress = (TextView) findViewById(R.id.text_view_task_progress);
        textViewTaskPriority = (TextView) findViewById(R.id.text_view_task_priority);
        //listView();
    }

    public void showTaskManagementActivity(View View){
        Intent intent = new Intent(TaskManagement.this, CreateEmployeeTask.class);
        startActivity(intent);
    }
    public void listView(){
        list_employee_task = (ListView) findViewById(R.id.listEmployeeTask);
        adapter_employee_task_tittle = new ArrayAdapter<String>(this,R.layout.row_employee_task_list,
                R.id.text_view_task_title, EMPLOYEE_TASK_TITTLE);
        list_employee_task.setAdapter(adapter_employee_task_tittle);

        list_employee_task = (ListView) findViewById(R.id.listEmployeeTask);
        adapter_employee_task_owner = new ArrayAdapter<String>(this,R.layout.row_employee_task_list,
                R.id.text_view_task_owner, EMPLOYEE_TASK_OWNER);
        list_employee_task.setAdapter(adapter_employee_task_owner);

        list_employee_task = (ListView) findViewById(R.id.listEmployeeTask);
        adapter_employee_task_department = new ArrayAdapter<String>(this,R.layout.row_employee_task_list,
                R.id.text_view_task_department, EMPLOYEE_TASK_DEPARTMENT);
        list_employee_task.setAdapter(adapter_employee_task_department);

        list_employee_task = (ListView) findViewById(R.id.listEmployeeTask);
        adapter_employee_task_given_date = new ArrayAdapter<String>(this,R.layout.row_employee_task_list,
                R.id.text_view_task_given_date, EMPLOYEE_TASK_GIVEN_DATE);
        list_employee_task.setAdapter(adapter_employee_task_given_date);

        list_employee_task = (ListView) findViewById(R.id.listEmployeeTask);
        adapter_employee_task_est_date = new ArrayAdapter<String>(this,R.layout.row_employee_task_list,
                R.id.text_view_task_est_date, EMPLOYEE_TASK_EST_DATE);
        list_employee_task.setAdapter(adapter_employee_task_est_date);

        list_employee_task = (ListView) findViewById(R.id.listEmployeeTask);
        adapter_employee_task_status = new ArrayAdapter<String>(this,R.layout.row_employee_task_list,
                R.id.text_view_task_status, EMPLOYEE_TASK_STATUS);
        list_employee_task.setAdapter(adapter_employee_task_status);

        list_employee_task = (ListView) findViewById(R.id.listEmployeeTask);
        adapter_employee_task_progress = new ArrayAdapter<Integer>(this,R.layout.row_employee_task_list,
                R.id.text_view_task_progress,EMPLOYEE_TASK_PROGRESS);
        list_employee_task.setAdapter(adapter_employee_task_progress);

        list_employee_task = (ListView) findViewById(R.id.listEmployeeTask);
        adapter_employee_task_priority = new ArrayAdapter<String>(this,R.layout.row_employee_task_list,
                R.id.text_view_task_priority, EMPLOYEE_TASK_PRIORITY);
        list_employee_task.setAdapter(adapter_employee_task_priority);
        //listAdapter = new ArrayAdapter<Task>(this, R.layout.list_item, R.id.TEXT_VIEW_ID, items)

        *//*list_employee_task.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) list_employee_task.getItemAtPosition(position);
                Toast.makeText(TaskManagement.this, "Position : " + position + " Values : " + value, Toast.LENGTH_SHORT).show();
            }
        });*//*

    }*/

}

package bd.edu.httpdaffodilvarsity.jobtrack.JobManagement;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import bd.edu.httpdaffodilvarsity.jobtrack.R;
import bd.edu.httpdaffodilvarsity.jobtrack.ui.login.CreateEmployeeJob;

public class JobManagement extends Activity {

    FloatingActionButton buttonCreateJob;
    private static ListView list_employee_job;
    TextView textViewJobTitle,textViewJobOwner, textViewJobDepartment, textViewJobGivenDate, textViewJobEstDate,
            textViewJobStatus, textViewJobProgress, textViewJobPriority;

    ArrayAdapter<String> adapter_employee_Job_tittle,adapter_employee_Job_owner,adapter_employee_Job_department,
            adapter_employee_Job_given_date,adapter_employee_Job_est_date,adapter_employee_Job_status,adapter_employee_Job_priority;
    ArrayAdapter<Integer>adapter_employee_Job_progress;

    private static String[] EMPLOYEE_Job_TITTLE = new String[]{"eCure Android Apps","Job Tracking System in Android " +
            "Platform", "Hospital Management", "Student Portal","School Management system","Attendance System"};
    private static String[] EMPLOYEE_Job_OWNER = new String[]{"Mahmud Hasan","Abdul Gaffar", "Abu Jafar", "Akas Khan",
            "Anabil karim","Abul Rashed", "Limin Islam"};
    private static String[] EMPLOYEE_Job_DEPARTMENT = new String[]{"IT","Software", "Computer science",
            "Software Engieering","EEE","IS", "Islamic Studies"};
    private static String[] EMPLOYEE_Job_GIVEN_DATE = new String[]{"10/10/2015","10/10/2015", "10/10/2015",
            "10/10/2015","10/10/2015","10/10/2015", "10/10/2015"};
    private static String[] EMPLOYEE_Job_EST_DATE = new String[]{"10/10/2016","10/10/2016", "10/10/2016",
            "10/10/2016","10/10/2016","10/10/2016", "10/10/2016"};
    private static String[] EMPLOYEE_Job_STATUS = new String[]{"Ongoing","Ongoing", "Completed", "Ongoing","Ongoing",
            "Ongoing", "Ongoing"};
    private static Integer[] EMPLOYEE_Job_PROGRESS = new Integer[]{50,10, 58, 2,30,80, 47};
    private static String[] EMPLOYEE_Job_PRIORITY = new String[]{"High","Very High", "Very High", "Very High","High",
            "Very High", "High"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_management);

        buttonCreateJob = (FloatingActionButton) findViewById(R.id.fabJob);
        buttonCreateJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JobManagement.this, CreateEmployeeJob.class);
                startActivity(intent);
            }
        });
        textViewJobTitle = (TextView) findViewById(R.id.text_view_job_title);
       /* textViewJobTitle.setText("Title : ");*/

        textViewJobOwner = (TextView) findViewById(R.id.text_view_Job_owner);
        textViewJobDepartment = (TextView) findViewById(R.id.text_view_Job_department);
        textViewJobGivenDate = (TextView) findViewById(R.id.text_view_Job_given_date);
        textViewJobEstDate = (TextView) findViewById(R.id.text_view_Job_est_date);
        textViewJobStatus = (TextView) findViewById(R.id.text_view_Job_status);
        textViewJobProgress = (TextView) findViewById(R.id.text_view_Job_progress);
        textViewJobPriority = (TextView) findViewById(R.id.text_view_Job_priority);
        listView();
    }

    public void showJobManagementActivity(View View){
        Intent intent = new Intent(JobManagement.this, CreateEmployeeJob.class);
        startActivity(intent);
    }
    public void listView(){
        list_employee_job = (ListView) findViewById(R.id.listEmployeeJob);
        adapter_employee_Job_tittle = new ArrayAdapter<String>(this,R.layout.Task_list_employee,
                R.id.text_view_Job_title, EMPLOYEE_Job_TITTLE);
        list_employee_job.setAdapter(adapter_employee_Job_tittle);

        list_employee_job = (ListView) findViewById(R.id.listEmployeeJob);
        adapter_employee_Job_owner = new ArrayAdapter<String>(this,R.layout.Task_list_employee,
                R.id.text_view_Job_owner, EMPLOYEE_Job_OWNER);
        list_employee_job.setAdapter(adapter_employee_Job_owner);

        list_employee_job = (ListView) findViewById(R.id.listEmployeeJob);
        adapter_employee_Job_department = new ArrayAdapter<String>(this,R.layout.Task_list_employee,
                R.id.text_view_Job_department, EMPLOYEE_Job_DEPARTMENT);
        list_employee_job.setAdapter(adapter_employee_Job_department);

        list_employee_job = (ListView) findViewById(R.id.listEmployeeJob);
        adapter_employee_Job_given_date = new ArrayAdapter<String>(this,R.layout.Task_list_employee,
                R.id.text_view_Job_given_date, EMPLOYEE_Job_GIVEN_DATE);
        list_employee_job.setAdapter(adapter_employee_Job_given_date);

        list_employee_job = (ListView) findViewById(R.id.listEmployeeJob);
        adapter_employee_Job_est_date = new ArrayAdapter<String>(this,R.layout.Task_list_employee,
                R.id.text_view_Job_est_date, EMPLOYEE_Job_EST_DATE);
        list_employee_job.setAdapter(adapter_employee_Job_est_date);

        list_employee_job = (ListView) findViewById(R.id.listEmployeeJob);
        adapter_employee_Job_status = new ArrayAdapter<String>(this,R.layout.Task_list_employee,
                R.id.text_view_Job_status, EMPLOYEE_Job_STATUS);
        list_employee_job.setAdapter(adapter_employee_Job_status);

        list_employee_job = (ListView) findViewById(R.id.listEmployeeJob);
        adapter_employee_Job_progress = new ArrayAdapter<Integer>(this,R.layout.Task_list_employee,
                R.id.text_view_Job_progress,EMPLOYEE_Job_PROGRESS);
        list_employee_job.setAdapter(adapter_employee_Job_progress);

        list_employee_job = (ListView) findViewById(R.id.listEmployeeJob);
        adapter_employee_Job_priority = new ArrayAdapter<String>(this,R.layout.Task_list_employee,
                R.id.text_view_Job_priority, EMPLOYEE_Job_PRIORITY);
        list_employee_job.setAdapter(adapter_employee_Job_priority);
        //listAdapter = new ArrayAdapter<Job>(this, R.layout.list_item, R.id.TEXT_VIEW_ID, items)

        list_employee_job.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) list_employee_job.getItemAtPosition(position);
                Toast.makeText(JobManagement.this, "Position : " + position + " Values : " + value, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

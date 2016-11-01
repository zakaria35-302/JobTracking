package bd.edu.httpdaffodilvarsity.jobtrack.JobManagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class JobManagement extends Activity {

    public ArrayList<HashMap<String, String>> list;

    private static String[] EMPLOYEE_JOB_TITTLE = new String[]{"eCure Android Apps","Job Tracking System in Android " +
            "Platform", "Hospital Management", "Student Portal","School Management system","Attendance System"};
    private static String[] EMPLOYEE_JOB_OWNER = new String[]{"Mahmud Hasan","Abdul Gaffar", "Abu Jafar", "Akas Khan",
            "Anabil karim","Abul Hosen", "Limin Islam"};
    private static String[] EMPLOYEE_JOB_DEPARTMENT = new String[]{"IT","Software", "Computer science",
            "Software Engieering","EEE","IS", "Islamic Studies"};
    private static String[] EMPLOYEE_JOB_GIVEN_DATE = new String[]{"10/10/2015","10/10/2015", "10/10/2015",
            "10/10/2015","10/10/2015","10/10/2015", "10/10/2015"};
    private static String[] EMPLOYEE_JOB_EST_DATE = new String[]{"10/10/2016","10/10/2016", "10/10/2016",
            "10/10/2016","10/10/2016","10/10/2016", "10/10/2016"};
    private static String[] EMPLOYEE_JOB_STATUS = new String[]{"Ongoing","Ongoing", "Completed", "Ongoing","Ongoing",
            "Ongoing", "Ongoing"};
    private static String[] EMPLOYEE_JOB_PROGRESS = new String[]{"50","10", "58", "2","30","80", "47"};
    private static String[] EMPLOYEE_JOB_PRIORITY = new String[]{"High","Very High", "Very High", "Very High","High",
            "Very High", "High"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_management);

        FloatingActionButton buttonCreateJob = (FloatingActionButton) findViewById(R.id.fabJob);
        buttonCreateJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JobManagement.this, CreateEmployeeJob.class);
                startActivity(intent);
            }
        });

        ListView list_view_job_management = (ListView) findViewById(R.id.listEmployeeJob);
        JobManagementAdapter adapter = new JobManagementAdapter(getApplicationContext(), R.layout.row_employee_job_list);

        int i = 0;
        for (String EMPLOYEEJOBTITTILE : EMPLOYEE_JOB_TITTLE) {

            /*ArrayAdapter<String> adapter_employee_task_tittle,adapter_employee_task_owner,adapter_employee_task_department,
                    adapter_employee_task_given_date,adapter_employee_task_est_date,adapter_employee_task_status,adapter_employee_task_priority;
            ArrayAdapter<Integer>adapter_employee_task_progress;*/

            JobManagementClass obj = new JobManagementClass(EMPLOYEE_JOB_TITTLE[i], EMPLOYEE_JOB_OWNER[i],
                    EMPLOYEE_JOB_DEPARTMENT[i], EMPLOYEE_JOB_GIVEN_DATE[i], EMPLOYEE_JOB_EST_DATE[i],
                    EMPLOYEE_JOB_STATUS[i], EMPLOYEE_JOB_PROGRESS[i], EMPLOYEE_JOB_PRIORITY[i]);
            adapter.add(obj);
            i++;
        }

        // populateList();

        //ListViewAdapter adapter = new ListViewAdapter(this,list);
        list_view_job_management.setAdapter(adapter);

    }
}

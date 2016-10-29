package bd.edu.httpdaffodilvarsity.jobtrack.taskManagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

import bd.edu.httpdaffodilvarsity.jobtrack.JobManagement.JobManagementAdapter;
import bd.edu.httpdaffodilvarsity.jobtrack.JobManagement.JobManagementClass;
import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class MostUsedTask extends AppCompatActivity {

    public ArrayList<HashMap<String, String>> list;
    private static ListView list_view_most_used_task;

    private static String[] EMPLOYEE_JOB_TITTLE = new String[]{"eCure Android Apps","Job Tracking System in Android " +
            "Platform", "Hospital Management", "Student Portal","School Management system","Attendance System"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most__used__task);
        listView();
    }

    public void listView(){
        list_view_most_used_task = (ListView) findViewById(R.id.listViewMostUsedTask);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.row_most_used_task_list,EMPLOYEE_JOB_TITTLE);
        list_view_most_used_task.setAdapter(adapter);
        list_view_most_used_task.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MostUsedTask.this, MostUsedTaskDetailsList.class);
                startActivity(intent);

            }
        });
    }

}

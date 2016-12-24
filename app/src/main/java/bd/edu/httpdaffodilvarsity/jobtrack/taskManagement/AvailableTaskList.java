package bd.edu.httpdaffodilvarsity.jobtrack.taskManagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class AvailableTaskList extends Activity {

    private static ListView list_view_available_task;
    private static String[] EMPLOYEE_JOB_TITTLE = new String[]{"eCure Android Apps","Job Tracking System in Android " +
            "Platform", "Hospital Management", "Student Portal","School Management system","Attendance System"};

    //private static String[] NAMES = new String[]{"Mahmud","Hasan", "Jafar", "Akas","Manus","Abul", "Limin"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_task);
        listView();
    }

    public void listView(){
        list_view_available_task = (ListView) findViewById(R.id.listViewAvailableTask);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.row_available_task_list,EMPLOYEE_JOB_TITTLE);
        list_view_available_task.setAdapter(adapter);;
        list_view_available_task.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(AvailableTaskList.this, AvailableTaskDetails.class);
                startActivity(intent);

            }
        });

    }
}

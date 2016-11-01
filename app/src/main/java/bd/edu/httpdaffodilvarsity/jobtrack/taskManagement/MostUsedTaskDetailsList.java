package bd.edu.httpdaffodilvarsity.jobtrack.taskManagement;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

import bd.edu.httpdaffodilvarsity.jobtrack.R;
import bd.edu.httpdaffodilvarsity.jobtrack.superior.SuperiorAdapter;
import bd.edu.httpdaffodilvarsity.jobtrack.superior.SuperiorClass;

public class MostUsedTaskDetailsList extends AppCompatActivity  {

    FloatingActionButton mFloatingButton;

    public ArrayList<HashMap<String, String>> list;

    private static String[] EMPLOYEE_MOST_USED_COMMENT_CREATOR = {"Saiful Islam", "Imran Nazir", "Abdur Rahman","Mahbub al islam", "Abul Hossain"};
    private static String[] EMPLOYEE_MOST_USED_TASK_TITTLE = new String[]{"eCure Android Apps","Job Tracking System in Android " +
            "Platform", "Hospital Management", "Student Portal","School Management system","Attendance System"};
    private static String[] EMPLOYEE_MOST_USED_COMMENT_CREATE_TIME = {"10:30", "10:30", "10:30","10:30", "10:30"};
    private static String[] EMPLOYEE_MOST_USED_COMMENT = {"Add List adapter and multiple value in a JobManagement list view",
            "Add List adapter and multiple value in a list view", "Add List adapter and multiple value in a list view",
            "Add List adapter and multiple value in a list view", "Add List adapter and multiple value in a list view"};
    private static String[] EMPLOYEE_MOST_USED_COMMENT_ATTACHMENT_FILE = {"Screenshotfrom2016-10-27 15-19-32.png",
            "Screenshotfrom2016-10-27 15-19-32.png", "Screenshotfrom2016-10-27 15-19-32.png","Screenshotfrom2016-10-27 15-19-32.png",
            "Screenshotfrom2016-10-27 15-19-32.png"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_used_task_details_list);

        ListView list_employee_most_used_task = (ListView) findViewById(R.id.listEmployeeMostUsedTask);
        ListViewMostUsedTasKDetailsAdapter adapter = new ListViewMostUsedTasKDetailsAdapter(getApplicationContext(),
                R.layout.row_most_used_task_details_view);

        int i = 0;
        for (String Name : EMPLOYEE_MOST_USED_COMMENT_CREATOR){
            ListViewMostUsedTasKDetailsClass obj  = new ListViewMostUsedTasKDetailsClass(EMPLOYEE_MOST_USED_COMMENT_CREATOR[i],EMPLOYEE_MOST_USED_TASK_TITTLE[i],
                    EMPLOYEE_MOST_USED_COMMENT_CREATE_TIME[i],EMPLOYEE_MOST_USED_COMMENT[i],EMPLOYEE_MOST_USED_COMMENT_ATTACHMENT_FILE[i]);
            adapter.add(obj);
            i++;
        }

        // populateList();

        //ListViewAdapter adapter = new ListViewAdapter(this,list);
        list_employee_most_used_task.setAdapter(adapter);

        mFloatingButton=(FloatingActionButton)findViewById(R.id.compose);

        mFloatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog=new Dialog(MostUsedTaskDetailsList.this);
                dialog.setTitle("Compose Comment");
                dialog.setContentView(R.layout.dialog_compose_comment);
                dialog.show();
            }

        });

    }

}
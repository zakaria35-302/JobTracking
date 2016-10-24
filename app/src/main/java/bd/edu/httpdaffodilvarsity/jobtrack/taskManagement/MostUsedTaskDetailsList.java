package bd.edu.httpdaffodilvarsity.jobtrack.taskManagement;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class MostUsedTaskDetailsList extends AppCompatActivity  {

    FloatingActionButton mFloatingButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_used_task_details_list);

        mFloatingButton=(FloatingActionButton)findViewById(R.id.compose);

        mFloatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog=new Dialog(MostUsedTaskDetailsList.this);
                dialog.setTitle("Compose Comment");
                dialog.setContentView(R.layout.activity_most_used_task_details_list);
                dialog.show();
            }

        });

    }

}
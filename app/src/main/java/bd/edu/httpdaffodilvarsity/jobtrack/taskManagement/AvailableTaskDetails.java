package bd.edu.httpdaffodilvarsity.jobtrack.taskManagement;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import bd.edu.httpdaffodilvarsity.jobtrack.R;


public class AvailableTaskDetails extends AppCompatActivity {
    public   Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available__task_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // initialize the Floating button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        // set Click listener
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // creating custom Floating Action button
                CustomDialog();
            }
        });
    }

    //
    public void CustomDialog(){

        dialog = new Dialog(AvailableTaskDetails.this);
        // it remove the dialog title
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        // set the laytout in the dialog
        dialog.setContentView(R.layout.dialogbox_available_task_details);
        // set the background partial transparent
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        Window window = dialog.getWindow();
        WindowManager.LayoutParams param = window.getAttributes();
        // set the layout at right bottom
        param.gravity = Gravity.BOTTOM | Gravity.RIGHT;
        // it dismiss the dialog when click outside the dialog frame
        dialog.setCanceledOnTouchOutside(true);
        // initialize the item of the dialog box, whose id is demo1
        View demodialog =(View) dialog.findViewById(R.id.cross);
        // it call when click on the item whose id is demo1.
        demodialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // diss miss the dialog
                dialog.dismiss();
            }
        });

        // it show the dialog box
        dialog.show();

    }

    public void btnJoinTask(View view) {
        Intent intent=new Intent(this,JoinTask.class);
        startActivity(intent);

    }


    public void btnAttribute(View view) {
        Intent intent=new Intent(this,AvailableTaskAttributes.class);
        startActivity(intent);
    }

}



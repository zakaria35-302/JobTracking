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
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

import bd.edu.httpdaffodilvarsity.jobtrack.R;
import bd.edu.httpdaffodilvarsity.jobtrack.superior.SuperiorAdapter;
import bd.edu.httpdaffodilvarsity.jobtrack.superior.SuperiorClass;


public class AvailableTaskDetails extends AppCompatActivity {
    public   Dialog dialog;
    ListView list_view_available_task_details;

    public ArrayList<HashMap<String, String>> list;

    int[] available_task_image_resource = {R.drawable.avatar, R.drawable.apple_ex, R.drawable.igfdq,R.drawable.img1, R.drawable.mario};
    String[] available_task_name = {"Sabur Khan", "Imran Hossain", "Sabbir Rahman","Mahbub al islam", "Akter Hossain"};
    String[] available_task_role = {"Member", "Incharge", "Owner","Member", "Incharge"};
    String[] available_task_perticipation = {"20%", "25%", "2%","50%", "45%"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available__task_details);

        list_view_available_task_details = (ListView) findViewById(R.id.listviewAvailableTaskDetails);
        ListviewAvailableTaskDetailsAdapter adapter = new ListviewAvailableTaskDetailsAdapter(getApplicationContext(),R.layout.row_available_task_details_view);

        int i = 0;
        for (String Name : available_task_name){
            ListviewAvailableTaskDetailsClass obj  = new ListviewAvailableTaskDetailsClass(available_task_image_resource[i],available_task_name[i],
                    available_task_role[i], available_task_perticipation[i]);
            adapter.add(obj);
            i++;
        }

        // populateList();

        //ListViewAdapter adapter = new ListViewAdapter(this,list);
        list_view_available_task_details.setAdapter(adapter);

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



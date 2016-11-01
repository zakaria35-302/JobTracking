package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import bd.edu.httpdaffodilvarsity.jobtrack.JobManagement.CreateEmployeeJob;
import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class SetDesignation extends Activity {
//public class SetDesignation extends DialogFragment {

    private static ListView list_view_designation;
    private static String[] DESIGNATION = new String[]{"Director","Deputy Director ", "Senior Assistant Director",
            "Assistant Director","Senior Officer","Officer", "Assistant Officer"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designation);

        FloatingActionButton designationFloatingButton=(FloatingActionButton)findViewById(R.id.fabSetDesignation);

        designationFloatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog=new Dialog(SetDesignation.this);
                dialog.setTitle("Compose Comment");
                dialog.setContentView(R.layout.create_designation_dialog);
                dialog.show();
            }

        });


        /*FloatingActionButton buttonCreateJob = (FloatingActionButton) findViewById(R.id.fabJob);
        buttonCreateJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetDesignation.this, CreteDe.class);
                startActivity(intent);
            }
        });*/

        list_view_designation = (ListView) findViewById(R.id.listEmployeeDesignation);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, DESIGNATION);
        list_view_designation.setAdapter(adapter);

        //listView();
    }

}

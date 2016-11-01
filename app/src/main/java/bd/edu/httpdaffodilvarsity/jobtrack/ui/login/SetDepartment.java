package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
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
import bd.edu.httpdaffodilvarsity.jobtrack.MainActivity;
import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class SetDepartment extends Activity {
//public class SetDepartment extends DialogFragment {

    private static ListView list_view_department;
    private static String[] DEPARTMENTS = new String[]{"Computer Science and Engineering","Information Technology",
            "Software Engineering", "English","Low","EEE", "Natural Science"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_department);

        FloatingActionButton departmentFloatingButton=(FloatingActionButton)findViewById(R.id.fabSetDepartment);

        departmentFloatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog=new Dialog(SetDepartment.this);
                dialog.setTitle("Compose Comment");
                dialog.setContentView(R.layout.create_department_dialog);
                dialog.show();
            }

        });

        list_view_department = (ListView) findViewById(R.id.listEmployeeDepartment);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, DEPARTMENTS);
        list_view_department.setAdapter(adapter);


        /*FloatingActionButton buttonCreateJob = (FloatingActionButton) findViewById(R.id.fabJob);
        buttonCreateJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetDepartment.this, CreateEmployeeJob.class);
                startActivity(intent);
            }
        });*/

        //listView();
    }

    /*public void listView(){
        list_view_department = (ListView) findViewById(R.id.listEmployeeDepartment);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.row_department,DEPARTMENTS);
        list_view_department.setAdapter(adapter);;
        list_view_department.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) list_view_department.getItemAtPosition(position);
                Toast.makeText(SetDepartment.this, "Position : " + position + " Values : " + value, Toast.LENGTH_LONG).show();
            }
        });

    }*/

    /*@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.create_department_dialog, null))
                // Add action buttons
                .setPositiveButton(R.string.positive_button_create, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                    }
                })
                .setNegativeButton(R.string.position_button_cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        SetDepartment.this.getDialog().cancel();
                    }
                });
        return builder.create();
    }*/
}

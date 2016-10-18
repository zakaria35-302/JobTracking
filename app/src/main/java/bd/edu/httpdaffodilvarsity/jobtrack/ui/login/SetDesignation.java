package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        list_view_designation = (ListView) findViewById(R.id.listEmployeeDesignation);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, DESIGNATION);
        list_view_designation.setAdapter(adapter);

        //listView();
    }


    /*public void listView(){
        list_view_designation = (ListView) findViewById(R.id.listEmployeeDesignation);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.row_designation,DESIGNATION);
        list_view_designation.setAdapter(adapter);;
        list_view_designation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) list_view_designation.getItemAtPosition(position);
                Toast.makeText(SetDesignation.this, "Position : " + position + " Values : " + value, Toast.LENGTH_LONG).show();
            }
        });

    }*/
   // public void addEmployeeDegignation(View view) {
        /* Create an instance of the dialog fragment and show it */
        /*DialogFragment dialog = AddListDialogFragment.newInstance();
        dialog.show(SetDesignation.this.getFragmentManager(), "AddListDialogFragment");*/
   // }

    /*@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.create_designation_dialog, null))
                // Add action buttons
                .setPositiveButton(R.string.positive_button_create, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                    }
                })
                .setNegativeButton(R.string.position_button_cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        SetDesignation.this.getDialog().cancel();
                    }
                });
        return builder.create();
    }*/

}

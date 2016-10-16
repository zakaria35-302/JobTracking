package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;

import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class SetDesignation extends DialogFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_designation);
    }

   // public void addEmployeeDegignation(View view) {
        /* Create an instance of the dialog fragment and show it */
        /*DialogFragment dialog = AddListDialogFragment.newInstance();
        dialog.show(SetDesignation.this.getFragmentManager(), "AddListDialogFragment");*/
   // }

    @Override
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
    }

}

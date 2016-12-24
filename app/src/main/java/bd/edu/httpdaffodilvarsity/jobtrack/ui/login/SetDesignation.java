package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;


import android.app.Dialog;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

import bd.edu.httpdaffodilvarsity.jobtrack.Database.DatabaseManager;
import bd.edu.httpdaffodilvarsity.jobtrack.R;
import bd.edu.httpdaffodilvarsity.jobtrack.model.DesignationInfo;
import bd.edu.httpdaffodilvarsity.jobtrack.service.ServiceHandler;

public class SetDesignation extends ListActivity {
//public class SetDesignation extends DialogFragment {

  /* private static ListView list_view_designation;
    private static String[] DESIGNATION = new String[]{"Director","Deputy Director ", "Senior Assistant Director",
            "Assistant Director","Senior Officer","Officer", "Assistant Officer"};
*/

    private ProgressDialog pDialog;

    // URL to get contacts JSON
    private static String url = "http://192.168.10.124:8080/designationinfo";

    // JSON Node names
    private static final String TAG_DESIG_ID = "desig_id";
    private static final String TAG_DESIGNATION = "designation";
    private static final String TAG_VIEW_ORDER = "view_order";
    private static final String TAG_CREATED_BY = "created_by";
    private static final String TAG_CREATED_TIME = "created_time";
    private static final String TAG_MODIFIED_BY = "modified_by";
    private static final String TAG_MODIFIIED_TIME = "modified_time";


    //JSONArray designation = null;

    // Hashmap for ListView
    ArrayList<HashMap<String, String>> designationList;


    EditText designationEditText;
    ListView listEmployeeDesignation;
    Button btnDesignationOk;
    DatabaseManager manager;
    // model class
    DesignationInfo designationInfo ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designation);


        //designationEditText = (EditText) findViewById(R.id.employee_designationEt);
        //btnDesignationOk = (Button) findViewById(R.id.btnDesignationOk);
        //listEmployeeDesignation=(ListView)findViewById(R.id.listEmployeeDesignation);
        FloatingActionButton designationFloatingButton = (FloatingActionButton) findViewById(R.id.fabSetDesignation);

        designationFloatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(SetDesignation.this);
                dialog.setTitle("Add New Designation");
                dialog.setContentView(R.layout.create_designation_dialog);
                dialog.show();
            }


        });

        designationList=new ArrayList<HashMap<String, String>>();
        new GetDesignations().execute();

    }



    public class GetDesignations extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Showing progress dialog
            pDialog = new ProgressDialog(SetDesignation.this);
            pDialog.setMessage("Please wait...");
            pDialog.setCancelable(false);
            pDialog.show();
        }


        @Override
        protected Void doInBackground(Void... arg0) {
            // Creating service handler class instance
            ServiceHandler sh = new ServiceHandler();

            // Making a request to url and getting response
            String jsonStr = sh.makeServiceCall(url, ServiceHandler.GET);

            Log.d("Response: ", "> " + jsonStr);

            if (jsonStr != null) {
                try {
                    JSONArray jsonArray = new JSONArray(jsonStr);

                    // Getting JSON Array node
                    //contacts = jsonObj.getJSONArray(TAG_CONTACTS);

                    // looping through All Contacts
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject c = jsonArray.getJSONObject(i);

                        String id = c.getString(TAG_DESIG_ID);
                        String designation_name = c.getString(TAG_DESIGNATION);
                        String view_order = c.getString(TAG_VIEW_ORDER);
                        String created_by = c.getString(TAG_CREATED_BY);
                        String created_time = c.getString(TAG_CREATED_TIME);
                        String modified_by = c.getString(TAG_MODIFIED_BY);
                        String modified_time = c.getString(TAG_MODIFIIED_TIME);


                        // tmp hashmap for single contact
                        HashMap<String, String> designation = new HashMap<String, String>();

                        // adding each child node to HashMap key => value
                        designation.put(TAG_DESIG_ID, id);
                        designation.put(TAG_DESIGNATION, designation_name);
                        designation.put(TAG_VIEW_ORDER, view_order);
                        designation.put(TAG_CREATED_BY, created_by);
                        designation.put(TAG_CREATED_TIME, created_time);
                        designation.put(TAG_MODIFIED_BY, modified_by);
                        designation.put(TAG_MODIFIIED_TIME, modified_time);
                        //contact.put(TAG_PHONE_MOBILE, mobile);

                        // adding contact to contact list
                        designationList.add(designation);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                Log.e("ServiceHandler", "Couldn't get any data from the url");
            }

            return null;
        }


        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            // Dismiss the progress dialog
            if (pDialog.isShowing())
                pDialog.dismiss();
            /**
             * Updating parsed JSON data into ListView
             * */

            ListAdapter adapter = new SimpleAdapter(SetDesignation.this, designationList,
                    R.layout.row_designation, new String[]{TAG_DESIG_ID,TAG_DESIGNATION, TAG_VIEW_ORDER, TAG_CREATED_BY, TAG_CREATED_TIME,TAG_MODIFIED_BY,TAG_MODIFIIED_TIME},
                    new int[]{R.id.textViewRowDesignationId, R.id.textViewRowDesignatioName, R.id.textViewRowDesignationRowView, R.id.textViewRowDesignationCreatedBy, R.id.textViewRowDesignationCreatedTime, R.id.textViewRowDesignationModifyBy, R.id.textViewRowDesignationModifyTime});

            setListAdapter(adapter);

        }

        /*FloatingActionButton buttonCreateJob = (FloatingActionButton) findViewById(R.id.fabJob);
        buttonCreateJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetDesignation.this, CreteDe.class);
                startActivity(intent);
            }
        });*/

      /*  list_view_designation = (ListView) findViewById(R.id.listEmployeeDesignation);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, DESIGNATION);
        list_view_designation.setAdapter(adapter);
*/
        //listView();
    }

}

/*public class SetDesignation extends Activity {
//public class SetDesignation extends DialogFragment {

    DatabaseHelper myDB;
    EditText employeeDesignationId,employeeDesignation, employeeDesignationViewOrder, employeeDesignationCreatedBy, employeeDesignationUpdateBy;
    Button btnOk,btncancel;

    private static ListView list_view_designation;
    private static String[] DESIGNATION = new String[]{"Director","Deputy Director ", "Senior Assistant Director",
            "Assistant Director","Senior Officer","Officer", "Assistant Officer"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designation);

        //employeeDesignationId = (EditText) findViewById(R.id.employee_designation_id);
        employeeDesignation = (EditText)findViewById(R.id.employee_designation);
        //employeeDesignationViewOrder  = (EditText) findViewById(R.id.employee_view_opder);
        //employeeDesignationCreatedBy = (EditText) findViewById(R.id.employee_created_by);
        //employeeDesignationUpdateBy = (EditText) findViewById(R.id.employee_update_by);



        *//*editSurName = (EditText)findViewById(R.id.editText2);
        editMarks = (EditText)findViewById(R.id.editText3);
        editId = (EditText)findViewById(R.id.editText4);*//*
        btnOk = (Button)findViewById(R.id.okCompose);

        *//*btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDB.insertHRMDesignation( employeeDesignation.getText().toString());
               *//**//* boolean isInserted = myDB.insertHRMDesignation(employeeDesignationId.getText().toString(),
                        employeeDesignation.getText().toString(), employeeDesignationViewOrder.getText().toString(),
                        employeeDesignationCreatedBy.getText().toString(), employeeDesignationUpdateBy.getText().toString());*//**//*
                if (isInserted == true)
                    Toast.makeText(SetDesignation.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(SetDesignation.this, "Data is not Inserted", Toast.LENGTH_SHORT).show();
            }
        });*//*
        btncancel = (Button)findViewById(R.id.cancelCompose);
        *//*btnUpdate = (Button)findViewById(R.id.button_update);
        btnDelete = (Button)findViewById(R.id.button_delete);*//*


        FloatingActionButton designationFloatingButton=(FloatingActionButton)findViewById(R.id.fabSetDesignation);

        designationFloatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog=new Dialog(SetDesignation.this);
                dialog.setTitle("Add New Designation");
                dialog.setContentView(R.layout.create_designation_dialog);
                dialog.show();
            }
        });

        //addDesignation();
        //cancelDesignation();

        *//*FloatingActionButton buttonCreateJob = (FloatingActionButton) findViewById(R.id.fabJob);
        buttonCreateJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetDesignation.this, CreteDe.class);
                startActivity(intent);
            }
        });*//*

        list_view_designation = (ListView) findViewById(R.id.listEmployeeDesignation);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, DESIGNATION);
        list_view_designation.setAdapter(adapter);

        //listView();
    }


    public void addDesignation(View v) {
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDB.insertHRMDesignation( employeeDesignation.getText().toString());
                if (isInserted == true)
                    Toast.makeText(SetDesignation.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(SetDesignation.this, "Data is not Inserted", Toast.LENGTH_SHORT).show();
            }
        });
    }

    *//*public void cancelDesignation() {
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //boolean isInserted = myDB.insertHRMDesignation(employeeDesignation.getText().toString());

            }
        });
    }*//*
}*/

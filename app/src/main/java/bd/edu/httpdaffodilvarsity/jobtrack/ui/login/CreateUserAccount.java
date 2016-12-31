package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import bd.edu.httpdaffodilvarsity.jobtrack.Database.DatabaseHelper;
import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class CreateUserAccount extends Activity {

    DatabaseHelper myDB;

    EditText editTextEmployeeId;
    EditText editTextEmployeenameCreate;
    EditText editTextEmailCreate;
    //Spinner spinnerEmployeeGender;
    //Spinner spinnerEmployeeInstitute;
    Spinner spinnerEmployeeDepartment;
    Button btnCreateEmployeeAccount;
    ArrayAdapter<CharSequence> empGenderAdapter,empInstituteAdapter,empDepartmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user_account);

        myDB = new  DatabaseHelper(this);

        editTextEmployeeId = (EditText) findViewById(R.id.edit_text_employee_id);
        editTextEmployeenameCreate = (EditText) findViewById(R.id.edit_text_employeename_create);
        editTextEmailCreate = (EditText) findViewById(R.id.edit_text_email_create);
        spinnerEmployeeDepartment = (Spinner) findViewById(R.id.spinner_employee_department) ;
        btnCreateEmployeeAccount = (Button) findViewById(R.id.btn_create_employee_account);

        /*spinnerEmployeeGender = (Spinner) findViewById(R.id.spinner_employee_gender);
        spinnerEmployeeInstitute = (Spinner) findViewById(R.id.spinner_employee_institute);
        spinnerEmployeeDepartment = (Spinner) findViewById(R.id.spinner_employee_department);

        // Create an ArrayAdapter using the string array and a default spinner layout
        empGenderAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_gender, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empGenderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       // Apply the adapter to the spinner
        spinnerEmployeeGender.setAdapter(empGenderAdapter);

        empInstituteAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_institute, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empInstituteAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeInstitute.setAdapter(empInstituteAdapter);*/

        empDepartmentAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_department, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empDepartmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeDepartment.setAdapter(empDepartmentAdapter);

        addEmployeeAccount();
    }

    public void addEmployeeAccount(){
        btnCreateEmployeeAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDB.insertHRMPersonInfo(editTextEmployeeId.getText().toString(),
                        editTextEmployeenameCreate.getText().toString(), editTextEmailCreate.getText().toString(),
                        spinnerEmployeeDepartment.getSelectedItem().toString());
                if (isInserted == true)
                    Toast.makeText(CreateUserAccount.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(CreateUserAccount.this, "Data is not Inserted", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public  void  GoToLoginActivity(View v){
        Intent in = new Intent(CreateUserAccount.this, LoginActivity.class);
        startActivity(in);
    }

    public  void  GoToEditUser(View v){
        Intent in = new Intent(CreateUserAccount.this, EditEmployeeAccount.class);
        startActivity(in);
    }

    public  void  GoToTaskManagement(View v){
        Intent in = new Intent(CreateUserAccount.this, TaskManagement.class);
        startActivity(in);
    }

/*
    public boolean insertHRMEmployeeInfo(int id, String employee_id, String emp_name, int designation_id,
                                         String current_dept_id, int current_branch, String reports_to,
                                         String active, String created_by, Date created_time, String modified_by,
                                         Date modified_time, int user_group_id, String password, String authenticate_code,
                                         String current_status, Date status_update_time){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_ID,id);
        contentValues.put(COL_EMPLOYEE_ID,employee_id);
        contentValues.put(COL_EMP_NAME, emp_name);
        contentValues.put(COL_DEPARTMENT_ID,designation_id);
        contentValues.put(COL_CURRENT_DEPT_ID,current_dept_id);
        contentValues.put(COL_CURRENT_BRANCH, current_branch);
        contentValues.put(COL_REPORTS_TO,reports_to);
        contentValues.put(COL_ACTIVE,active);
        contentValues.put(COL_CREATED_BY, created_by);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        contentValues.put("created_time", dateFormat.format(created_time));
        contentValues.put(COL_DESIG_MODIFIED_BY,modified_by);
        contentValues.put("modified_time", dateFormat.format(modified_time));
        contentValues.put(COL_USER_GROUP_ID,user_group_id);
        contentValues.put(COL_PASSWORD,password);
        contentValues.put(COL_AUTHENTICATE_CODE, authenticate_code);
        contentValues.put(COL_CURRENT_STATUS,current_status);
        contentValues.put("status_update_time", dateFormat.format(status_update_time));

        long result = db.insert(TABLE_HRM_EMPLOYEE,null,contentValues);
        if(result ==-1)
            return false;
        else
            return true;

    }*/


}

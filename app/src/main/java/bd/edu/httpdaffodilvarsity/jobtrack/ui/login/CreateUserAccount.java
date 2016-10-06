package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class CreateUserAccount extends Activity {

    Spinner spinnerEmployeeGender;
    Spinner spinnerEmployeeInstitute;
    Spinner spinnerEmployeeDepartment;
    ArrayAdapter<CharSequence> empGenderAdapter,empInstituteAdapter,empDepartmentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user_account);

        spinnerEmployeeGender = (Spinner) findViewById(R.id.spinner_employee_gender);
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
        spinnerEmployeeInstitute.setAdapter(empInstituteAdapter);

        empDepartmentAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_department, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empDepartmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeDepartment.setAdapter(empDepartmentAdapter);

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

}

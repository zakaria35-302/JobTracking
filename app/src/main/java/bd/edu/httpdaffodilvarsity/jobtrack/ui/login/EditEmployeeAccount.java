package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class EditEmployeeAccount extends Activity {

    Spinner spinnerEmployeeGender;
    Spinner spinnerEmployeeInstitute;
    Spinner spinnerEmployeeDepartment;
    Spinner spinnerEmployeeMaritalStatus;
    Spinner spinnerEmployeeBloodGroup;
    Spinner spinnerEmployeeReligion;

    ArrayAdapter<CharSequence> empGenderAdapter,empInstituteAdapter,
            empDepartmentAdapter, empMaritelStatusAdapter,empBloodGroupAdapter,empReligionAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_employee_account);
        spinnerEmployeeGender = (Spinner) findViewById(R.id.spinner_employee_gender_edit);
        spinnerEmployeeInstitute = (Spinner) findViewById(R.id.spinner_employee_institute_edit);
        spinnerEmployeeDepartment = (Spinner) findViewById(R.id.spinner_employee_department_edit);
        spinnerEmployeeMaritalStatus = (Spinner) findViewById(R.id.spinner_employee_marital_status_edit);
        spinnerEmployeeBloodGroup = (Spinner) findViewById(R.id.spinner_employee_blood_group_edit);
        spinnerEmployeeReligion = (Spinner) findViewById(R.id.spinner_employee_religion_edit);

        // Create an ArrayAdapter using the string array and a default spinner layout
        empGenderAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_gender, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empGenderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeGender.setAdapter(empGenderAdapter);
        spinnerEmployeeGender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getBaseContext(), adapterView.getItemAtPosition(i) + " Selected ", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


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

        empMaritelStatusAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_marital_status, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empMaritelStatusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeMaritalStatus.setAdapter(empMaritelStatusAdapter);


        empBloodGroupAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_blood_group, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empBloodGroupAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeBloodGroup.setAdapter(empBloodGroupAdapter);

        empReligionAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_religion, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empReligionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeReligion.setAdapter(empReligionAdapter);


    }
}

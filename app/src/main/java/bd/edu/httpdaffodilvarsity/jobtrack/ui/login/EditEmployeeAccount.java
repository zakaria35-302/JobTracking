package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class EditEmployeeAccount extends Activity {

    Spinner spinnerEmployeeGender;
    Spinner spinnerEmployeeInstitute;
    Spinner spinnerEmployeeDepartment;
    Spinner spinnerEmployeeMaritalStatus;
    Spinner spinnerEmployeeBloodGroup;
    Spinner spinnerEmployeeReligion;

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
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.employee_gender, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeGender.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.employee_institute, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeInstitute.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.employee_department, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeDepartment.setAdapter(adapter3);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.employee_marital_status, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeMaritalStatus.setAdapter(adapter4);


        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.employee_blood_group, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeBloodGroup.setAdapter(adapter5);

        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,
                R.array.employee_religion, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeReligion.setAdapter(adapter6);


    }
}

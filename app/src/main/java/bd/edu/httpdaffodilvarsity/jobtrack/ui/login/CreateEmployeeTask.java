package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class CreateEmployeeTask extends Activity {

    Spinner spinnerEmployeeTaskAccessibility, spinnerEmployeeTaskProgress, spinnerEmployeeTaskPriority,
            spinnerEmployeeTaskStatus, spinnerEmployeeTaskDepartment, getSpinnerEmployeeTaskRole ;
    ArrayAdapter<CharSequence> empTaskAccessibilityAdapter, empTaskProgressAdapter, empTaskPriorityAdapter,
            empTaskStatusAdapter, empTaskDepartmentAdapter, empTaskRoleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_employee_task);

        spinnerEmployeeTaskAccessibility = (Spinner) findViewById(R.id.spinner_task_Accesibility_create);
        empTaskAccessibilityAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_task_accessability, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empTaskAccessibilityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeTaskAccessibility.setAdapter(empTaskAccessibilityAdapter);

        spinnerEmployeeTaskProgress = (Spinner) findViewById(R.id.spinner_task_progress_create);
        empTaskProgressAdapter = ArrayAdapter.createFromResource(this, R.array.employee_task_progress,
                android.R.layout.simple_spinner_item);
        empTaskProgressAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEmployeeTaskProgress.setAdapter(empTaskProgressAdapter);

        spinnerEmployeeTaskPriority = (Spinner) findViewById(R.id.spinner_task_priority_create);
        empTaskPriorityAdapter = ArrayAdapter.createFromResource(this, R.array.employee_task_priority,
                android.R.layout.simple_spinner_item);
        empTaskPriorityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEmployeeTaskPriority.setAdapter(empTaskPriorityAdapter);

        spinnerEmployeeTaskStatus = (Spinner) findViewById(R.id.spinner_task_status_create);
        empTaskStatusAdapter = ArrayAdapter.createFromResource(this, R.array.employee_task_status,
                android.R.layout.simple_spinner_item);
        empTaskStatusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEmployeeTaskStatus.setAdapter(empTaskStatusAdapter);

        spinnerEmployeeTaskDepartment = (Spinner) findViewById(R.id.spinner_task_department_create);
        empTaskDepartmentAdapter = ArrayAdapter.createFromResource(this, R.array.employee_department,
                android.R.layout.simple_spinner_item);
        empTaskDepartmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEmployeeTaskDepartment.setAdapter(empTaskDepartmentAdapter);

        getSpinnerEmployeeTaskRole = (Spinner) findViewById(R.id.spinner_task_role_create);
        empTaskRoleAdapter = ArrayAdapter.createFromResource(this, R.array.employee_task_role,
                android.R.layout.simple_spinner_item);
        empTaskRoleAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        getSpinnerEmployeeTaskRole.setAdapter(empTaskRoleAdapter);




    }
}

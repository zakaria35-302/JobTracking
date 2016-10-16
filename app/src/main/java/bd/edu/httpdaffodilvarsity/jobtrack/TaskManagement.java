package bd.edu.httpdaffodilvarsity.jobtrack;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class TaskManagement extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_management);
    }

    public static Fragment newInstance() {

        return null;
    }
}

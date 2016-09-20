package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class CreateUserAccount extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user_account);
    }

    public  void  GoToLoginActivity(View v){
        Intent in = new Intent(CreateUserAccount.this, LoginActivity.class);
        startActivity(in);
    }
}

package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import bd.edu.httpdaffodilvarsity.jobtrack.R;
import bd.edu.httpdaffodilvarsity.jobtrack.superior.SuperiorAdapter;
import bd.edu.httpdaffodilvarsity.jobtrack.superior.SuperiorClass;

public class SuperiorSettingActivity extends Activity {

    public ArrayList<HashMap<String, String>> list;

    int[] image_resource = {R.drawable.avatar, R.drawable.apple_ex, R.drawable.igfdq,R.drawable.img1, R.drawable.mario};
    String[] superior_name = {"Saiful Islam", "Imran Nazir", "Abdur Rahman Rahman","Mahbub al islam", "Abul Hossain"};
    String[] superior_set = {"Set Superior", "Set Superior", "Set Superior","Set Superior", "Set Superior"};
    String[] superior_id = {"6564458", "5654987", "7888254","5455555", "4785545"};
    String[] superior_department = {"it", "swe", "English","cse", "EEE"};
    String[] superior_designation = {"Director", "Deputy Director", "Senior Assistant Director","Assistant Director", "Officer"};
    String[] set_subordinate = {"Set Subordinator", "Set Subordinator", "Set Subordinator","Set Subordinator", "Set Subordinator"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_superior_setting);

        ListView list_view = (ListView) findViewById(R.id.listViewSeperiorSetting);
        SuperiorAdapter adapter = new SuperiorAdapter(getApplicationContext(),R.layout.row_superior_setting_view);

        int i = 0;
        for (String Name : superior_name){
            SuperiorClass obj  = new SuperiorClass(image_resource[i],superior_name[i], superior_set[i],
                    superior_id[i],superior_department[i],superior_designation[i],set_subordinate[i]);
            adapter.add(obj);
            i++;
        }

        // populateList();

        //ListViewAdapter adapter = new ListViewAdapter(this,list);
        list_view.setAdapter(adapter);

    }



}

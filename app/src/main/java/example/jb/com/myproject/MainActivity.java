package example.jb.com.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person = new Person("dotan",34);
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("NAME",person.getName());
        intent.putExtra("AGE",person.getAge());

        Bundle bundle = new Bundle();
        bundle.putSerializable("PERSON",person);
        intent.putExtras(bundle);




    }
}

package appre.com.androidobserverpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RepositoryObserver {

    private Subject mUserDataRepository;
    TextView full_name, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        full_name = findViewById(R.id.name);
        age = findViewById(R.id.age);

        mUserDataRepository = UserDataRepository.getInstance();
        mUserDataRepository.registerObserver(this);
    }

    @Override
    public void onUserDataChanged(String fullname, int age) {
        full_name.setText(fullname);
        this.age.setText(String.valueOf(age));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.mUserDataRepository.removeObserver(this);
    }
}

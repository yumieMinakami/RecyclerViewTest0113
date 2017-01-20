package jp.techacademy.yumie.minakami.recyclerviewtest0113;

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements MainFragment.OnListItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
//        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        if(savedInstanceState == null){
            MainFragment fragment = new MainFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.content, fragment)
                    .commit();
        }
    }

    @Override
    public void onListItemClick(int position){
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new RecyclerListFragment();
                break;
            case 1:
//                fragment = new RecyclerGridFragment();
                break;
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content, fragment)
                .addToBackStack(null)
                .commit();
    }
}

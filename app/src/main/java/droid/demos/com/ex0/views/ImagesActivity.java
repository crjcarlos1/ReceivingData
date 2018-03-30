package droid.demos.com.ex0.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import droid.demos.com.ex0.R;
import droid.demos.com.ex0.adapters.AdapterImages;
import droid.demos.com.ex0.models.ImageModel;

public class ImagesActivity extends AppCompatActivity {

    private RecyclerView rv;
    private AdapterImages adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
        rv = (RecyclerView) findViewById(R.id.rv);

        getData();
    }

    private void getData() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            String stringList = bundle.getString("LIST");

            Gson gson = new Gson();
            Type type = new TypeToken<List<ImageModel>>() {
            }.getType();
            List<ImageModel> list2 = gson.fromJson(stringList, type);

            rv.setLayoutManager(new LinearLayoutManager(ImagesActivity.this, LinearLayoutManager.VERTICAL, true));
            adapter = new AdapterImages(list2);
            rv.setAdapter(adapter);

        } else {
            Toast.makeText(this, "error al obtener list de activity", Toast.LENGTH_LONG).show();
        }
    }


}

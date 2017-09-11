package net.kusnadi.android_learn_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeData();

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);
    }


    // This method creates an ArrayList that has three Person objects
    // Checkout the project associated with this tutorial on Github if
    // you want to use the same images.
    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Kusnadi", "23 years old", R.drawable.docker));
        persons.add(new Person("Engkus", "25 years old", R.drawable.docker));
        persons.add(new Person("Kunay", "35 years old", R.drawable.docker));
        persons.add(new Person("Subur", "23 years old", R.drawable.docker));
        persons.add(new Person("Denong", "25 years old", R.drawable.docker));
        persons.add(new Person("Denoy", "35 years old", R.drawable.docker));
        persons.add(new Person("Ryan", "23 years old", R.drawable.docker));
        persons.add(new Person("Rigas", "25 years old", R.drawable.docker));
        persons.add(new Person("Ian", "35 years old", R.drawable.docker));
    }
}

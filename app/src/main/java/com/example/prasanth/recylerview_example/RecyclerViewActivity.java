package com.example.prasanth.recylerview_example;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class RecyclerViewActivity extends Activity
{
    private  ArrayList arrayList;

private final String[] names={

    "PRASHANTH",
        "MAHESH",
        "SHIVA"
};
    private final String[] urls={
            "http://www.presidiacreative.com/wp-content/uploads/2009/10/02-01_azure_eye1-500x200.jpg",
            "http://holoweb.net/~liam/pictures/2007-12-17-pt-petre-trees/img_8175-lonely-tree-in-winter-q100-500x200.jpg",
            "http://www.vocesabia.net/wp-content/uploads/2011/11/111-500x200.jpg"

    };

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view__learning);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        addNames();
        RecycleAdapter recycleAdapter =new RecycleAdapter(this,arrayList);
        recyclerView.setAdapter(recycleAdapter);

    }

    public ArrayList addNames()
    {
        arrayList=new ArrayList();
        for (int i=0;i<names.length;i++)
        {
            Model model=new Model();
            model.setName(names[i]);
            model.setUrl(urls[i]);
            arrayList.add(model);

        }
        return arrayList;
    }

}

package com.example.pairgame;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView curView = null;
    private int countPair = 0;
    final int[] drawable = new int[]{R.drawable.pair1,R.drawable.pair2,R.drawable.pair3,R.drawable.pair4,R.drawable.pair5,R.drawable.pair6};

    int[] pos = {0,1,2,3,4,5,0,1,2,3,4,5,};
    int currentPos = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView)findViewById(R.id.gridView);
        pair Pair = new pair(this);
        gridView.setAdapter(Pair);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(currentPos <0)
                {

                    currentPos = i;
                    curView = (ImageView)view;
                    ((ImageView)view).setImageResource(drawable[pos[i]]);
                }

                else
                {
                    if(currentPos == i)
                    {
                        ((ImageView)view).setImageResource(R.drawable.questionmark);

                    }
                    else if(pos[currentPos] !=pos [i])
                    {
                        curView.setImageResource(R.drawable.questionmark);
                        Toast.makeText(getApplicationContext(), "Not Match!", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        ((ImageView)view).setImageResource(drawable[pos[i]]);
                        countPair++;

                        if(countPair == 0)
                        {
                            Toast.makeText(getApplicationContext(), "You Win!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    currentPos = -1;
                }
            }
        });
    }
}
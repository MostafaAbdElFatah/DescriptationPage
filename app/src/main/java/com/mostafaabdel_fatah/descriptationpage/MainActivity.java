package com.mostafaabdel_fatah.descriptationpage;

import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView sizeText;
    RatingBar ratingBar;
    ImageView yellow1,yellow2,blue1,blue2,red1,red2,green1,green2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**********************************************************/
        sizeText = (TextView) findViewById(R.id.numberSize);
        /*********************ratingbar*****************************/
        ratingBar = (RatingBar) findViewById(R.id.ratingbar);
        LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(getResources().getColor(R.color.endcolor), PorterDuff.Mode.SRC_ATOP);
        /******************************************************************************************/
        //yellow;
        yellow1 = (ImageView) findViewById(R.id.yellow1);
        yellow2 = (ImageView) findViewById(R.id.yellow2);
        yellow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorClick(1);
            }
        });
        // blue
        blue1 = (ImageView) findViewById(R.id.blue1);
        blue2 = (ImageView) findViewById(R.id.blue2);
        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorClick(2);
            }
        });
        //red;
        red1 = (ImageView) findViewById(R.id.red1);
        red2 = (ImageView) findViewById(R.id.red2);
        red2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorClick(3);
            }
        });
        // green
        green1 = (ImageView) findViewById(R.id.green1);
        green2 = (ImageView) findViewById(R.id.green2);
        green2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorClick(4);
            }
        });
    }
    public void ColorClick(int id){
        yellow1.setVisibility(View.GONE);
        blue1.setVisibility(View.GONE);
        red1.setVisibility(View.GONE);
        green1.setVisibility(View.GONE);
        switch (id){
            case 1:
                yellow1.setVisibility(View.VISIBLE);
                break;
            case 2:
                blue1.setVisibility(View.VISIBLE);
                break;
            case 3:
                red1.setVisibility(View.VISIBLE);
                break;
            case 4:
                green1.setVisibility(View.VISIBLE);
                break;
        }
    }
    public void AddtoCardClicked(View view) {
        Toast.makeText(this,"Add to Card Button Clicked",Toast.LENGTH_SHORT).show();
    }
    public void AddtoWishListClicked(View view) {
        Toast.makeText(this,"Add to WishList Button Clicked",Toast.LENGTH_SHORT).show();
    }

    public void ShareImageClicked(View view) {
        Toast.makeText(this,"Share Button Clicked",Toast.LENGTH_SHORT).show();
    }

    public void IncreaseSizeClicked(View view) {
        int x = Integer.parseInt(sizeText.getText().toString());
        sizeText.setText(++x +"");
    }

    public void decreaseSizeClicked(View view) {
        int x = Integer.parseInt(sizeText.getText().toString());
        x = (x>0)? --x:0;
        sizeText.setText(x + "" );
    }
}

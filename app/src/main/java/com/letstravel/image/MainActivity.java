package com.letstravel.image;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private RadioButton img1, img2,img3;
private ImageView imageView;
AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=(RadioButton)findViewById(R.id.img1);
        img2=(RadioButton)findViewById(R.id.img2);
        img3=(RadioButton)findViewById(R.id.img3);


        imageView=(ImageView)findViewById(R.id.imgview);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);

        builder=new AlertDialog.Builder(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img1:
                builder.setMessage("Do you want to display this image?").setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                imageView.setImageResource(R.drawable.image1);
                            }
                        })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog alert =builder.create();
                alert.setTitle("Image");
                alert.show();
                break;

            case R.id.img2:
                builder.setMessage("Do you want to display this image?").setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                imageView.setImageResource(R.drawable.image2);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alert2 =builder.create();
                alert2.setTitle("Image");
                alert2.show();

                break;

            case R.id.img3:
                builder.setMessage("Do you want to display this image?").setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                imageView.setImageResource(R.drawable.image3);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();

                            }
                        });
                AlertDialog alert3 =builder.create();
                alert3.setTitle("Image");
                alert3.show();

                break;

        }

    }
}

package com.givan.tic_tac_toe;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Madness extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button ng;
    int a[]={0,1,2,3,4,5,6,7,8,9};
    int cn[]={0,0,0,0,0,0,0,0,0,0};
    int c=0;
    boolean bool=true;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madness);
        ng=(Button)findViewById(R.id.button);
        ng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Madness.this,Madness.class));
                finish();
            }
        });


        b1=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById(R.id.button4);
        b4=(Button)findViewById(R.id.button5);
        b5=(Button)findViewById(R.id.button6);
        b6=(Button)findViewById(R.id.button7);
        b7=(Button)findViewById(R.id.button8);
        b8=(Button)findViewById(R.id.button9);
        b9=(Button)findViewById(R.id.button10);



        b9.setClickable(false);
        b9.setText("X");
        a[9]=-1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a[1]=-2;
                c++;
                b1.setText("O");
                b1.setClickable(false);
                show();
                if(bool) ct();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a[2]=-2;
                b2.setText("O");
                c++;
                b2.setClickable(false);
                show();
                if(bool) ct();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a[3]=-2;
                b3.setText("O");
                c++;

                b3.setClickable(false);
                show();
                if(bool) ct();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a[4]=-2;
                c++;
                b4.setText("O");
                if(bool) ct();
                b4.setClickable(false);
                show();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setText("O");
                a[5]=-2;
                c++;
                b5.setClickable(false);
                show();
                if(bool) ct();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a[6]=-2;
                b6.setText("O");
                c++;
                b6.setClickable(false);

                show();
                if(bool) ct();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a[7]=-2;
                c++;
                b7.setClickable(false);
                b7.setText("O");
                show();
                if(bool) ct();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a[8]=-2;
                c++;
                b8.setClickable(false);
                b8.setText("O");
                show();
                if(bool) ct();
            }
        });




    }



    public int checkwin(){
        int s=0;
        if(a[1]==a[2]&&a[3]==a[2])
            return 1;
        if(a[4]==a[5]&&a[5]==a[6])
            return 1;
        if(a[7]==a[8]&&a[8]==a[9])
            return 1;
        if(a[1]==a[4]&&a[4]==a[7])
            return 1;
        if(a[2]==a[5]&&a[5]==a[8])
            return 1;
        if(a[3]==a[6]&&a[6]==a[9])
            return 1;
        if(a[1]==a[5]&&a[5]==a[9])
            return 1;
        if(a[3]==a[5]&&a[5]==a[7])
            return 1;
        for(int i=1;i<=9;i++)
            if(a[i]!=i)
                s++;
        if(s==9)
            return 0;
        return -1;
    }
    public void ct(){
        if(c==1)
        {
            if(a[1]==-2||a[7]==-2||a[8]==-2)
            {
                if(a[1]==-2)
                   cn[1]=1;
                if(a[7]==-2) cn[7]=1;
                if(a[8]==-2) cn[8]=1;
                b3.setClickable(false);
                a[3]=-1;
                showc();
                b3.setText("X");
                return;
            }
            else if(a[2]==-2||a[3]==-2||a[4]==-2||a[6]==-2)
            {
                if(a[2]==-2) cn[2]=1;
                if(a[3]==-2) cn[3]=1;
                if(a[4]==-2) cn[4]=1;
                if(a[6]==-2) cn[6]=1;

                b7.setClickable(false);
                a[7]=-1;
                showc();
                b7.setText("X");
                return;
            }
            else if(a[5]==-2)
            {
                cn[5]=1;
                b1.setClickable(false);
                a[1]=-1;
                showc();
                b1.setText("X");
                return;
            }
        }
        else if(c==2)
        {
                if(a[1]==-2&&cn[1]==1)
                {
                    if(a[6]==6)
                    {
                        b6.setClickable(false);
                        a[6]=-1;
                        showc();
                        b6.setText("X");
                        return;
                    }
                    else
                    {
                        cn[6]=2;
                        b7.setClickable(false);
                        a[7]=-1;
                        showc();
                        b7.setText("X");
                        return;
                    }
                }
                else if(a[2]==-2&&cn[2]==1)
                {
                    if(a[8]==8){
                    b8.setClickable(false);
                    a[8]=-1;
                    showc();
                    b8.setText("X");
                    return;}
                    else
                    {
                        cn[8]=2;
                        b5.setClickable(false);
                        a[5]=-1;
                        showc();
                        b5.setText("X");
                        return;
                    }
                }
                else if(a[3]==-2&&cn[3]==1)
                {
                    if(a[8]==8){
                        b8.setClickable(false);
                        a[8]=-1;
                        showc();
                        b8.setText("X");
                        return;}
                    else
                    {
                        cn[8]=2;
                        b1.setClickable(false);
                        a[1]=-1;
                        showc();
                        b1.setText("X");
                        return;
                    }
                }
                else if(a[4]==-2&&cn[4]==1)
                {
                    if(a[8]==8){
                        b8.setClickable(false);
                        a[8]=-1;
                        showc();
                        b8.setText("X");
                        return;}
                    else
                    {
                        cn[8]=2;
                        b3.setClickable(false);
                        a[3]=-1;
                        showc();
                        b3.setText("X");
                        return;
                    }
                }
                else if(a[5]==-2&&cn[5]==1)
                {
                    if(a[2]==-2){
                        cn[2]=2;
                        b8.setClickable(false);
                        a[8]=-1;
                        showc();
                        b8.setText("X");
                        return;}
                    else if(a[3]==-2)
                    {
                        cn[3]=2;
                        b7.setClickable(false);
                        a[7]=-1;
                        showc();
                        b7.setText("X");
                        return;
                    }
                    else if(a[4]==-2)
                    {
                        cn[4]=2;
                        b6.setClickable(false);
                        a[6]=-1;
                        showc();
                        b6.setText("X");
                        return;
                    }
                    else if(a[6]==-2)
                    {
                        cn[6]=2;
                        b4.setClickable(false);
                        a[4]=-1;
                        showc();
                        b4.setText("X");
                        return;
                    }
                    else if(a[7]==-2)
                    {
                        cn[7]=2;
                        b3.setClickable(false);
                        a[3]=-1;
                        showc();
                        b3.setText("X");
                        return;
                    }
                    else if(a[8]==-2)
                    {
                        cn[8]=2;
                        b2.setClickable(false);
                        a[2]=-1;
                        showc();
                        b2.setText("X");
                        return;
                    }
                }
                else if(a[6]==-2&&cn[6]==1)
                {
                    if(a[8]==8){
                        b8.setClickable(false);
                        a[8]=-1;
                        showc();
                        b8.setText("X");
                        return;}
                    else
                    {
                        cn[8]=2;
                        b1.setClickable(false);
                        a[1]=-1;
                        showc();
                        b1.setText("X");
                        return;
                    }
                }
                else if(a[7]==-2&&cn[7]==1)
                {
                    if(a[6]==6){
                        b6.setClickable(false);
                        a[6]=-1;
                        showc();
                        b6.setText("X");
                        return;}
                    else
                    {
                        cn[6]=2;
                        b1.setClickable(false);
                        a[1]=-1;
                        showc();
                        b1.setText("X");
                        return;
                    }
                }
                else if(a[8]==-2&&cn[8]==1)
                {
                    if(a[6]==6){
                        b6.setClickable(false);
                        a[6]=-1;
                        showc();
                        b6.setText("X");
                        return;}
                    else
                    {
                        cn[6]=2;
                        b1.setClickable(false);
                        a[1]=-1;
                        showc();
                        b1.setText("X");
                        return;
                    }
                }

        }
        else if(c==3)
        {
            if(a[1]==-2&&a[6]==-2&&cn[1]==1&&cn[6]==2)
            {
                if(a[5]==-2)
                {
                    b8.setClickable(false);
                    a[8]=-1;
                    showc();
                    b8.setText("X");
                    return;
                }
                else
                {
                    b5.setClickable(false);
                    a[5]=-1;
                    showc();
                    b5.setText("X");
                    return;
                }
            }
            else if(a[2]==-2&&a[8]==-2&&cn[2]==1&&cn[8]==2) {
                if (a[1] == -2) {
                    b3.setClickable(false);
                    a[3] = -1;
                    showc();
                    b3.setText("X");
                    return;
                } else {
                    b1.setClickable(false);
                    a[1] = -1;
                    showc();
                    b1.setText("X");
                    return;
                }
            }
            else if(a[3]==-2&&a[8]==-2&&cn[3]==1&&cn[8]==2)
            {
                if (a[4] == -2) {
                    b5.setClickable(false);
                    a[5] = -1;
                    showc();
                    b5.setText("X");
                    return;
                } else {
                    b4.setClickable(false);
                    a[4] = -1;
                    showc();
                    b4.setText("X");
                    return;
                }
            }
            else if(a[4]==-2&&a[8]==-2&&cn[4]==1&&cn[8]==2)
            {
                if (a[6] == -2) {
                    b5.setClickable(false);
                    a[5] = -1;
                    showc();
                    b5.setText("X");
                    return;
                } else {
                    b6.setClickable(false);
                    a[6] = -1;
                    showc();
                    b6.setText("X");
                    return;
                }
            }
            else if(a[6]==-2&&a[8]==-2&&cn[6]==1&&cn[8]==2)
            {
                if (a[4] == -2) {
                    b5.setClickable(false);
                    a[5] = -1;
                    showc();
                    b5.setText("X");
                    return;
                } else {
                    b4.setClickable(false);
                    a[4] = -1;
                    showc();
                    b4.setText("X");
                    return;
                }
            }
            else if(a[7]==-2&&a[6]==-2&&cn[7]==1&&cn[6]==2)
            {
                if (a[2] == -2) {
                    b5.setClickable(false);
                    a[5] = -1;
                    showc();
                    b5.setText("X");
                    return;
                } else {
                    b2.setClickable(false);
                    a[2] = -1;
                    showc();
                    b2.setText("X");
                    return;
                }
            }
            else if(a[8]==-2&&a[6]==-2&&cn[8]==1&&cn[6]==2)
            {
                if (a[2] == -2) {
                    b5.setClickable(false);
                    a[5] = -1;
                    showc();
                    b5.setText("X");
                    return;
                } else {
                    b2.setClickable(false);
                    a[2] = -1;
                    showc();
                    b2.setText("X");
                    return;
                }
            }
            else if(a[5]==-2&&a[7]==-2&&cn[5]==1&&cn[7]==2)
            {
                if (a[2] == -2) {
                    b6.setClickable(false);
                    a[6] = -1;
                    showc();
                    b6.setText("X");
                    return;
                } else {
                    b2.setClickable(false);
                    a[2] = -1;
                    showc();
                    b2.setText("X");
                    return;
                }
            }
            else if(a[5]==-2&&a[3]==-2&&cn[5]==1&&cn[3]==2)
            {
                if (a[4] == -2) {
                    b8.setClickable(false);
                    a[8] = -1;
                    showc();
                    b8.setText("X");
                    return;
                } else {
                    b4.setClickable(false);
                    a[4] = -1;
                    showc();
                    b4.setText("X");
                    return;
                }
            }
            else if(a[5]==-2&&a[2]==-2&&cn[5]==1&&cn[2]==2)
            {
                if (a[7] == -2) {
                    b3.setClickable(false);
                    a[3] = -1;
                    showc();
                    b3.setText("X");
                    return;
                } else {
                    b7.setClickable(false);
                    a[7] = -1;
                    showc();
                    b7.setText("X");
                    return;
                }
            }
            else if(a[5]==-2&&a[4]==-2&&cn[5]==1&&cn[4]==2)
            {
                if (a[3] == -2) {
                    b7.setClickable(false);
                    a[7] = -1;
                    showc();
                    b7.setText("X");
                    return;
                } else {
                    b3.setClickable(false);
                    a[3] = -1;
                    showc();
                    b3.setText("X");
                    return;
                }
            }
            else if(a[5]==-2&&a[6]==-2&&cn[5]==1&&cn[6]==2)
            {
                if (a[7] == -2) {
                    b3.setClickable(false);
                    a[3] = -1;
                    showc();
                    b3.setText("X");
                    return;
                } else {
                    b7.setClickable(false);
                    a[7] = -1;
                    showc();
                    b7.setText("X");
                    return;
                }
            }
            else if(a[5]==-2&&a[8]==-2&&cn[5]==1&&cn[8]==2) {
                if (a[3] == -2) {
                    b7.setClickable(false);
                    a[7] = -1;
                    showc();
                    b7.setText("X");
                    return;
                } else {
                    b3.setClickable(false);
                    a[3] = -1;
                    showc();
                    b3.setText("X");
                    return;
                }
            }
        }
        else if(c==4)
        {
            if(a[5]==-2&&a[2]==-2&&cn[5]==1&&cn[2]==2&&a[7] == -2)
                {
                    if (a[4]==-2) {
                    b6.setClickable(false);
                    a[6] = -1;
                    showc();
                    b6.setText("X");
                    return;
                }
                else {
                b4.setClickable(false);
                a[4] = -1;
                showc();
                b4.setText("X");
                return;
                }
            }
            else if(a[5]==-2&&a[4]==-2&&cn[5]==1&&cn[4]==2&&a[3]==-2)
                {
                if(a[8] == -2) {
                b2.setClickable(false);
                a[2] = -1;
                showc();
                b2.setText("X");
                return;
                } else {
                b8.setClickable(false);
                a[8] = -1;
                showc();
                b8.setText("X");
                return;
                }
            }
            else if(a[5]==-2&&a[6]==-2&&cn[5]==1&&cn[6]==2&&a[7]==-2)
            {
                if (a[2] == -2) {
                b8.setClickable(false);
                a[8] = -1;
                showc();
                b8.setText("X");
                return;
                } else {
                b2.setClickable(false);
                a[2] = -1;
                showc();
                b2.setText("X");
                return;
                }
            }
            else if(a[5]==-2&&a[8]==-2&&cn[5]==1&&cn[8]==2&&a[3]==-2) {
                if (a[4] == -2) {
                b6.setClickable(false);
                a[6] = -1;
                showc();
                b6.setText("X");
                return;
                } else {
                b4.setClickable(false);
                a[4] = -1;
                showc();
                b4.setText("X");
                return;
            }
        }
        }



    }
    public  void show(){
        if(checkwin()==1){
            //Toast.MakeText(Madness.this,"you win",Toast.LENGTH_SHORT).show();
            bool=false;
             b1.setClickable(false);
            b2.setClickable(false);
            b3.setClickable(false);
            b4.setClickable(false);
            b5.setClickable(false);
            b6.setClickable(false);
            b7.setClickable(false);
            b8.setClickable(false);

            new CountDownTimer(1000, 1000) {

                public void onTick(long millisUntilFinished) {
                }

                public void onFinish() {
                //startActivity(new Intent(Madness.this,yw.class));
                //finish();
                }

            }.start();
            return;
        }
        else if(checkwin()==0){
            b1.setClickable(false);
            b2.setClickable(false);
            b3.setClickable(false);
            b4.setClickable(false);
            b5.setClickable(false);
            b6.setClickable(false);
            b7.setClickable(false);
            b8.setClickable(false);

            //Toast.MakeText(Madness.this,"draw",Toast.LENGTH_SHORT).show();
            bool=false;
            new CountDownTimer(1000, 1000) {

                public void onTick(long millisUntilFinished) {
                }

                public void onFinish() {
                    startActivity(new Intent(Madness.this,md.class));
                    finish();
                }

            }.start();

            return;
        }
        else{
            return;
        }
    }

    public  void showc(){
        if(checkwin()==1){
            //Toast.MakeText(Madness.this,"computer win",Toast.LENGTH_SHORT).show();
            bool=false;
            b1.setClickable(false);
            b2.setClickable(false);
            b3.setClickable(false);
            b4.setClickable(false);
            b5.setClickable(false);
            b6.setClickable(false);
            b7.setClickable(false);
            b8.setClickable(false);
            new CountDownTimer(1000, 1000) {

                public void onTick(long millisUntilFinished) {
                }

                public void onFinish() {
                    startActivity(new Intent(Madness.this,cv.class));
                    finish();
                }

            }.start();

            return;
        }
        else if(checkwin()==0){
            //Toast.MakeText(Madness.this,"draw",Toast.LENGTH_SHORT).show();
            bool=false;
             b1.setClickable(false);
            b2.setClickable(false);
            b3.setClickable(false);
            b4.setClickable(false);
            b5.setClickable(false);
            b6.setClickable(false);
            b7.setClickable(false);
            b8.setClickable(false);

            new CountDownTimer(1000, 1000) {

                public void onTick(long millisUntilFinished) {
                }

                public void onFinish() {
                    startActivity(new Intent(Madness.this,md.class));
                    finish();
                }

            }.start();

            return;
        }
        else{
            return;
        }
    }

}

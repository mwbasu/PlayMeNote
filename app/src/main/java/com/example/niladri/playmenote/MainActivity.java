package com.example.niladri.playmenote;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.niladri.playmenote.R.raw.d1;
import static com.example.niladri.playmenote.R.raw.s;

public class MainActivity extends AppCompatActivity {

    SoundPool mySound;
    int count=0,a1Id,a1sId,b1Id,c1Id,c1sId,c2Id,d1Id,d1sId,e1Id,f1Id,f1sId,g1Id,g1sId,sId,i=0;
    Button buttonA1, buttonStop;
    int[] buffer=new int[20];
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonA1=(Button)findViewById(R.id.btnA1);
        textView=(TextView)findViewById(R.id.textView);
        buttonStop=(Button)findViewById(R.id.stop);

        mySound=new SoundPool(2, AudioManager.STREAM_MUSIC, 0);

        arrInit();

        a1Id=mySound.load(this, R.raw.a1, 1);
        a1sId=mySound.load(this, R.raw.a1s, 1);
        b1Id=mySound.load(this, R.raw.b1, 1);
        c1Id=mySound.load(this, R.raw.c1, 1);
        c1sId=mySound.load(this, R.raw.c1s, 1);
        c2Id=mySound.load(this, R.raw.c2, 1);
        d1Id=mySound.load(this, R.raw.d1, 1);
        d1sId=mySound.load(this, R.raw.d1s, 1);
        e1Id=mySound.load(this, R.raw.e1, 1);
        f1Id=mySound.load(this, R.raw.f1, 1);
        f1sId=mySound.load(this, R.raw.f1s, 1);
        g1Id=mySound.load(this, R.raw.g1, 1);
        g1sId=mySound.load(this, R.raw.g1s, 1);
        sId=mySound.load(this, R.raw.s, 1);


    }
    public void arrInit(){
        for(i=0;i<20;i++){
            buffer[i]=16;
        }
    }
    public void playA1(View v){
        //mySound.play(a1Id, 1, 1, 1, 0, 1);
        //s.run();
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" A1");
        buffer[count]=1;
        count++;
    }
    public void onplayA1(){
        mySound.play(a1Id, 1, 1, 1, 0, 1);
        //run();
    }
    public void playA1s(View v){
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" A1s");
        buffer[count]=2;
        count++;
    }
    public void onplayA1s(){
        mySound.play(a1sId, 1, 1, 1, 0, 1);
        //run();
    }
    public void playB1(View v){
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" B1");
        buffer[count]=3;
        count++;
    }
    public void onplayB1(){
        mySound.play(b1Id, 1, 1, 1, 0, 1);
        //run();
    }
    public void playC1(View v){
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" C1");
        buffer[count]=4;
        count++;
    }
    public void onplayC1(){
        mySound.play(c1Id, 1, 1, 1, 0, 1);
        //run();
    }
    public void playC1s(View v){
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" C1s");
        buffer[count]=5;
        count++;
    }
    public void onplayC1s(){
        mySound.play(c1sId, 1, 1, 1, 0, 1);
        //run();
    }
    public void playC2(View v){
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" C2");
        buffer[count]=6;
        count++;
    }
    public void onplayC2(){
        mySound.play(c2Id, 1, 1, 1, 0, 1);
        //run();
    }
    public void playD1(View v){
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" D1");
        buffer[count]=7;
        count++;
    }
    public void onplayD1(){
        mySound.play(d1Id, 1, 1, 1, 0, 1);
        //run();
    }
    public void playD1s(View v){
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" D1s");
        buffer[count]=8;
        count++;
    }
    public void onplayD1s(){
        mySound.play(d1sId, 1, 1, 1, 0, 1);
        //run();
    }
    public void playE1(View v){
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" E1");
        buffer[count]=9;
        count++;
    }
    public void onplayE1(){
        mySound.play(e1Id, 1, 1, 1, 0, 1);
       // run();
    }
    public void playF1(View v){
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" F1");
        buffer[count]=10;
        count++;
    }
    public void onplayF1(){
        mySound.play(f1Id, 1, 1, 1, 0, 1);
        //run();
    }
    public void playF1s(View v){
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" F1s");
        buffer[count]=11;
        count++;
    }
    public void onplayF1s(){
        mySound.play(f1sId, 1, 1, 1, 0, 1);
        //run();
    }
    public void playG1(View v){
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" G1");
        buffer[count]=12;
        count++;
    }
    public void onplayG1(){
        mySound.play(g1Id, 1, 1, 1, 0, 1);
        //run();
    }
    public void playG1s(View v){
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" G1s");
        buffer[count]=13;
        count++;
    }
    public void onplayG1s(){
        mySound.play(g1sId, 1, 1, 1, 0, 1);
        //run();
    }
    public void playS(View v){
        if(count==0){
            textView.setText(" ");
        }
        textView.append(" .");
        buffer[count]=14;
        count++;
    }
    public void onplayS(){
       // mySound.play(sId, 1, 1, 1, 0, 1);
        run();
    }
    public void play(View v){
        for(i=0;i<20;i++){
            switch (buffer[i]){
                case 1:
                    onplayA1();
                    break;
                case 2:
                    onplayA1s();
                    break;
                case 3:
                    onplayB1();
                    break;
                case 4:
                    onplayC1();
                    break;
                case 5:
                    onplayC1s();
                    break;
                case 6:
                    onplayC2();
                    break;
                case 7:
                    onplayD1();
                    break;
                case 8:
                    onplayD1s();
                    break;
                case 9:
                    onplayE1();
                    break;
                case 10:
                    onplayF1();
                    break;
                case 11:
                    onplayF1s();
                    break;
                case 12:
                    onplayG1();
                    break;
                case 13:
                    onplayG1s();
                    break;
                case 14:
                    onplayS();
                    break;
                default:
                    continue;
            }
        }
        count=0;
        textView.setText(" ");
        arrInit();
    }
//    public void stop(View v){
//        mySound.stop(a1Id);
//        mySound.autoPause();
//        textView.setText(" ");
//        count=0;
//    }
    public void run(){
        try {
            Thread.sleep(500);
            buttonStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mySound.autoPause();
                    textView.setText(" ");
                    count=0;
                    arrInit();
                }
            });
        }catch (InterruptedException e){
            Log.d("T1","sleep");
        }
    }
}
// class sleeper extends Thread{
//    public void run(){
//        try {
//            Thread.sleep(500);
//        }catch (InterruptedException e){
//            Log.d("T1","sleep");
//        }
//
//    }
//}

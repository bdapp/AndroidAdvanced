package me.bello.a1motionevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyTextView myTextView = findViewById(R.id.my_text);
        myTextView.setOnClickListener(this);
        myTextView.setOnTouchListener(this);

        MyViewGroup myViewGroup = findViewById(R.id.my_view_group);
        myViewGroup.setOnClickListener(this);
        myViewGroup.setOnTouchListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.my_text:
                Log.d(TAG, "MyTextView onClick");
                break;

            case R.id.my_view_group:
                Log.d(TAG, "MyViewGroup onClick");
                break;
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (view.getId()){
            case R.id.my_text:
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG, "MyTextView onTouch action down");
                        break;

                    case MotionEvent.ACTION_MOVE:
                        Log.e(TAG, "MyTextView onTouch action move");
                        break;

                    case MotionEvent.ACTION_UP:
                        Log.e(TAG, "MyTextView onTouch action up");
                        break;
                }
                break;
        }
        return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MainActivity dispatchTouchEvent action down");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MainActivity dispatchTouchEvent action move");
                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MainActivity dispatchTouchEvent action up");
                break;

        }
        return super.dispatchTouchEvent(ev);
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MainActivity onTouchEvent action down");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MainActivity onTouchEvent action move");
                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MainActivity onTouchEvent action up");
                break;
        }

        return super.onTouchEvent(event);
    }
}

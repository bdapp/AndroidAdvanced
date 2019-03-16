package me.bello.a1motionevent;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * @Info
 * @Auth Bello
 * @Time 2019/3/10 23:39
 * @Ver
 */
public class MyTextView extends TextView {
    private static final String TAG = MyTextView.class.getSimpleName();

    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //分发
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyTextView dispatchTouchEvent ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyTextView dispatchTouchEvent ACTION_MOVE");
                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyTextView dispatchTouchEvent ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    // 消费
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyTextView onTouchEvent ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyTextView onTouchEvent ACTION_MOVE");
                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyTextView onTouchEvent ACTION_UP");
                break;
        }
        return super.onTouchEvent(event);
    }

}

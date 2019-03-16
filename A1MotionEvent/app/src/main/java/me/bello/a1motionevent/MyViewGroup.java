package me.bello.a1motionevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;

/**
 * @Info
 * @Auth Bello
 * @Time 2019/3/16 11:39
 * @Ver
 */
public class MyViewGroup extends ViewGroup {
    private final String TAG = MyViewGroup.class.getSimpleName();
    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyViewGroup dispatchTouchEvent action down");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyViewGroup dispatchTouchEvent action move");
                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyViewGroup dispatchTouchEvent action up");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyViewGroup onInterceptTouchEvent action down");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyViewGroup onInterceptTouchEvent action move");
                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyViewGroup onInterceptTouchEvent action up");
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyViewGroup onTouchEvent action down");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyViewGroup onTouchEvent action move");
                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyViewGroup onTouchEvent action up");
                break;
        }
        return super.onTouchEvent(event);
    }
}

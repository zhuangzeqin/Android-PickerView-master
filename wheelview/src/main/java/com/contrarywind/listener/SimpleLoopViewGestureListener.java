package com.contrarywind.listener;

import android.view.MotionEvent;

import com.contrarywind.view.SimpleWheelView;


/**
 * 手势监听
 */
public final class SimpleLoopViewGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {

    private final SimpleWheelView wheelView;


    public SimpleLoopViewGestureListener(SimpleWheelView wheelView) {
        this.wheelView = wheelView;
    }

    @Override
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        wheelView.scrollBy(velocityY);
        return true;
    }
}

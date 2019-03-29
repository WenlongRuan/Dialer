package com.ebupt.telecom.incalluipigeonhole.Dialpad;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * LinearLayout with getter and setter methods for the translationY property using floats,
 * for animation purposes.
 */
public class DialpadSlidingLinearLayout extends LinearLayout {

    public DialpadSlidingLinearLayout(Context context) {
        super(context);
    }

    public DialpadSlidingLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DialpadSlidingLinearLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public float getYFraction() {
        final int height = getHeight();
        if (height == 0) return 0;
        return getTranslationY() / height;
    }

    public void setYFraction(float yFraction) {
        setTranslationY(yFraction * getHeight());
    }
}
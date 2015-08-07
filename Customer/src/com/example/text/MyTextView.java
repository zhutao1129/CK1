package com.example.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyTextView extends TextView{
	String TextVulew;
	public MyTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public MyTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		TextVulew = attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "text");
	}

	public MyTextView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		Paint paint = new Paint();
		
		paint.setColor(Color.BLUE);
		
		canvas.drawText(TextVulew, 0, getTextSize(), paint);
		
		super.onDraw(canvas);
	}
}

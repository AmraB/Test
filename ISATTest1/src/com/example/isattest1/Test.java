package com.example.isattest1;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.GestureDetector.OnGestureListener;
import android.widget.LinearLayout;

public class Test extends Activity {

	private GestureDetector gestureDetector;
	LinearLayout linearGlavni;
	LinearLayout linearLijevi;
	LinearLayout linearDesni;
	
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		
		//linearGlavni =(LinearLayout) findViewById(R.id.pocetniLinear);
		//linearLijevi =(LinearLayout) findViewById(R.id.lijeviLinear);
		linearDesni =(LinearLayout) findViewById(R.id.desniLinear);
		gestureDetector = new GestureDetector(
                new SwipeGestureDetector());
		
		
	}

	@Override
	  public boolean onTouchEvent(MotionEvent event) {
		
	    try {
			if (gestureDetector.onTouchEvent(event)) {
			  return true;
			}
			return super.onTouchEvent(event);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			Log.e("YourActivity", "Error on gestures");
			return false;
		}
	  }
	
	public void onLeftSwipe() {
	    //Do something
		//linearDesni.setBackgroundColor(Color.BLUE);
		//linearLijevi.setBackgroundColor(Color.RED);
		//linearGlavni.setBackgroundColor(Color.GREEN);
		android.widget.LinearLayout.LayoutParams par=(android.widget.LinearLayout.LayoutParams) linearLijevi.getLayoutParams();
		par.weight=0.9f;
		//par.gravity=Gravity.LEFT;
		android.widget.LinearLayout.LayoutParams par1=(android.widget.LinearLayout.LayoutParams) linearDesni.getLayoutParams();
		par1.weight=0.0f;
		android.widget.LinearLayout.LayoutParams par2=(android.widget.LinearLayout.LayoutParams) linearGlavni.getLayoutParams();
		par2.weight=0.1f;
		//par2.gravity=Gravity.RIGHT;
	  }

	public void onRightSwipe() {
	    // Do something
		//linearDesni.setBackgroundColor(Color.BLUE);
		//linearLijevi.setBackgroundColor(Color.RED);
		//linearGlavni.setBackgroundColor(Color.GREEN);
		android.widget.LinearLayout.LayoutParams par=(android.widget.LinearLayout.LayoutParams) linearLijevi.getLayoutParams();
		par.weight=0.0f;
		//par.gravity=Gravity.RIGHT;
		android.widget.LinearLayout.LayoutParams par1=(android.widget.LinearLayout.LayoutParams) linearDesni.getLayoutParams();
		par1.weight=0.9f;
		android.widget.LinearLayout.LayoutParams par2=(android.widget.LinearLayout.LayoutParams) linearGlavni.getLayoutParams();
		par2.weight=0.1f;
		//par2.gravity=Gravity.LEFT;
	  }
	
	public class SwipeGestureDetector implements OnGestureListener {

		private static final int SWIPE_MIN_DISTANCE = 120;
	    private static final int SWIPE_MAX_OFF_PATH = 200;
	    private static final int SWIPE_THRESHOLD_VELOCITY = 200;

		@Override
		public boolean onDown(MotionEvent e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
				float velocityY) {
			// TODO Auto-generated method stub
			try {
		        float diffAbs = Math.abs(e1.getY() - e2.getY());
		        float diff = e1.getX() - e2.getX();

		        if (diffAbs > SWIPE_MAX_OFF_PATH)
		          return false;
		        
		        // Left swipe
		        if (diff > SWIPE_MIN_DISTANCE
		        && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
		           Test.this.onLeftSwipe();

		        // Right swipe
		        } else if (-diff > SWIPE_MIN_DISTANCE
		        && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
		          Test.this.onRightSwipe();
		        }
		      } catch (Exception e) {
		        Log.e("YourActivity", "Error on gestures");
		      }
		      return false;
		}

		@Override
		public void onLongPress(MotionEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
				float distanceY) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void onShowPress(MotionEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean onSingleTapUp(MotionEvent e) {
			// TODO Auto-generated method stub
			return false;
		}

	}
}

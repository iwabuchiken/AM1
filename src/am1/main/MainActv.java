package am1.main;

import am1.utils.Methods;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActv extends Activity {

	public static Vibrator vib;
	
	/** Called when the activity is first created. */
    
    @Override
	public void onCreate(Bundle savedInstanceState) {
		/*----------------------------
		 * Steps
		 * 1. Super
		 * 2. Set content
		 * 3. Vib => Initialize
		----------------------------*/
		super.onCreate(savedInstanceState);

		//
		setContentView(R.layout.main);

		vib = (Vibrator) this.getSystemService(this.VIBRATOR_SERVICE);
		
	}//public void onCreate(Bundle savedInstanceState)

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
		// 
		MenuInflater mi = getMenuInflater();
		mi.inflate(R.menu.menu_main, menu);
		
		return super.onCreateOptionsMenu(menu);
	}//public boolean onCreateOptionsMenu(Menu menu)

	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
		/*----------------------------
		 * Steps
		 * 1. 
			----------------------------*/
		
		vib.vibrate(Methods.vibLength_click);
		
        switch (item.getItemId()) {
			/*----------------------------
			 * Steps
			 * 1. 
			 * 9. Default
				----------------------------*/
        	/*----------------------------
			 * 1. case 0	=> 
				----------------------------*/
            case R.id.main_opt_menu_register://--------------------------------
            	
            	Methods.dlg_register(this);
            	
            	break;//case 0
            	
        }//switch (item.getItemId())
        
		return true;
    }//public boolean onOptionsItemSelected(MenuItem item)

	@Override
	protected void onPause() {
		// TODO 自動生成されたメソッド・スタブ
		super.onPause();
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
	}

	@Override
	protected void onStart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO 自動生成されたメソッド・スタブ
		super.onDestroy();
	}
}
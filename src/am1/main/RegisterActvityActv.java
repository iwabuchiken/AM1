package am1.main;

import am1.utils.Methods;
import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuItem;

public class RegisterActvityActv extends Activity {

	public static Vibrator vib;
	
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
		setContentView(R.layout.actv_register_activity);
		
		vib = (Vibrator) this.getSystemService(this.VIBRATOR_SERVICE);

	}//public void onCreate(Bundle savedInstanceState)

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO 自動生成されたメソッド・スタブ
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
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
//            case R.id.main_opt_menu_register://--------------------------------
//            	
//            	Methods.dlg_register(this);
//            	
//            	break;//case 0
            	
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
	
}//public class RegisterActvityActv extends Activity

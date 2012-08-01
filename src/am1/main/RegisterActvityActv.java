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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onPause();
	}

	@Override
	protected void onResume() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onResume();
	}

	@Override
	protected void onStart() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onDestroy();
	}
	
}//public class RegisterActvityActv extends Activity

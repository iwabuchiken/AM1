package am1.main;

import java.util.ArrayList;
import java.util.List;

import am1.listeners.ButtonOnClickListener;
import am1.listeners.ButtonOnTouchListener;
import am1.utils.DBUtils;
import am1.utils.Methods;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterGroupActv extends Activity {

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
		setContentView(R.layout.actv_register_group);
		
		vib = (Vibrator) this.getSystemService(this.VIBRATOR_SERVICE);
		
		initial_setup();

	}//public void onCreate(Bundle savedInstanceState)


	private void initial_setup() {
		/*----------------------------
		 * 1. Set listener
			----------------------------*/
		set_listeners();

		/*----------------------------
		 * 2. Set spinner
			----------------------------*/
		set_spinner();
		
	}//private void initial_setup()

	private void set_spinner() {
		/*----------------------------
		 * 1. db setup
		 * 2. Query
		 * 3. Prepare list
		 * 3-2. Close db
		 * 
		 * 4. Prepare adapter
		 * 5. Set adapter to spinner
		 * 
			----------------------------*/
		DBUtils dbu = new DBUtils(this, DBUtils.dbName);
		
		SQLiteDatabase rdb = dbu.getReadableDatabase();
		
		String sql = "SELECT * FROM " + DBUtils.tableName_genres;
		
		Cursor c = null;
		try {
			
			c = rdb.rawQuery(sql, null);
			
		} catch (Exception e) {
			
			// debug
			Toast.makeText(this, "Query => Error", 2000).show();
			
			rdb.close();
			
			return;
		}//try
		
		// Log
		Log.d("RegisterGroupActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", "c.getCount(): " + c.getCount());
		
		/*----------------------------
		 * 3. Prepare list
			----------------------------*/
		List<String> genre_list = new ArrayList<String>();
		
		c.moveToFirst();
		
		for (int i = 0; i < c.getCount(); i++) {
			
			genre_list.add(c.getString(1));
			
			c.moveToNext();
			
		}//for (int i = 0; i < c.getCount(); i++)
		
		/*----------------------------
		 * 3-2. Close db
			----------------------------*/
		rdb.close();
		
		
		/*----------------------------
		 * 4. Prepare adapter
			----------------------------*/
		ArrayAdapter<String> adp = new ArrayAdapter<String>(
							this,
//							android.R.layout.simple_list_item_1,
							R.layout.spinner_row,
							genre_list
				);
		
		adp.setDropDownViewResource(R.layout.spinner_dropdown_row);
		
		/*----------------------------
		 * 5. Set adapter to spinner
			----------------------------*/
		Spinner sp = (Spinner) findViewById(R.id.actv_register_group_sp_group);
		
		sp.setAdapter(adp);
		
	}//private void set_spinner()


	private void set_listeners() {
		/*----------------------------
		 * 1. Cancel
			----------------------------*/
		Button bt_cancel = (Button) findViewById(R.id.actv_register_group_bt_cancel);
		
		bt_cancel.setTag(Methods.ButtonTags.actv_register_group_bt_cancel);
		
		bt_cancel.setOnTouchListener(new ButtonOnTouchListener(this));
		bt_cancel.setOnClickListener(new ButtonOnClickListener(this));

		/*----------------------------
		 * 2. Register
			----------------------------*/
		Button bt_register = (Button) findViewById(R.id.actv_register_group_bt_register);
		
		bt_register.setTag(Methods.ButtonTags.actv_register_group_bt_register);
		
		bt_register.setOnTouchListener(new ButtonOnTouchListener(this));
		bt_register.setOnClickListener(new ButtonOnClickListener(this));

		// Log
		Log.d("RegisterGenreActv.java" + "["
				+ Thread.currentThread().getStackTrace()[2].getLineNumber()
				+ "]", "Listeners => Set");

	}//private void set_listeners()

	
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

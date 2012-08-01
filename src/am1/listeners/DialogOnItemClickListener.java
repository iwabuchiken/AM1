package am1.listeners;

import am1.main.*;
import am1.utils.Methods;


import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class DialogOnItemClickListener implements OnItemClickListener {

	//
	Activity actv;
	Dialog dlg;
	Dialog dlg2;
	//
	Vibrator vib;
	
	//
//	Methods.DialogTags dlgTag = null;

	public DialogOnItemClickListener(Activity actv, Dialog dlg) {
		// 
		this.actv = actv;
		this.dlg = dlg;
		
		vib = (Vibrator) actv.getSystemService(Context.VIBRATOR_SERVICE);
		
	}//public DialogOnItemClickListener(Activity actv, Dialog dlg)

	@Override
	public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
		/*----------------------------
		 * Steps
		 * 1. Get tag
		 * 2. Vibrate
		 * 3. Switching
			----------------------------*/
		
		Methods.DialogListTags tag = (Methods.DialogListTags) parent.getTag();
//		
		vib.vibrate(Methods.vibLength_click);
		
		/*----------------------------
		 * 3. Switching
			----------------------------*/
		switch (tag) {
		
		case dlg_register_lv://----------------------------------------------------
			
//			// Log
//			Log.d("DialogOnItemClickListener.java" + "["
//					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
//					+ "]", "case dlg_register_lv");
			
			String item = (String) parent.getItemAtPosition(position);
			
			if (item.equals(actv.getString(R.string.dlg_register_lv_activity))) {
				
				Intent i = new Intent();
				
//				i.setClass(actv, RegisterActivityActv.class);
				i.setClass(actv, RegisterActvityActv.class);
				
				actv.startActivity(i);
				
			} else if (item.equals(actv.getString(R.string.dlg_register_lv_group))) {
				
				Intent i = new Intent();
				
//				i.setClass(actv, RegisterActivityActv.class);
				i.setClass(actv, RegisterGroupActv.class);
				
				actv.startActivity(i);
				
			}//if (item.equals(actv.getString(R.string.ac)))
			
			
			break;// case dlg_register_lv
			
		}//switch (tag)
		
	}//public void onItemClick(AdapterView<?> parent, View v, int position, long id)
	
}//public class DialogOnItemClickListener implements OnItemClickListener

package com.devkaran.practical2_20012011050

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
	val TAG ="MainActivity"
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		showMessage("onCreate called")
	}
	fun showMessage(msg:String){
		Log.i(TAG,msg)
		Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
		Snackbar.make(findViewById(R.id.snackbarDisplay),msg,Snackbar.LENGTH_SHORT).show()
	}
	override fun onStart() {
		showMessage("onStart called")
		super.onStart()
	}
	override fun onRestart() {
		showMessage("onRestart called")
		super.onRestart()
	}
	override fun onDestroy() {
		showMessage("onDestroy called")
		super.onDestroy()
	}
	override fun onStop() {
		showMessage("onStop called")
		super.onStop()
	}
	override fun onResume() {
		showMessage("onResume called")
		super.onResume()
	}
}
package com.example.controlflow2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// for문 사용
		for(idx in 0..5){
			Log.d("ControlFlow_for", "현재 idx값 : $idx")
		}

		for(idx in 0 until 5){
			Log.d("ControlFlow_for", "마지막 값 제외 idx값 : $idx")
		}

		var star = "*"
		
		//for 문을 이용하여 0, 3, 6, 9를 출력
		for(star in 0..10 step 3){
			Log.d("ControlFlow_for", "${star}")
		}

		// 5부터 0까지 거꾸로 출력
		for(idx in 5 downTo 0){
			Log.d("ControlFlow_for", "$idx")
		}

		// 10 부터 0가지 3씩 건너뛰면서 출력력
		for(idx in 10 downTo 0 step 3){
			Log.d("ControlFlow_for", "$idx")
		}

		// 중첩 for문
		for(idx in 1..5){
			for(id in 2..6 step 2){
				Log.d("ControlFlow_for", "${idx * id}")
			}
		}
	}
}
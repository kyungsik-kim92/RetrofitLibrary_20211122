package org.techtown.retrofitlibrary_20211122

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.techtown.retrofitlibrary_20211122.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setValues()
        setupEvents()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}
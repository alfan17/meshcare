package com.appsid.meshcare.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appsid.meshcare.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        rating_detail.rating = 4.3f
    }
}
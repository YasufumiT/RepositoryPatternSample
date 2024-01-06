package com.example.repositorypatternsample.ui.sampleui.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.repositorypatternsample.R
import com.example.repositorypatternsample.ui.sampleui.presenter.SamplePresenter
import com.example.repositorypatternsample.ui.sampleui.SampleContract

class MainActivity : AppCompatActivity(), SampleContract.View {
    private lateinit var sampleNum: TextView
    private lateinit var presenter: SampleContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = SamplePresenter()

        sampleNum = findViewById(R.id.sampleText)
        sampleNum.text = presenter.featchData().modelNum.toString()
        val buttonAdd: Button = findViewById(R.id.buttonAdd)
        val buttonClear: Button = findViewById(R.id.buttonClear)

        buttonAdd.setOnClickListener {
            presenter.addNum()
            sampleNum.text = presenter.featchData().modelNum.toString()
            Log.d("MyApp", "アプリ開始str：「" + presenter.featchData().modelNum.toString() + "」");
        }

        buttonClear.setOnClickListener {
            presenter.clear()
            sampleNum.text = presenter.featchData().modelNum.toString()
            Log.d("MyApp", "アプリ開始str：「" + presenter.featchData().modelNum.toString() + "」");
        }
    }

    override fun onResume() {
        super.onResume()
        presenter.featchData()
        executeLog()
    }

    override fun executeLog() {
        Log.d("MyApp", "アプリ再開：「" + presenter.featchData().modelStr + "」");
    }
}

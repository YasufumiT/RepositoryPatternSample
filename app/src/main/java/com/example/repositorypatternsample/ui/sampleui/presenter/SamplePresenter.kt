package com.example.repositorypatternsample.ui.sampleui.presenter

import android.util.Log
import com.example.repositorypatternsample.model.samplemodel.repository.ISampleRepository
import com.example.repositorypatternsample.injection.ModelObject
import com.example.repositorypatternsample.model.samplemodel.SampleModel
import com.example.repositorypatternsample.ui.sampleui.SampleContract

class SamplePresenter() : SampleContract.Presenter {

    private var Repository: ISampleRepository

    init {
        Log.d("MyApp", "init：起動!!!!");
        Repository = ModelObject.getSampleRepository()
    }

    override fun featchData(): SampleModel = Repository.featchData()

    override fun addNum() {
        var num = Repository.featchData().modelNum
        num += 1
        Repository.addIntData(num)
    }

    override fun clear() {
        Repository.clearData()
    }
}

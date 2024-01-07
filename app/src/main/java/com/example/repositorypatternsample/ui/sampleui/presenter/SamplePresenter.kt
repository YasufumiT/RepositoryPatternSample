package com.example.repositorypatternsample.ui.sampleui.presenter

import com.example.repositorypatternsample.model.samplemodel.repository.ISampleRepository
import com.example.repositorypatternsample.injection.ModelObject
import com.example.repositorypatternsample.model.samplemodel.SampleModel
import com.example.repositorypatternsample.ui.sampleui.SampleContract

class SamplePresenter() : SampleContract.Presenter {

    private var repository: ISampleRepository = ModelObject.getSampleRepository()

    override fun featchData(): SampleModel = repository.featchData()

    override fun addNum() {
        var num = repository.featchData().modelNum
        num += 1
        repository.addIntData(num)
    }

    override fun clear() {
        repository.clearData()
    }
}

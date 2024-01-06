package com.example.repositorypatternsample.ui.sampleui

import com.example.repositorypatternsample.model.samplemodel.SampleModel

interface SampleContract {

    interface View {
        fun executeLog()
    }

    interface Presenter {
        fun featchData(): SampleModel
        fun addNum()
        fun clear()
    }
}
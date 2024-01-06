package com.example.repositorypatternsample

import com.example.repositorypatternsample.sampledata.SampleModel

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
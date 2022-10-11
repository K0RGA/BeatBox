package com.example.beatbox

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class SoundViewModel{

    private var _title : MutableLiveData<String?> = MutableLiveData()
    var title : LiveData<String?> = _title

    var sound: Sound? = null
        set(value) {
            field = value
            _title.postValue(sound?.name)
        }
}
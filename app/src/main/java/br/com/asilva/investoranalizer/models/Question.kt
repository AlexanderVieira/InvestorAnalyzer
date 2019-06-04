package br.com.asilva.investoranalizer.models

import android.arch.lifecycle.MutableLiveData

/*class Question {
}*/

class Question(
    val body: MutableLiveData<String>,
    val options: MutableLiveData<List<String>>
)
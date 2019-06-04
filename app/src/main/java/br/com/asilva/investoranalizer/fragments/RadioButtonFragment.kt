package br.com.asilva.investoranalizer.fragments

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.asilva.investoranalizer.R
import br.com.asilva.investoranalizer.viewmodels.RadioButtonViewModel
import kotlinx.android.synthetic.main.radio_button_fragment.*

class RadioButtonFragment : Fragment() {

    private lateinit var radioButtonsIds: List<Int>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.radio_button_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        radioButtonsIds = listOf(radioButtonChoice_a.id,
                                    radioButtonChoice_b.id,
                                    radioButtonChoice_c.id,
                                    radioButtonChoice_d.id)
    }

}

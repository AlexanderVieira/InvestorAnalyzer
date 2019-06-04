package br.com.asilva.investoranalizer.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.asilva.investoranalizer.R
import br.com.asilva.investoranalizer.viewmodels.RadioButtonViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var fullName: String
    //private lateinit var btnInitial: View
    private lateinit var rbvm: RadioButtonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rbvm = RadioButtonViewModel()
        setUpListeners()

    }

    private fun setUpListeners(){

        btnInitial.setOnClickListener {

            fullName = editName.text.toString()
            val questionActivity = Intent(this, QuestionActivity::class.java)
            startActivity(questionActivity)
        }
    }

}

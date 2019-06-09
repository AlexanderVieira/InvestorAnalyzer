package br.com.asilva.investoranalizer.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import br.com.asilva.investoranalizer.R
import br.com.asilva.investoranalizer.dataAccess.questions
import br.com.asilva.investoranalizer.fragments.RadioButtonFragment
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    //lateinit var radioButtonViewModel: RadioButtonViewModel
    private var currentQuestionIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        /*radioButtonViewModel = ViewModelProviders
            .of(this)
            .get(RadioButtonViewModel::class.java)*/

        val fragTransaction = supportFragmentManager.beginTransaction()
        val radioButtonFrag = RadioButtonFragment.newInstance(questions[currentQuestionIndex])
        fragTransaction.add(R.id.frameLayoutQuestion, radioButtonFrag)
        fragTransaction.commit()
        setUpListener()
    }

    fun setUpListener(){
        btnProximo.setOnClickListener {
            val radioGroupfrag = findViewById<RadioGroup>(R.id.radioGroupFrag)
            val selectedOption = radioGroupfrag.checkedRadioButtonId
            val selectedRadioButton = findViewById<RadioButton>(selectedOption)
            val selectedText = selectedRadioButton.text.toString()
            Toast.makeText(this,"Você selecionou a alternativa " + selectedText, Toast.LENGTH_LONG).show()

            showNextQuestion()
        }
    }

    fun showNextQuestion(){
        currentQuestionIndex += 1
        if (currentQuestionIndex < questions.size){
            val fragTransaction = supportFragmentManager.beginTransaction()
            val radioButtonFrag = RadioButtonFragment.newInstance(questions[currentQuestionIndex])
            fragTransaction.replace(R.id.frameLayoutQuestion, radioButtonFrag)
            fragTransaction.commit()
        }else{
            Toast.makeText(this,"Acabaram as perguntas", Toast.LENGTH_LONG).show()
        }
    }

}

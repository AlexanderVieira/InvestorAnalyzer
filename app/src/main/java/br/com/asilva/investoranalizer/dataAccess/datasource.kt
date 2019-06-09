package br.com.asilva.investoranalizer.dataAccess

import br.com.asilva.investoranalizer.models.Question
import br.com.asilva.investoranalizer.util.*

var questions = listOf<Question>(
    Question(QUESTION_1,
        listOf(OPTION_QUESTION_1_ALTERNATIVE_A,
                OPTION_QUESTION_1_ALTERNATIVE_B,
                OPTION_QUESTION_1_ALTERNATIVE_C,
                OPTION_QUESTION_1_ALTERNATIVE_D
    )),
    Question(QUESTION_2,
        listOf(
            OPTION_QUESTION_2_ALTERNATIVE_A,
            OPTION_QUESTION_2_ALTERNATIVE_B,
            OPTION_QUESTION_2_ALTERNATIVE_C,
            OPTION_QUESTION_2_ALTERNATIVE_D
        ))
)


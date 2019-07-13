package com.ryeslim.courtcounterviewmodelkotlin

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var mViewModel: ScoreViewModel

    // The finished onCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)
        displayForTeamA(mViewModel.scoreTeamA)
        displayForTeamB(mViewModel.scoreTeamB)
    }

    // An example of both reading and writing to the ViewModel

    fun buttonPlusOneA(v: View) {
        mViewModel.scoreTeamA = mViewModel!!.scoreTeamA + 1
        displayForTeamA(mViewModel.scoreTeamA)
    }

    fun buttonPlusTwoA(v: View) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 2
        displayForTeamA(mViewModel.scoreTeamA)
    }

    fun buttonPlusThreeA(v: View) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 3
        displayForTeamA(mViewModel.scoreTeamA)
    }

    fun buttonPlusOneB(v: View) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 1
        displayForTeamB(mViewModel.scoreTeamB)
    }

    fun buttonPlusTwoB(v: View) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 2
        displayForTeamB(mViewModel.scoreTeamB)
    }

    fun buttonPlusThreeB(v: View) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 3
        displayForTeamB(mViewModel.scoreTeamB)
    }

    fun reset(v: View) {
        mViewModel.scoreTeamA = 0
        mViewModel.scoreTeamB = 0
        displayForTeamA(mViewModel.scoreTeamA)
        displayForTeamB(mViewModel.scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        team_a_score.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        team_b_score.text = score.toString()
    }
}
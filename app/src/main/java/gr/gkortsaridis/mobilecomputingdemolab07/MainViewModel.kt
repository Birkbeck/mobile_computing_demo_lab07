package gr.gkortsaridis.mobilecomputingdemolab07

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val teamName1 = "BBK Team 1"
    val teamName2 = "BBK Team 2"

    private val _team1Score = MutableLiveData(0)
    val team1Score: LiveData<Int> = _team1Score

    private val _team2Score = MutableLiveData(0)
    val team2Score: LiveData<Int> = _team2Score

    fun increaseTeam1Score(points: Int) {
        _team1Score.value = _team1Score.value?.plus(points)
    }

    fun increaseTeam2Score(points: Int) {
        _team2Score.value = _team2Score.value?.plus(points)
    }

}
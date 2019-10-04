package com.example.gatoune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var board = "-o-"+
                    "---"+
                    "-x-"
        refresh(board)
    }
    fun refresh(board: String) {
        for ((index, value) in board.withIndex()) {
            val id = resources.getIdentifier("cell_" + index.toInt(), "id", this.packageName)
            var b = findViewById<Button>(id)
            var symbol = value.toString()
            if (symbol != "-") {
                b.text = symbol
            } else {
                b.text = ""
            }
        }
    }
    fun winner(b: String, actual_player: String): String{
        if(
            (b[0]==b[1] && b[1]==b[2]) ||
            (b[3]==b[4] && b[4]==b[5]) ||
            (b[6]==b[7] && b[7]==b[8]) ||
            (b[0]==b[3] && b[3]==b[6]) ||
            (b[1]==b[4] && b[4]==b[7]) ||
            (b[2]==b[5] && b[5]==b[8]) ||
            (b[0]==b[4] && b[4]==b[8]) ||
            (b[2]==b[4] && b[4]==b[6])){
            return actual_player

    }
        if(b.contains(other = "_")){
        return ""
        }
        return "d"
    }
}

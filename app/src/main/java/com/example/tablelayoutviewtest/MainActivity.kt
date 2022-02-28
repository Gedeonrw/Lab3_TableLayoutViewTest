package com.example.tablelayoutviewtest

import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.core.view.marginTop
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

//    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add_button.setOnClickListener {
            val version = and_version.text.toString()
            val codeName = and_name.text.toString()



            val tableRow = TableRow(this)
            val layoutParams = TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT)
                .also {
                    it.topMargin = 7
                    it.bottomMargin = 7
                }
            tableRow.setLayoutParams(layoutParams)


            val leftText = TextView(this)
            leftText.text = version

            val middleText = TextView(this)
            

            val rightText = TextView(this)
            rightText.text = codeName


            with(tableRow) {
                setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
                addView(leftText, 0)
                addView(middleText, 1)
                addView(rightText, 2)
            }

            table_layout.addView(tableRow)
        }
    }
}
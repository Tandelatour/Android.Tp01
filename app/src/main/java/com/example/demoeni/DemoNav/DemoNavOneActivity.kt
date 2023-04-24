package com.example.demoeni.DemoNav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.demoeni.R

class DemoNavOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_nav_one)
    }

    fun onClickChangerAct(view: View) {
        // preparer action d'ouvrir l'activité
        //            class       context actuel : this    -> context ou on veut aller DemoNavTwo
        val intent = Intent(this, DemoNavTwoActivity::class.java)

        //executer ce type d'action (pour ouvrir une activité a l'aide de StartActivity
        startActivity(intent)   // ca ouvre une activité





    }
}
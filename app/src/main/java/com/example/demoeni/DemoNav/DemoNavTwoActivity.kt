package com.example.demoeni.DemoNav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.demoeni.R

class DemoNavTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_nav_two)
    }


    fun onClickOpenOneActivity(view: View) {
        // preparer action d'ouvrir l'activité
        //            class       context actuel : this    -> context ou on veut aller DemoNavOne
        val intent = Intent(this, DemoNavOneActivity::class.java)

        //executer ce type d'action (pour ouvrir une activité a l'aide de StartActivity
        startActivity(intent)   // ca ouvre une activité

    }


    fun onClickCloseAlltoRoot(view: View) {
        // preparer action tout fermer et revenir sur activité par defaut (one)

        //            class       context actuel : this    -> context ou on veut aller DemoNavOne
        val intent = Intent(this, DemoNavOneActivity::class.java)

        // on efface toute les activité saus celle qui est renseigner
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK); 


        //executer ce type d'action (pour ouvrir une activité a l'aide de StartActivity
        startActivity(intent)   // ca ouvre une activité


    }
}
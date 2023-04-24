package com.example.demoeni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.demoeni.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //nouvelle version
        amb = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        //ancienne version
        //setContentView(R.layout.activity_main)

        //ajout de fonction sur un bouton






        var notes1 = 15;
        var notes2 = 20;

        //   La moyenne est 14,5

        var averagetest = (notes1 + notes2) / 2

        println("ENIDEMO : " + " Start ")
//        println("ENIDEMO : " + " note 1 :  " + notes1)
//        println("ENIDEMO : " + " note 2 :  " + notes2)
//        println("ENIDEMO : " + " Moyennetest :  " + averagetest)

        //ecrire fonction


        var number1: Float = 12f
        var number2: Float = 8f

        var tabDraw: FloatArray = floatArrayOf(14f, 9f, 10.5f)

        var tabSport: FloatArray = floatArrayOf(4f, 6f)
        tabSport += 9.5f    //permet d'ajouter dans un tableau

        var tabMath: FloatArray = floatArrayOf(14f, 16f)
        tabMath.plus(16f) //permet d'ajouter dans un tableau avec une méthode

        var averageDraw: Float = AverageCalculation(tabDraw)
        var averageSport: Float = AverageCalculation(tabSport)
        var averageMath: Float = AverageCalculation(tabMath)


        println("ENIDEMO : " + " Notes du Cours Dessin  :  " + tabDraw.contentToString())
        println("ENIDEMO : " + " Moyenne Cours Dessin  :  " + averageDraw)

        println("ENIDEMO : " + " Notes du Cours Sport  :  " + tabSport.contentToString())
        println("ENIDEMO : " + " Moyenne Cours Sport  :  " + averageSport)

        println("ENIDEMO : " + " Notes du Cours Math  :  " + tabMath.contentToString())
        println("ENIDEMO : " + " Moyenne Cours Math  :  " + averageMath)


        // retourne la moyenne


    }

    fun AverageCalculation(tabCalculation: FloatArray): Float {

        // additonne toute les donnée du table et les divise par la longueur du tab
        var average: Float = tabCalculation.sum() / tabCalculation.size

        return average
    }

    fun onClickLogin(view: View) {
        //que faire lors du bouton connexion


        //recuperer valeur champs email et mdp
//vielle version
//        val editTextMail = findViewById<EditText>(R.id.editTextMail)
//        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)

        //meilleur facon de faire
        val editTextMail = amb.editTextMail
        val editTextPassword = amb.editTextPassword


        println("ENIDemo : " + editTextMail.text)
        println("ENIDemo : " + editTextPassword.text)

        val tvFormMessage = findViewById<TextView>(R.id.tvFormMessage)

        if (editTextMail.text.isEmpty() || editTextPassword.text.isEmpty()) {
            println("ENIDemo : y'a rien")
            tvFormMessage.text = " ⚠ Veuillez saisir tout les champs"

        } else {
            tvFormMessage.text = "Bonjour " + editTextMail.text
//  findNavController().navigate(R.id.action_fragment_one_to_fragmentTwo)

        }


    };

}
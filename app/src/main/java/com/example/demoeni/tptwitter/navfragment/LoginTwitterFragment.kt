package com.example.demoeni.tptwitter.navfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.demoeni.R
import com.example.demoeni.databinding.ActivityTwitterBinding
import com.example.demoeni.databinding.FragmentLoginTwitterBinding


class LoginTwitterFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        //       val maVueFragmentUn = DataBindingUtil.inflate<FragmentOneBinding>(
        //            inflater,
        //            R.layout.fragment_one,
        //            container,
        //            false
        //        )

        val maVueFragmentLogin = DataBindingUtil.inflate<FragmentLoginTwitterBinding>(inflater,R.layout.fragment_login_twitter, container,false)

        maVueFragmentLogin.buttonLogin.setOnClickListener(){


            val tvFormMessage = maVueFragmentLogin.tvFormMessage

            if (maVueFragmentLogin.editTextMail.text.isEmpty() || maVueFragmentLogin.editTextPassword.text.isEmpty()) {
                println("ENIDemo : y'a rien")
                tvFormMessage.text = " ⚠ Veuillez saisir tout les champs"

            } else {
                tvFormMessage.text = "Bonjour " + maVueFragmentLogin.editTextMail.text
                findNavController().navigate(R.id.action_fragment_login_to_fragmentList)
            }

        }
        return maVueFragmentLogin.root

    }

}
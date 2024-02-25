package com.geektech.bigdickbro

import android.os.Bundle
import android.text.InputType
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geektech.bigdickbro.databinding.FragmentVoitiBinding

class VoitiFragment : Fragment() {
 private lateinit var binding: FragmentVoitiBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_voiti, container, false)
        binding= FragmentVoitiBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvNoRegistration.setOnClickListener {
        findNavController().navigate(R.id.registrationFragment3)
        }
         binding.vostonov.setOnClickListener {
             findNavController().navigate(R.id.restoreFragment)
         }
        binding.eye.setOnClickListener{
            togglePasswordVisibility()
         }
    }
    private fun togglePasswordVisibility(){
        val currentInputType = binding.editTextPassword.inputType
        if (currentInputType == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
            // Если пароль видимый, сделать его невидимым
            binding.editTextPassword.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        } else {
            // Если пароль невидимый, сделать его видимым
            binding.editTextPassword.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
        }
    }

}
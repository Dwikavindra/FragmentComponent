package com.example.navigationcomponent.auth.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.LoginFragmentDirections
import com.example.navigationcomponent.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
//    cara initialize binding
    //ini declare aja dulu
    private var _binding:FragmentLoginBinding?=null
    private val binding
    get()=_binding!!// kalau pake getter berarti ngeganti jenis
    override fun onCreateView(//inflater itu buat uinya si fragment
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentLoginBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onDestroyView() {//bisa diancurin sama android kalau nanti dia butuh memory tambahan
        super.onDestroyView()
        _binding=null//biar ga terjadi memory leak
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {//naro codingannya di onview created aja
        super.onViewCreated(view, savedInstanceState)
//        val btnHome=view.findViewById<Button>(R.id.btn_home)//cara lama
        binding.btnHome.setOnClickListener { //pas di click mau ngapain gitu
            val action= LoginFragmentDirections.actionLoginFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }
}
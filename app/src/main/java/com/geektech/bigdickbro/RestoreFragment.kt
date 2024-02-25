package com.geektech.bigdickbro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.bigdickbro.databinding.FragmentRestoreBinding

class RestoreFragment : Fragment() {

    private lateinit var binding: FragmentRestoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRestoreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnRestore.setOnClickListener {
            // При нажатии кнопки "Отправить" делаем container_restore невидимым,
            // а container_vostonovlrnieParol видимым
            binding.containerRestore.visibility = View.GONE
            binding.containerVostonovlrnieParol.visibility = View.VISIBLE
        }

        binding.btnVostonovitttt.setOnClickListener {
            // При нажатии кнопки "Восстановить" делаем container_restore видимым,
            // а container_vostonovlrnieParol невидимым
            binding.containerVostonovlrnieParol.visibility = View.GONE

            // Добавьте вашу дополнительную логику для кнопки "Восстановить" здесь
        }
        binding.btnVostonovFinCons.setOnClickListener {
            // При нажатии кнопки "Восстановить" делаем container_restore видимым,
            // а container_vostonovlrnieParol невидимым
            binding.containerVvediteNovyiParol.visibility = View.VISIBLE

            // Добавьте вашу дополнительную логику для кнопки "Восстановить" здесь
        }
    }
}
//    val restoreConstraintLayout = view.findViewById<ConstraintLayout>(R.id.restore_constraint_layout)
//
//    val btnRestore = view.findViewById<Button>(R.id.btn_restore)
//    btnRestore.setOnClickListener {
//        // При клике на кнопку "Восстановить" скрываем ConstraintLayout
//        restoreConstraintLayout.visibility = View.GONE
//    }




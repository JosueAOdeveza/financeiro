package com.example.applicationfinance.Activity

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.applicationfinance.Adapter.ReportListAdapter
import com.example.applicationfinance.ViewModel.MainViewModel
import com.example.applicationfinance.databinding.ActivityReportBinding

class ReportActivity : AppCompatActivity() {
    lateinit var binding: ActivityReportBinding
    private val mainViewModel:MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityReportBinding.inflate(layoutInflater)
        setContentView(binding.root)


        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        initRecyclerview()
        setVariable()
    }

    private fun setVariable() {
        binding.backBtn.setOnClickListener { finish()
        }
    }

    private fun initRecyclerview() {
        binding.view2.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.view2.adapter=ReportListAdapter(mainViewModel.loadBudget())
        binding.view2.isNestedScrollingEnabled=false
    }
}
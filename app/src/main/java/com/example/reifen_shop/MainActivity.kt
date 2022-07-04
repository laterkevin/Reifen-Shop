package com.example.reifen_shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.reifen_shop.adapter.ReifenAdapter
import com.example.reifen_shop.data.Datasource
import com.example.reifen_shop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val reifen = Datasource().loadReifen()

        binding.reifenRecycler.adapter = ReifenAdapter(this, reifen)

        binding.reifenRecycler.setHasFixedSize(true)

        // der SnapHelper sorgt dafür dass die RecyclerView pro Item einrastet

    }
}

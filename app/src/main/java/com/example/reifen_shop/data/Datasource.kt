package com.example.reifen_shop.data

import com.example.reifen_shop.R
import com.example.reifen_shop.data.model.Reifen

class Datasource() {

    fun loadReifen(): List<Reifen> {
        return listOf(
            Reifen(
                "Duro DM1017 Raider",
                42.66,
                R.drawable.reifen1,
                false
            ),
            Reifen(
                "Reifen 3.50-10 Duro",
                36.91,
                R.drawable.reifen2,
                false
            ),
            Reifen(
                "Duro HE903 120 Reifen",
                34.86,
                R.drawable.reifen3,
                true
            ),
        )
    }
}

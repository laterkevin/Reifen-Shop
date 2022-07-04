package com.example.reifen_shop.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.reifen_shop.R
import com.example.reifen_shop.data.model.Reifen
import com.example.reifen_shop.databinding.ReifenListBinding

class ReifenAdapter(
    private val context: Context,
    private val dataset: List<Reifen>
) : RecyclerView.Adapter<ReifenAdapter.ItemViewHolder>() {

    class ItemViewHolder(val binding: ReifenListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding = ReifenListBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]

        holder.binding.cardImage.setImageResource(item.imageResource)
        holder.binding.textTeilenummer.text = item.name
        holder.binding.textTitle.text = item.name
        holder.binding.lagerBestand.setImageResource(R.drawable.lagerbestand)
        holder.binding.tagSale.setImageResource(R.drawable.tag_sale)
        holder.binding.starsText.setImageResource(R.drawable.stars)
        holder.binding.textPrice.text = "${item.price} €"

        if (item.sale) {
            holder.binding.tagSale.setImageResource(R.drawable.tag_sale)
        } else {
            holder.binding.tagSale.setImageResource(R.drawable.tag)
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}

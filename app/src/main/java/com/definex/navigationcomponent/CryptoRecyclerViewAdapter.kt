package com.definex.navigationcomponent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.definex.navigationcomponent.databinding.CryptoListRowLayoutBinding

class CryptoRecyclerViewAdapter(
    private val cryptoList: ArrayList<MarketModel>,
) : RecyclerView.Adapter<CryptoRecyclerViewAdapter.RowHolder>(), CryptoItemOnClickListener {


    class RowHolder(val binding: CryptoListRowLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<CryptoListRowLayoutBinding>(inflater, R.layout.crypto_list_row_layout,parent,false)
        return RowHolder(view)
    }

    override fun getItemCount(): Int = cryptoList.count()

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.binding.crypto = cryptoList[position]
        holder.binding.listener = this
    }

    fun refreshCryptoList(currentCryptoList: List<MarketModel>) {
        cryptoList.clear()
        cryptoList.addAll(currentCryptoList)
        notifyDataSetChanged()
    }

    override fun onItemClick(view: View) {


    }

}
package com.lazzarotti.lista_contatos_v2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactAdapterViewholder>(){

    private val list: MutableList<Contact> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewholder {
        val view = LayoutInflater.from(parent.context).inflate()
    }

    override fun onBindViewHolder(holder: ContactAdapterViewholder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ContactAdapterViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(contact: Contact) {

        }
    }
}
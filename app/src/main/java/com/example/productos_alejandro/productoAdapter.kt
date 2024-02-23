package com.example.productos_alejandro

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class productoAdapter(var context: Context,
    var productos: MutableList<dtproducto>) :
    RecyclerView.Adapter<productoAdapter.vHolder>()
{
   inner class vHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
lateinit var txtid:TextView
init {
    txtid=itemView.findViewById(R.id.txtID)
}
       lateinit var txtdescripcion:TextView
       init {
           txtdescripcion=itemView.findViewById(R.id.txtDescripcion)
       }

       lateinit var txtpreciomenudeo:TextView
       init {
           txtpreciomenudeo=itemView.findViewById(R.id.txtpreciomenudeo)
       }

       lateinit var txtpreciomayoreo:TextView
       init {
           txtpreciomayoreo=itemView.findViewById(R.id.txtpreciomayoreo)
       }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):productoAdapter.vHolder {
var itemView= LayoutInflater.from(context).inflate(
    R.layout.listaproducto,parent,false)

        return vHolder(itemView)
    }

    override fun getItemCount(): Int {
        return productos.size
    }

    override fun onBindViewHolder(holder:productoAdapter.vHolder, position: Int) {
var listaproducto = productos[position]
        holder.txtid.text=listaproducto.Id
        holder.txtdescripcion.text=listaproducto.descripcion
        holder.txtpreciomenudeo.text=listaproducto.preciomenudeo
        holder.txtpreciomayoreo.text=listaproducto.preciomayoreo
    }

}
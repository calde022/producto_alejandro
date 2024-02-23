package com.example.productos_alejandro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {
    private var productoAdapter:MutableList<dtproducto> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        productoAdapter.add(
            dtproducto("pooo","Botella de agua de acero inoxidable","$12.99","$9.99"))

        productoAdapter.add(
            dtproducto("POO1","laptop Hp pavilion","$800","$750"))

        productoAdapter.add(
            dtproducto("poo2","telefono samsung galaxy s21","$1000","$950"))

        productoAdapter.add(
            dtproducto("poo3","auriculares inalambricos sony","$300","$280"))

        productoAdapter.add(
            dtproducto("poo4","smart TV LG 55 4k","$700","$650"))

        productoAdapter.add(
            dtproducto("poo5","consola de videojuego Xbox series x","$500","$480"))

        productoAdapter.add(
            dtproducto("poo6","camara digital canon T7","$450","$420"))

        productoAdapter.add(
            dtproducto("poo7","refrigerador whirpool 25 pies","$800","$750"))

        productoAdapter.add(
            dtproducto("poo8","lavadora samsung","$600","$570"))

        productoAdapter.add(
            dtproducto("poo9","monitor Dell 27","$300","$280"))

        productoAdapter.add(
            dtproducto("po10","impresora Epson","$200","$180"))

        productoAdapter.add(
            dtproducto("po11","licuadora oster con vaso de vidrio","$50","$45"))

        productoAdapter.add(
            dtproducto("po12","set de sartenes (juego de 3)","$80","$75"))

        productoAdapter.add(
            dtproducto("po13","mochila para laptop","$40","$35"))

        productoAdapter.add(
            dtproducto("po14","teclado mecanico gaming RGB","$60","$55"))

        productoAdapter.add(
            dtproducto("po15","cafetera keuring","$80","$75"))

        productoAdapter.add(
            dtproducto("po16","set de herramientas 100pz","$120","$110"))

        productoAdapter.add(
            dtproducto("po17","altavoz blutooth JBL","$100","$90"))

        productoAdapter.add(
            dtproducto("po18","reloj inteligente","$150","$120"))

        productoAdapter.add(
            dtproducto("po19","usb 200m","$12.99","$9.99"))


        var tabla = findViewById<RecyclerView>(R.id.tablaproductos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=productoAdapter(this,productoAdapter)

    }
}
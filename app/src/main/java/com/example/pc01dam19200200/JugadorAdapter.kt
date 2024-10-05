package com.example.pc01dam19200200

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class JugadorAdapter(private val jugadorList: List<Jugador>) : RecyclerView.Adapter<JugadorAdapter.JugadorViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JugadorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_jugador, parent, false)
        return JugadorViewHolder(view)
    }

    override fun onBindViewHolder(holder: JugadorViewHolder, position: Int) {
        val jugador = jugadorList[position]
        holder.nombreTextView.text = jugador.nombre
        holder.anioNacimientoTextView.text = jugador.anioNacimiento.toString()
        holder.edadTextView.text = jugador.edad.toString()

        // Configurar la imagen del jugador
        holder.imagenJugador.setImageResource(jugador.imagenResource)
    }

    override fun getItemCount(): Int = jugadorList.size

    class JugadorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagenJugador: ImageView = itemView.findViewById(R.id.imageViewJugador)
        val nombreTextView: TextView = itemView.findViewById(R.id.textViewNombreJugador)
        val anioNacimientoTextView: TextView = itemView.findViewById(R.id.textViewAnioNacimiento)
        val edadTextView: TextView = itemView.findViewById(R.id.textViewEdad)
    }
}

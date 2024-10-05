package com.example.pc01dam19200200

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pc01dam19200200.R

class FutbolistasFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var jugadorAdapter: JugadorAdapter
    private lateinit var jugadorList: List<Jugador>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout del fragmento
        val view = inflater.inflate(R.layout.fragment_futbolistas, container, false)

        // Inicializar RecyclerView
        recyclerView = view.findViewById(R.id.recyclerViewJugadores)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Crear lista de jugadores
        jugadorList = listOf(
            Jugador("Cristiano Ronaldo", 1985, 38, R.drawable.ronaldo),
            Jugador("Neymar", 1992, 31, R.drawable.neymar),
            Jugador("Erling Haaland", 2000, 24, R.drawable.haland)
        )

        // Configurar el adaptador
        jugadorAdapter = JugadorAdapter(jugadorList)
        recyclerView.adapter = jugadorAdapter

        return view
    }
}

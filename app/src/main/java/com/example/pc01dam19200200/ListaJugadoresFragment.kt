package com.example.pc01dam19200200

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pc01dam19200200.databinding.FragmentListaJugadoresBinding

class ListaJugadoresFragment : Fragment() {

    private var _binding: FragmentListaJugadoresBinding? = null
    private val binding get() = _binding!!

    private val jugadores = listOf(
        Jugador("Cristiano Ronaldo", 1985, 38, R.drawable.ronaldo),
        Jugador("Neymar", 1992, 31, R.drawable.neymar),
        Jugador("Erling Haaland", 2000, 23, R.drawable.haland)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListaJugadoresBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerViewJugadores.layoutManager = LinearLayoutManager(context)
        binding.recyclerViewJugadores.adapter = JugadorAdapter(jugadores)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

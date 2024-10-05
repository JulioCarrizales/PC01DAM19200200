package com.example.pc01dam19200200

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class RendimientoFragment : Fragment() {

    private lateinit var kilometrosEditText: EditText
    private lateinit var minutosEditText: EditText
    private lateinit var calcularButton: Button
    private lateinit var rendimientoTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rendimiento, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize views
        kilometrosEditText = view.findViewById(R.id.kilometrosEditText)
        minutosEditText = view.findViewById(R.id.minutosEditText)
        calcularButton = view.findViewById(R.id.calcularButton)
        rendimientoTextView = view.findViewById(R.id.rendimientoTextView)

        // Set button click listener
        calcularButton.setOnClickListener {
            calcularRendimiento()
        }
    }

    private fun calcularRendimiento() {
        // Get user input values
        val kilometros = kilometrosEditText.text.toString().toDoubleOrNull()
        val minutos = minutosEditText.text.toString().toDoubleOrNull()

        // Validate input values
        if (kilometros != null && minutos != null && minutos != 0.0) {
            // Calculate performance
            val rendimiento = kilometros / minutos
            // Display result in rendimientoTextView
            rendimientoTextView.text = String.format("%.1f km/min", rendimiento)
        } else {
            // Show error message if input is invalid
            rendimientoTextView.text = "Por favor ingrese valores válidos"
        }
    }
}

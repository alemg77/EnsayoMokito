package com.a6.ensayomokito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.a6.ensayomokito.databinding.ActivityMainBinding
import com.a6.ensayomokito.login.Login
import com.a6.ensayomokito.login.LoginPresenter

class MainActivity : AppCompatActivity(), Login.View{

    private lateinit var binding: ActivityMainBinding

    private val presenter = LoginPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.botonVerificar.setOnClickListener {
            presenter.validaUser(
                binding.editUsuario.text.toString(),
                binding.editPassword.text.toString()
            )
        }

    }

    override fun usuarioValido() {
        Toast.makeText(this, "OK!!", Toast.LENGTH_LONG).show()
    }

    override fun error() {
        Toast.makeText(this, "Error!!", Toast.LENGTH_LONG).show()
    }

    override fun getUsuario(): String {
        return binding.editUsuario.text.toString()
    }

    override fun getPassword(): String {
        return binding.editPassword.text.toString()
    }
}
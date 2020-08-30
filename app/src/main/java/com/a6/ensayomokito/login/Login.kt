package com.a6.ensayomokito.login

interface Login {

    interface View {
        fun usuarioValido()
        fun error()
        fun getUsuario():String
        fun getPassword():String
    }

    interface Presenter{
        fun validaUser(user:String, pass:String)
        fun usuarioValido()
        fun error()
    }

    interface Model {
        fun validaUser(user:String, pass:String)
    }
}


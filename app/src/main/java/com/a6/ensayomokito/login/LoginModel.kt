package com.a6.ensayomokito.login



// EL modelo maneja la informacion
// EL modelo actua sobre el presenter a travez de su interfase

class LoginModel(val preseter:Login.Presenter) : Login.Model {

    override fun validaUser(user: String, pass: String) {
        if ( user.equals("ale") && pass.equals("123")){
            preseter.usuarioValido()
        } else {
            preseter.error()
        }
    }

}
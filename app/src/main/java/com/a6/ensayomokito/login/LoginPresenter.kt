package com.a6.ensayomokito.login



// EL presenter recibe la vista sobre la que debe actuar
// El presente tiene el modelo y le encarga el manejo de la informacion


class LoginPresenter(val view: Login.View) : Login.Presenter {

    val model = LoginModel(this)

    override fun validaUser(user: String, pass: String) {
        model.validaUser(user, pass)
    }

    override fun usuarioValido() {
        view.usuarioValido()
    }

    override fun error() {
        view.error()
    }

}
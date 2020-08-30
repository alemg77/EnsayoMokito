package com.a6.ensayomokito.login

import com.a6.ensayomokito.login.Login.Presenter
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class LoginModelTest {

    @Mock
    private val presenter: Presenter? = null
    private var model: LoginModel? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        model = LoginModel(presenter!!)
    }

    @Test
    @Throws(Exception::class)
    fun shouldSuccerWithValidaUserPass() {
        model!!.validaUser("ale", "123")

        // Verifica que se llama un metodo
        Mockito.verify(presenter)?.usuarioValido()
    }

    @Test
    @Throws(Exception::class)
    fun shoulcNotSuccessWithThisUserandPass() {
        model!!.validaUser("ale", "1234")
        Mockito.verify(presenter)?.error()
    }
}

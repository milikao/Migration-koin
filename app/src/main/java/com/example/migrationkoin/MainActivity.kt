package com.example.migrationkoin

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.migrationkoin.dagger.DaggerLoginComponent
import com.example.migrationkoin.dagger.LoginModule
import com.example.migrationkoin.dagger.LoginPresenter
import com.example.migrationkoin.dagger.LoginView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject

class MainActivity : AppCompatActivity(), LoginView {

    @Inject
    lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        val build = DaggerLoginComponent.builder().loginModule(LoginModule(this@MainActivity))
            .build()

        build
            .inject(this@MainActivity)

        build
            .inject(loginPresenter.profileInteractorDagger.profileInteractor)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            loginPresenter.login()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun sucessLogin(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
package com.example.projetofinalpart1

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.speech.RecognizerIntent
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.projetofinalpart1.databinding.ActivityMainBinding
import com.example.projetofinalpart1.databinding.DialogLayoutBinding
import com.example.projetofinalpart1.model.Filme

val listaTodosFilmes = ArrayList<Filme>()

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (!screenRotated(savedInstanceState)) {
            NavigationManager.goToDashboardFragment(supportFragmentManager)
        }
        binding.toolbar.title = getString(R.string.dashboard)
        NavigationManager.goToDashboardFragment(
            supportFragmentManager
        )
    }


    override fun onStart() {
        super.onStart()
        setSupportActionBar(binding.toolbar)
        setupDrawerMenu()
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }

    private fun setupDrawerMenu() {
        val toggle = ActionBarDrawerToggle(
            this,
            binding.drawer, binding.toolbar,
            R.string.drawer_open, R.string.drawer_close

        )
        binding.navDrawer.setNavigationItemSelectedListener {
            onClickNavigationItem(it)
            binding.toolbar.title = it.title
            true
        }
        binding.bottomNavigation.setOnItemSelectedListener {
            onClickNavigationItemBottom(it)
            binding.toolbar.title = it.title
            true
        }

        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()
    }

    private fun onClickNavigationItem(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_dashboard ->

                NavigationManager.goToDashboardFragment(
                    supportFragmentManager
                )
            R.id.nav_regist ->
                NavigationManager.goToRegistFragment(
                    supportFragmentManager
                )
            R.id.nav_list ->
                NavigationManager.goToListFragment(
                    supportFragmentManager
                )
            R.id.nav_map ->
                NavigationManager.goToMapFragment(
                    supportFragmentManager
                )
            R.id.para_ver ->
                NavigationManager.goToParaVerFragment(
                    supportFragmentManager
                )
        }
        binding.drawer.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val REQUEST_CODE_SPEECH_INPUT = 100
        if (requestCode == REQUEST_CODE_SPEECH_INPUT && resultCode == RESULT_OK) {
            val result = data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
            // handle the speech recognition result here
        }
    }

    private fun onClickNavigationItemBottom(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.bottom_dashboard ->
                NavigationManager.goToDashboardFragment(
                    supportFragmentManager
                )
            R.id.bottom_regist ->
                NavigationManager.goToRegistFragment(
                    supportFragmentManager
                )
            R.id.bottom_list ->
                NavigationManager.goToListFragment(
                    supportFragmentManager
                )
            R.id.bottom_map ->
                NavigationManager.goToMapFragment(
                    supportFragmentManager
                )
            R.id.bottom_paraVer ->
                NavigationManager.goToParaVerFragment(
                    supportFragmentManager
                )
        }
        binding.drawer.closeDrawer(GravityCompat.START)
        return true
    }

    private fun screenRotated(savedInstanceState: Bundle?): Boolean {
        return savedInstanceState != null
    }
}
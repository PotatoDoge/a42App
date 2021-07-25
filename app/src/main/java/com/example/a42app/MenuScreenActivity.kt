package com.example.a42app

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MenuScreenActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menuscreen)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(findViewById(R.id.toolbar))

        drawerLayout = findViewById(R.id.drawer_layout)
        toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawerLayout.addDrawerListener(toggle)

        val nav = findViewById<NavigationView>(R.id.navigation_view)
        nav.setNavigationItemSelectedListener(this)

        toggle.syncState()
    }

    // Method that manages when the menu is opened or closed
    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    // Method that manages what happens when you click on an item from the menu
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu1 -> Toast.makeText(this, "ITEM 1", Toast.LENGTH_SHORT).show()
            R.id.menu2 -> Toast.makeText(this, "ITEM 1", Toast.LENGTH_SHORT).show()
            R.id.menu3 -> Toast.makeText(this, "ITEM 1", Toast.LENGTH_SHORT).show()
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}

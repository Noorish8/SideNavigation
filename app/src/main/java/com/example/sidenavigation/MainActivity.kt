package com.example.sidenavigation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var navigationView:NavigationView
    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var drawerLayout: DrawerLayout
    lateinit var toolbar: Toolbar
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigationView = findViewById(R.id.nav)
        bottomNavigationView=findViewById(R.id.bottomnav)
        drawerLayout = findViewById(R.id.draw)
        toolbar = findViewById(R.id.tool)
        setSupportActionBar(toolbar)
        toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        toggle.isDrawerIndicatorEnabled = true
    }



//        override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
//            when (menuItem.itemId) {
//                R.id.nav_public -> {
//                    Toast.makeText(this, "Publication", Toast.LENGTH_SHORT).show()
//                }
//                R.id.nav_store -> {
//                    Toast.makeText(this, "Android Store", Toast.LENGTH_SHORT).show()
//                }
//                R.id.nav_news -> {
//                    Toast.makeText(this, "Newsletter", Toast.LENGTH_SHORT).show()
//                }
//                R.id.nav_join -> {
//                    Toast.makeText(this, "Join Community", Toast.LENGTH_SHORT).show()
//                }
//                R.id.nav_contact -> {
//                    Toast.makeText(this, "Contact us", Toast.LENGTH_SHORT).show()
//                }
//            }
//            drawer_layout.closeDrawer(GravityCompat.START)
//            return true
//        }
    }

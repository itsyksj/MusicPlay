package app.practice.musicplay

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import app.practice.musicplay.bottomNavigation.FeedFragment
import app.practice.musicplay.bottomNavigation.HomeFragment
import app.practice.musicplay.bottomNavigation.PlaylistFragment
import app.practice.musicplay.bottomNavigation.ProfileFragment
import app.practice.musicplay.bottomNavigation.SearchFragment
import app.practice.musicplay.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()

        if(savedInstanceState == null) {
            replaceFragment(HomeFragment())
        }

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.menu_home -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.menu_feed -> {
                    replaceFragment(FeedFragment())
                    true
                }
                R.id.menu_playlist -> {
                    replaceFragment(PlaylistFragment())
                    true
                }
                R.id.menu_search -> {
                    replaceFragment(SearchFragment())
                    true
                }
                R.id.menu_profile -> {
                    replaceFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragment, fragment).commit()
    }
}
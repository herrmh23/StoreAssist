package com.example.storeassist

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.storeassist.ui.theme.StoreAssistTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)
        Toast.makeText(this, "Homepage Loaded", Toast.LENGTH_SHORT).show()

        //val toolbar = findViewById<Toolbar>(R.id.toolbar)

        //setActionBar(toolbar)

        title = "Home Page"
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        getMenuInflater().inflate(R.menu.menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.homepage) {

            Toast.makeText(
                this, "Home Selected",
                Toast.LENGTH_SHORT
            ).show()

            return true
        } else if (item.itemId == R.id.page2) {

            val intent = Intent(this, Page2Activity::class.java)

            startActivity(intent)

            return true
        }

        return super.onOptionsItemSelected(item)
    }








//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            StoreAssistTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "User",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    StoreAssistTheme {
//        Greeting("Android")
//    }
}
package id.aasumitro.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import id.aasumitro.compose.ui.theme.LearnComposeTheme
import androidx.compose.foundation.layout.fillMaxSize
import id.aasumitro.compose.example.SuperheroesApp
import id.aasumitro.compose.example.WoofApp
import id.aasumitro.compose.example.superhero.SuperheroesTheme
import id.aasumitro.compose.example.woof.WoofTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // LearnComposeTheme {
            //    Surface(
            //        modifier = Modifier.fillMaxSize(),
            //        color = MaterialTheme.colorScheme.background
            //    ) {}
            // }
        }
    }
}

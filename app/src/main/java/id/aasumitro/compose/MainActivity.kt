package id.aasumitro.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import id.aasumitro.compose.example.LunchTrayApp
import id.aasumitro.compose.example.lunchtray.LunchTrayTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LunchTrayTheme {
                LunchTrayApp()
            }
        }
    }
}

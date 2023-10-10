package id.aasumitro.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import id.aasumitro.compose.example.ReplyApp
import id.aasumitro.compose.example.SportsApp
import id.aasumitro.compose.example.reply.ReplyTheme
import id.aasumitro.compose.example.sport.SportsTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SportsTheme {
                Surface {
                    val windowSize = calculateWindowSizeClass(this)
                    SportsApp(
                        windowSize = windowSize.widthSizeClass,
                        onBackPressed = { finish() }
                    )
                }
            }
        }
    }
}

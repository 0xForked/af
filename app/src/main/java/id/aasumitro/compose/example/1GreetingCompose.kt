package id.aasumitro.compose.example

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.aasumitro.compose.R
import id.aasumitro.compose.ui.theme.LearnComposeTheme

// GREETING
// =================================================================================
@Composable
fun GreetingText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = "$text!",
        modifier = modifier,
        fontSize = 75.sp,
        lineHeight = 75.sp,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnComposeTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box {
                Image(
                    painter =  painterResource(R.drawable.about_placeholder),
                    contentDescription = null
                )
            }
            GreetingText("Welcome ma boy")
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "Some Left Text",
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Some Right Text",
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}


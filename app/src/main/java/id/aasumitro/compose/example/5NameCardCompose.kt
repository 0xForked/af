package id.aasumitro.compose.example

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.aasumitro.compose.R
import id.aasumitro.compose.ui.theme.LearnComposeTheme


// NAME CARD - NAIVE IMPL
// =================================================================================
@Composable
fun NameCardApp() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .background(color = Color.DarkGray),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 150.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter =  painterResource(id = R.drawable.about_placeholder),
                contentDescription = null,
                modifier = Modifier
                    .height(120.dp)
                    .width(150.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = stringResource(R.string.name_surname), color = Color.White, fontSize = 28.sp)
            Text(text = stringResource(R.string.business), color = Color(0xFF3ddc84))
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 250.dp)
        ){
            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp).padding(start = 40.dp),
            ){
                Icon(
                    painter = painterResource(id = R.drawable.baseline_phone_24),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84)
                )
                Text(
                    text = stringResource(R.string.phone_number),
                    modifier = Modifier.padding(start = 25.dp),color = Color.White
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp).padding(start = 40.dp),
            ){
                Icon(
                    painter = painterResource(id = R.drawable.baseline_share_24),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84)
                )
                Text(
                    text = stringResource(R.string.share),
                    modifier = Modifier.padding(start = 25.dp),color = Color.White
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth().padding(start = 40.dp),
            ){
                Icon(
                    painter = painterResource(id = R.drawable.baseline_email_24),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84)
                )
                Text(
                    text = stringResource(R.string.email),
                    modifier = Modifier.padding(start = 25.dp),color = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NameCardAppPreview() {
    LearnComposeTheme {
        NameCardApp()
    }
}
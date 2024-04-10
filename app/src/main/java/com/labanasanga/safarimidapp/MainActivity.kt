package com.labanasanga.safarimidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.labanasanga.safarimidapp.ui.theme.SafariMidAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SafariMidAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                   // Greeting("Android")
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home() {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)) {
        Text(text = "THEE LABURN APP",
            color = Color.Cyan,
           fontSize = 40.sp,
            fontFamily = FontFamily.SansSerif,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Welcome To My Application",

            color = Color.White,
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            textAlign = TextAlign.Center
        )
Image(painter = painterResource(id = R.drawable.labanpfp),
    contentDescription = "Chief Executive Officer")
Text(text = "Chief Executive Officer", fontFamily= FontFamily.Cursive)
    }
}


@Preview
@Composable
private fun Homeprev(){
    Home()
}



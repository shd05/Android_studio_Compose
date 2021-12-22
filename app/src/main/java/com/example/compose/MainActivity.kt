package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.theme.ComposeTheme
import java.lang.reflect.Modifier
import java.nio.file.WatchEvent
import java.time.format.TextStyle

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                    Example()
                }
            }
        }
    }
}

@Preview
@Composable
fun Example(){

Box {
    androidx.compose.ui.Modifier
        .width(500.dp)
        .height(300.dp)

    Image(
        modifier = androidx.compose.ui.Modifier
            .height(200.dp)
            .width(200.dp)
            .clip(CircleShape),

        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentScale = ContentScale.Crop,
        contentDescription = null,
    )
}
}

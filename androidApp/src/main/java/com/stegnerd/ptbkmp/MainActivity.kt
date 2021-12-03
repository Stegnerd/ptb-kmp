package com.stegnerd.ptbkmp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.stegnerd.ptbkmp.ui.theme.PtbkmpTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PtbkmpTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Greet()
                }
            }
        }
    }
}

@Composable
fun Greet() {
    Text(text = Greeting().greeting())
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PtbkmpTheme {
        Text(text = Greeting().greeting())
    }
}
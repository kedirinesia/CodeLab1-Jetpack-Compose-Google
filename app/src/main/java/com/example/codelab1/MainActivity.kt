package com.example.codelab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            GreetingPreview()
        }
    }
}


@Composable
fun Greeting(pertama: String, Kedua:String) {

    Column(modifier = Modifier.padding(40.dp)
                                            ) {
        Text(text = "Baris $pertama")
        Text(

            text = "Hello $Kedua"
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

        Greeting("Pertama", "Kedua")

}
package com.example.firstproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firstproject.ui.theme.FirstprojectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstprojectTheme {
                Greeting(
                    name = "Android",
                    from = "hamid",
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String, from : String ,modifier: Modifier = Modifier) {
    Box (contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()){
        Column {
            Text(
                fontSize = 100.sp,
                lineHeight = 100.sp,
                text = "Happy birthday to  $name!",
            )
            Text(
                text = "from " + from,
            )
        }

    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    FirstprojectTheme {
        Greeting("yahya","jtyt")
    }
}


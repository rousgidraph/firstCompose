package com.example.firstcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcomposeapplication.ui.theme.FirstComposeApplicationTheme
import com.example.firstcomposeapplication.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        Greeting("Android")
                        CustomText(text = "Gilbert")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun CustomText(text: String){
    Text(text = text,
    style = Typography.h5
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstComposeApplicationTheme {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Surface(modifier = Modifier
                .width(200.dp)
                .height(50.dp),
            color = MaterialTheme.colors.primary ) {}
            Surface(modifier = Modifier
                .width(200.dp)
                .height(50.dp),
                color = MaterialTheme.colors.primary ) {}
            Surface(modifier = Modifier
                .width(200.dp)
                .height(50.dp),
                color = MaterialTheme.colors.primary ) {}
            Surface(modifier = Modifier
                .width(200.dp)
                .height(50.dp),
                color = MaterialTheme.colors.primary ) {}
            Surface(modifier = Modifier
                .width(200.dp)
                .height(50.dp),
                color = MaterialTheme.colors.primary ) {}
        }
    }
}
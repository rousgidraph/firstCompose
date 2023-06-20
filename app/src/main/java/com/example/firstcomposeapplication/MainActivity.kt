package com.example.firstcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeapplication.ui.theme.FirstComposeApplicationTheme
import com.example.firstcomposeapplication.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(name = "android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter){
        Box(modifier = Modifier
            .background(Color.Blue)
            .width(100.dp)
            .height(100.dp)
            .verticalScroll(rememberScrollState())){
            Text(text = "I love Kotlin", fontSize = 40.sp)
        }
    }
}

@Composable
fun CustomText(text: String){
    Text(text = text,
    style = Typography.h5
    )
}

@Composable
fun RowScope.customItem(weight: Float, color: Color = MaterialTheme.colors.primary){
    Surface(modifier = Modifier
        .width(50.dp)
        .height(50.dp)
        .weight(weight),
        color = color ) {}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstComposeApplicationTheme {
       Greeting(name = "android")
    }
}
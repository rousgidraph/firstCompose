package com.example.firstcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
                    color = MaterialTheme.colors.background
                ) {
                    Row(modifier = Modifier.height(500.dp).width(500.dp).background(Color.LightGray),

                        horizontalArrangement = Arrangement.Center
                    ) {
                        customItem(weight = 3f, color = MaterialTheme.colors.secondary)
                        customItem(weight = 1f)

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
        Row(modifier = Modifier.fillMaxSize().height(500.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            customItem(weight = 3f, color = MaterialTheme.colors.secondary)
            customItem(weight = 1f)

        }
    }
}
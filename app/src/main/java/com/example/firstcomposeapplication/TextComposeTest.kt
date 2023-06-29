package com.example.firstcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeapplication.ui.theme.FirstComposeApplicationTheme

class TextComposeTest : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        customText4()
                    }
                }
            }
        }
    }
}


@Composable
fun anotherTextCompasable() {
    Text(
        text = stringResource(id = R.string.app_name),
        modifier = Modifier
            .background(MaterialTheme.colors.primary)
            .padding(16.dp)
    )
}

@Composable
fun customText2() {
    Text(
        buildAnnotatedString {
            withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)) {
                withStyle(
                    style = SpanStyle(
                        color = Color.Red,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("A")
                }
                append("B")
                append("C")
                append("D")
                append("E")
            }
        }, modifier = Modifier.width(200.dp)
    )
}


@Composable
fun customText3() {
    Text(text = "Hello world".repeat(20), maxLines = 2, overflow = TextOverflow.Ellipsis)
}


@Composable
fun customText() {
    Text(
        text = stringResource(id = R.string.app_name),
        modifier = Modifier
            .background(MaterialTheme.colors.primary)
            .padding(16.dp),
        color = Color.White,
        fontSize = MaterialTheme.typography.h6.fontSize,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        textAlign = TextAlign.End

    )
}

@Composable
fun customText4() {
    SelectionContainer(){
        Column() {
            Text(text = "Hello World")
            DisableSelection {
                Text(text = "Cant Select")
            }
            Text(text = "Hello World selectable ")
            Text(text = "Hello World")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    FirstComposeApplicationTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            customText4()
        }
    }
}
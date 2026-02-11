package com.startseva.android_lab_5_startseva

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}
@Composable
fun TitleBlock() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row() {
            Text(
                text = "Пример Compose-приложения",
                color = Color.Black,
                fontSize = 20.sp
            )

        }
        Row() {
            Text(
                text = "Row, Column, Size, ARGB",
                color = Color.Black,
                fontSize = 20.sp
            )
        }
        Row(
            modifier = Modifier
                .padding(top = 100.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ColorBox(Color(0xFFFF0000))
            Spacer(modifier = Modifier.width(16.dp))
            ColorBox(Color(0xFF00FF00))
            Spacer(modifier = Modifier.width(16.dp))
            ColorBox(Color(0xFF0000FF))
        }
        Row(modifier = Modifier
            .padding(top = 100.dp, start = 20.dp, end = 20.dp)
            .background(Color.LightGray)
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 8.dp, bottom = 8.dp, start = 8.dp)
            ) {
                Text(text = "Левая колонка\nТекст 1")
            }
            Spacer(modifier = Modifier.width(120.dp))
            Column(
                modifier = Modifier
                    .padding(top = 8.dp, bottom = 8.dp)
            ) {
                Text(text = "Правая колонка\nТекст 2",
                        textAlign = TextAlign.End)
            }
        }
    }
}
@Composable
fun MainScreen() {
    TitleBlock()
}
@Composable
fun ColorRow() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ColorBox(Color(0xFFFF0000))
        ColorBox(Color(0xFF00FF00))
        ColorBox(Color(0xFF0000FF))
    }
}
@Composable
fun ColorBox(color: Color) {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(color)
    )
}
@Composable
fun CombinedBlock() {

}
//Scaffold(
//                topBar = {
//                    TopAppBar(
//                        title = { Text(text = "Scaffold example") }
//                    )
//                },
//                floatingActionButton = {
//                    FloatingActionButton(onClick = { }) {
//                        Text(text = "+")
//                    }
//                }
//            ) { paddingValues ->
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(paddingValues),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(text = "Основное содержимое экрана")
//                }
//            }
//Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.White)
//                    .padding(16.dp),
//                verticalArrangement = Arrangement.SpaceEvenly,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Box(
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color(0xFFFF0000))
//                )
//                Box(
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color(0x80FF0000))
//                )
//val symbols = "Hello world!".filter { it.isLetter() }
//Column(
//modifier = Modifier
//.fillMaxSize()
//.padding(8.dp)
//.background(color = Color.Green),
//horizontalAlignment = Alignment.CenterHorizontally,
//verticalArrangement = Arrangement.SpaceEvenly
//) {
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceEvenly
//    ) {
//        for (char in symbols) {
//            Text(
//                text = char.toString(),
//                fontWeight = FontWeight.ExtraBold,
//                color = Color.Blue,
//                fontSize = 20.sp,
//                letterSpacing = 24.sp
//            )
//        }
//    }
//    Spacer(modifier = Modifier.height(16.dp))
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceEvenly
//    ) {
//        for (char in symbols.reversed()) {
//            Text(
//                text = char.toString(),
//                fontWeight = FontWeight.ExtraBold,
//                color = Color.Red,
//                fontSize = 20.sp,
//                letterSpacing = 24.sp
//            )
//        }
//    }
//}

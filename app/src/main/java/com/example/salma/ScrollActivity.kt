package com.example.salma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.salma.ui.theme.SalmaTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cardDemo()

        }
    }
}

@Composable
fun cardDemo(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)) {
        Text(
            text = "Dashboard",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
           Card(modifier = Modifier
               .size(200.dp,)
               .padding(10.dp)){
               Column(modifier = Modifier.padding(10.dp)) {
                   Image(painter = painterResource(id = R.drawable.img_2),
                       contentDescription = "", modifier = Modifier.size(100.dp))
                   Text(text = "German Shepherd",
                       fontSize = 20.sp,
                       color = Color.Black,
                       fontWeight = FontWeight.Bold)
               }

           }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp,)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Chihuahua",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp,)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(20.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_5),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Bulldog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }


        }
    }

}


@Preview(showBackground = true)
@Composable
fun cardDemoPreview(){
    cardDemo()
}
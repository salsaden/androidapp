package com.example.salma

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cardDemo(){

    val mContext= LocalContext.current

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        
        //TopAppBar
        TopAppBar(title = { Text(text = "Homepage", color = Color.Blue, fontSize = 25.sp, fontWeight = FontWeight.Bold)},
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = {  mContext.startActivity(Intent(mContext,ImageActivity::class.java))}) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription ="arrowback")
                }

            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Share, contentDescription = "share")
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Settings, contentDescription = "settings")
                }
            }
        )
        
        Text(
            text = "Dashboard",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start = 100.dp))

        Text(text = "Types of Dogs",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)

        //Row 1
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
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp,)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(20.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_28),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Siberian Husky",
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
                    Image(painter = painterResource(id = R.drawable.img_29),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Basenji",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }


        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Social Media Platforms",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row 2
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Card(modifier = Modifier
                .size(200.dp,)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_12),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Whatsapp",
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
                    Image(painter = painterResource(id = R.drawable.img_11),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Twitter",
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
                    Image(painter = painterResource(id = R.drawable.img_9),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Facebook",
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
                    Image(painter = painterResource(id = R.drawable.img_30),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Instagram",
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
                    Image(painter = painterResource(id = R.drawable.img_10),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Tiktok",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }


        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Swahili Dishes",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row 3
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Card(modifier = Modifier
                .size(200.dp,)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_17),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Biriyani",
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
                    Image(painter = painterResource(id = R.drawable.img_16),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Mahamri",
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
                    Image(painter = painterResource(id = R.drawable.img_15),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Samaki ya Kupaka",
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
                    Image(painter = painterResource(id = R.drawable.img_14),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Mbaazi",
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
                    Image(painter = painterResource(id = R.drawable.img_13),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Pilau",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }


        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Music Instruments",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row 4
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Card(modifier = Modifier
                .size(200.dp,)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_21),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Guitar",
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
                    Image(painter = painterResource(id = R.drawable.img_22),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Saxaphone",
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
                    Image(painter = painterResource(id = R.drawable.img_20),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Flute",
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
                    Image(painter = painterResource(id = R.drawable.img_19),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Trumpet",
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
                    Image(painter = painterResource(id = R.drawable.img_18),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Xylophone",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }


        }
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Types of Cats",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)

        //Row 5
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Card(modifier = Modifier
                .size(200.dp,)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_23),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Siamese",
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
                    Image(painter = painterResource(id = R.drawable.img_24),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Persian Cat",
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
                    Image(painter = painterResource(id = R.drawable.img_25),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Ragdoll",
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
                    Image(painter = painterResource(id = R.drawable.img_26),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Sphynx",
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
                    Image(painter = painterResource(id = R.drawable.img_27),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Scottish Fold",
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
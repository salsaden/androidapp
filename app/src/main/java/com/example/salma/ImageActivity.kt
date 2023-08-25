package com.example.salma

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.salma.ui.theme.SalmaTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           myimage()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun myimage() {

    val mContext= LocalContext.current

    Column(modifier = Modifier
        .fillMaxSize()) {
        //TopAppBar
        TopAppBar(title = { Text(text = "About", color = Color.Blue, fontSize = 25.sp, fontWeight = FontWeight.Bold)},
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = {  mContext.startActivity(Intent(mContext,MainActivity::class.java))}) {
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
            text = "BREEDS OF DOGS",
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
            modifier = Modifier.padding(start = 50.dp),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))

        //First row
        Row {
            Image(
                painter = painterResource(id = R.drawable.img_2),
                contentDescription = "bulldog",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )

            Column() {
                Text(text = "German Shepherd", fontSize = 20.sp)
                Text(text = "A dog is a Domestic Animal. Most people have dogs as pets")

            }

        }
        Spacer(modifier = Modifier.height(10.dp))

        // Second row
        Row {
            Image(
                painter = painterResource(id = R.drawable.img_6),
                contentDescription = "bulldog",
                modifier = Modifier
                    .size(width = 200.dp, height = 150.dp)
                    .clip(shape = CircleShape)
                    .padding(10.dp),
                contentScale = ContentScale.Crop
            )

            Column() {
                Text(text = "BullDog", fontSize = 20.sp)
                Text(text = "A dog is a Domestic Animal. Most people have dogs as pets")

            }
        }
        Spacer(modifier = Modifier.height(10.dp))

        //Third row
        Row {
            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = "bulldog",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )

            Column() {
                Text(text = "Chihuahua", fontSize = 20.sp)
                Text(text = "A dog is a Domestic Animal. Most people have dogs as pets")

            }

        }

        Spacer(modifier = Modifier.height(10.dp))
        
        //Circular image
        Image(painter = painterResource(id = R.drawable.img),
            contentDescription = "image",
            modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape),
        contentScale = ContentScale.Crop)
        
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = {
            mContext.startActivity(Intent(mContext,ScrollActivity::class.java))
        },
            shape = CutCornerShape(5.dp),
            modifier = Modifier.padding(start = 150.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "Next")
        }
        
        

      

    }
}

@Preview(showBackground = true)
@Composable
fun myimagePreview(){
    myimage()
}
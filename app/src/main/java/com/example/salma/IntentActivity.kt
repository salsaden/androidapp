package com.example.salma

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.salma.ui.theme.SalmaTheme

class IntentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myIntent()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun myIntent(){
    val mContext = LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.img_33),
            contentScale = ContentScale.FillBounds
        )) {

        //TopAppBar
        TopAppBar(title = { Text(text = "Intent", color = Color.Black, fontSize = 25.sp, fontWeight = FontWeight.Bold)},
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
        Spacer(modifier = Modifier.height(15.dp))
        //STK
        OutlinedButton(onClick = {
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "PAY VIA MPESA",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(15.dp))
        //EMAIL
        OutlinedButton(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("abaaysalmo@gmail.com"))
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email")
            mContext.startActivity(shareIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "EMAIL",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(15.dp))
        //CALL
        OutlinedButton(onClick = {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data="tel:0724356242".toUri()
            mContext.startActivity(callIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "CALL",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(15.dp))
        //SHARE
        OutlinedButton(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is our company")
            mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "SHARE",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(15.dp))
        //SMS
        OutlinedButton(onClick = {
            val smsIntent = Intent(Intent.ACTION_SENDTO)
            smsIntent.data="smsto:0724356242".toUri()
            smsIntent.putExtra("sms_body", "Hello Adey, how has your day been?")
            mContext.startActivity(smsIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "SMS",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(15.dp))
        //CAMERA
        OutlinedButton(onClick = {
            val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                mContext.startActivity(cameraIntent)
            }else{
                println("Camera app is not available")
            }
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "CAMERA",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(15.dp))
        //SETTINGS
        OutlinedButton(onClick = {
            val settingsIntent=Intent(Settings.ACTION_SETTINGS)
            mContext.startActivity(settingsIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "SETTINGS",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
        }

    }

}


@Preview(showBackground = true)
@Composable
fun myIntentPreview(){
    myIntent()
}

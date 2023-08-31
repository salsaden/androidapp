package com.example.salma

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
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
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.salma.ui.theme.SalmaTheme

class FormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myForm()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun myForm(){

    val mContext= LocalContext.current
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var phonenumber by remember { mutableStateOf("") }



    Column(modifier = Modifier.fillMaxSize()) {

        //TopAppBar
        TopAppBar(title = { Text(text = "Form", color = Color.Black, fontSize = 25.sp, fontWeight = FontWeight.Bold)},
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = {  mContext.startActivity(Intent(mContext,ScrollActivity::class.java))}) {
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
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Create a new account",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
            modifier = Modifier.padding(30.dp)
        )
       Spacer(modifier = Modifier.height(10.dp))
//        Box(modifier = Modifier.fillMaxWidth(),
//            contentAlignment = Alignment.Center) {
//            Image(painter = painterResource(id = R.drawable.img_32),
//                contentDescription = "",
//                modifier = Modifier.size(100.dp))
//
//        }
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.animation_llyubp7a))
        val progress by animateLottieCompositionAsState(composition)
        Box(modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center) {

        LottieAnimation(composition,progress, modifier = Modifier.size(100.dp))}

            //Name
            TextField(
                value = name,
                onValueChange = { name = it },
                modifier = Modifier
                    .size(width = 350.dp, height = 50.dp)
                    .padding(start = 10.dp),
                label = { Text(text = "Name", fontWeight = FontWeight.Bold) },
                placeholder = { Text(text = "Enter your name") },
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
                trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )
            //Email
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .size(width = 350.dp, height = 50.dp)
                    .padding(start = 10.dp),
                label = { Text(text = "Email", fontWeight = FontWeight.Bold) },
                placeholder = { Text(text = "Enter your email") },
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )
            //Password
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .size(width = 350.dp, height = 50.dp)
                    .padding(start = 10.dp),
                label = { Text(text = "Password", fontWeight = FontWeight.Bold) },
                placeholder = { Text(text = "Type your password") },
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()
            )
            //Phonumber
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                value = phonenumber,
                onValueChange = { phonenumber = it },
                modifier = Modifier
                    .size(width = 350.dp, height = 50.dp)
                    .padding(start = 10.dp),
                label = { Text(text = "Contact", fontWeight = FontWeight.Bold) },
                placeholder = { Text(text = "Enter your phonenumber") },
                leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(width = 350.dp, height = 50.dp)
                    .padding(start = 10.dp),
                shape = CutCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Cyan)
            ) {

                Text(
                    text = "Register",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Already have an account?  Login",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color.Blue,
                modifier = Modifier.padding(50.dp)
            )


    }

}


@Preview(showBackground = true)
@Composable
fun myFormPreview(){
    myForm()
}


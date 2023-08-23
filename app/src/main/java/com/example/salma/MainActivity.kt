package com.example.salma

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.salma.ui.theme.SalmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            demo()

        }
    }
}

@Composable
fun demo() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Hello World",
            color = Color.Black,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic, textDecoration = TextDecoration.Underline,
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "I am Android Developer", color = Color.Green,
            fontSize = 30.sp,
            fontStyle = FontStyle.Normal, textDecoration = TextDecoration.LineThrough,
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "This is my first app",
            color = Color.Blue,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic, textDecoration = TextDecoration.None,
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Welcome All",
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Normal, textDecoration = TextDecoration.Underline,
        )
        Spacer(modifier = Modifier.height(30.dp))

        Row(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "first",
                color = Color.Black,
                fontSize = 30.sp,
                fontStyle = FontStyle.Italic, textDecoration = TextDecoration.Underline,
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "Hello", color = Color.Green,
                fontSize = 30.sp,
                fontStyle = FontStyle.Normal, textDecoration = TextDecoration.LineThrough,
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "App",
                color = Color.Blue,
                fontSize = 30.sp,
                fontStyle = FontStyle.Italic, textDecoration = TextDecoration.None,
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "Welcome",
                color = Color.Red,
                fontSize = 30.sp,
                fontStyle = FontStyle.Normal,
                fontFamily = FontFamily.SansSerif,
                textDecoration = TextDecoration.Underline,
            )
        }
        Button(
            onClick = { /*TODO*/ },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color.Magenta)
        ) {
            Text(text = "Click Me")

        }

        Button(
            onClick = { /*TODO*/ },
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Yellow)
        ) {

            Image(painter = painterResource(id = R.drawable.img_7), contentDescription = "")
            Text(
                text = "Add to Cart",
                modifier = Modifier.padding(start = 10.dp)
            )

        }

        Button(onClick = { /*TODO*/ }, shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.Blue),
            colors = ButtonDefaults.outlinedButtonColors())
        {
            Text(text = "Bordered button")
        }


    }

}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    demo()
}

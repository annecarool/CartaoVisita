package com.example.anne

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.anne.ui.theme.AnneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(244,91,195)
                ) {
                    PlanoDeFundo()
                }
            }
        }
    }
}

@Composable
fun PlanoDeFundo() {
    Image(
        painter = painterResource(id = R.drawable.fundocobra),
        contentDescription = null,
        contentScale = ContentScale.Crop,
    )
    Cabecalho()
    Rodape()
}

@Composable
fun Rodape() {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        Contato(
            painter = painterResource(id = R.drawable.localcontato),
            text = "São Paulo, Brazil")

        Contato(
            painter = painterResource(id = R.drawable.instagramcontato),
            text = "@annecarolzz")

        Contato(
            painter = painterResource(id = R.drawable.sitecontato),
            text = "design.com")

    }
}

@Composable
fun Contato(painter: Painter, text: String) {

    Divider(
        color = Color.White,
        modifier = Modifier
            .fillMaxWidth()
            .height(0.2.dp)
    )

    Row(
        modifier = Modifier
            .padding
                (top = 15.dp, start = 90.dp)

    ) {
        Image(
            painter = painter ,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(35.dp)
                .border(
                    width = (1.dp),
                    color = Color(255, 255, 255),
                    CircleShape
                )
                .clip(CircleShape)
        )

        Text(
            text = text,
            fontSize = 18.sp,
            color = Color(255,255,255),
            fontWeight = FontWeight.Light,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start = 10.dp)
        )

    }

}

@Composable
fun Cabecalho() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 150.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.perfilanne),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(180.dp)
                .border(
                    width = (3.dp),
                    color = Color(255, 255, 255,),
                    CircleShape
                )
                .clip(CircleShape)
                )

        Text(
            text = stringResource(R.string.name),
            fontSize = 50.sp,
            color = Color(255,255,255),
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Black
        )

        Text(
            text = "Designer",

            fontSize = 20.sp,
            color = Color(255,255,255),
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.SansSerif
        )
    }
}


        
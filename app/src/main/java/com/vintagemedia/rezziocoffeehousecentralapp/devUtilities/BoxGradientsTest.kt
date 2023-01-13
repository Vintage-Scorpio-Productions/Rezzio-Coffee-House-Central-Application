package com.vintagemedia.rezziocoffeehousecentralapp.devUtilities

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vintagemedia.rezziocoffeehousecentralapp.ui.theme.*

@Composable
fun GradientsTest1() {
    Box(
        modifier = Modifier
            .height(900.dp)
            .width(1280.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF3C2E2E),
                        Color(0xFF292828)
                    )
                )

            )
    ) {

    }
}

@Composable
fun GradientsTest2() {
    Box(
        modifier = Modifier
            .height(900.dp)
            .width(1280.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF3D2C2C),
                        Color(0xFF5A5555)
                    )
                )

            )
    ) {

    }
}

@Composable
fun GradientsTest3() {
    Box(
        modifier = Modifier
            .height(900.dp)
            .width(1280.dp)
            .background(Color(0xFF3D2C2C))
//            .background(
//                brush = Brush.verticalGradient(
//                    colors = listOf(
//                        Color(0xFF7B4321),
//                        Color(0xFFEFE1B2)
//                    )
//                )
//
//            )
    ) {

    }
}

@Composable
fun GradientsTest4() {
    Box(
        modifier = Modifier
            .height(900.dp)
            .width(1280.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF04060C),
                        Color(0xFF4A425A)
                    )
                )

            )
    ) {

    }
}

@Composable
fun RadialGradTest1(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .height(4039.dp)
            .width(2629.dp)
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(
                        Color(0xffa06000),
                        Color(0xff2f1c00)
                    ),
                    center = Offset(600f, 1200f),
                    radius = 1400f
                )
            )
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
        modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Placeholder 1",
                color = Color.White,
                fontSize = 45.sp,
                fontFamily = abrilFont
                )

            Spacer(
                modifier = Modifier
                    .height(10.dp))

            Text(
                text = "Placeholder 2",
                color = Color.Black,
                fontSize = 45.sp,
                fontFamily = limeLight
            )

            Spacer(
                modifier = Modifier
                    .height(10.dp))

            Text(
                text = "Placeholder 3",
                color = Color(0xFFB9CEFF),
                fontSize = 45.sp,
                fontFamily = lobster2
            )

            Spacer(
                modifier = Modifier
                    .height(10.dp))

            Text(
                text = "Placeholder 4",
                color = Color(0xFFB9FFD5),
                fontSize = 45.sp,
                fontFamily = fjalla
            )

            Spacer(
                modifier = Modifier
                    .height(10.dp))

            ElevatedButton(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Green),
                elevation = ButtonDefaults.buttonElevation(15.dp),
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp)
                    .shadow(
                        15.dp,
                        shape = RoundedCornerShape(25.dp),
                        ambientColor = DefaultShadowColor,
                        spotColor = DefaultShadowColor)


            ) {
                Text(text = "Button 1")
            }

            Spacer(
            modifier = Modifier
                .height(10.dp))

            ElevatedButton(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Black),
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp)

            ) {
                Text(
                    text = "Button 2",
                    color = Color.White
                    )
            }

            Spacer(
                modifier = Modifier
                    .height(10.dp))

            ElevatedButton(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color(0xFFB9CEFF)),
                modifier = Modifier
                    .width(150.dp)
                    .height(50.dp)

            ) {
                Text(text = "Button 3")
            }

            Spacer(
                modifier = Modifier
                    .height(10.dp))

            ElevatedButton(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color(0xFFB9FFD5)),
                modifier = Modifier
                    .width(150.dp)
                    .height(50.dp)

            ) {
                Text(text = "Button 4")
            }

        }

    }
}

@Composable
fun LinearGradientsTest1() {
    Box(
        modifier = Modifier
            .height(2629.dp)
            .width(4039.dp)
            .background(
                brush = Brush.linearGradient(
                    0f to Color(0xff2f1c00),
                    1f to Color(0xff714400),
                    start = Offset(0f, 0f), // top left corner
                    end = Offset(2629f, 4152.5f) // bottom right corner
                )

            )
    ) {

    }
}

@Preview
@Composable
fun GradientsPreview() {
    RezzioCoffeeHouseCentralAppTheme {
        RadialGradTest1()
    }
}

@Preview(device = "spec:width=411dp,height=891dp,dpi=640",showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun GradientsPreview2() {
    RezzioCoffeeHouseCentralAppTheme {
        GradientsTest2()
    }
}

@Preview(device = "spec:width=411dp,height=891dp,dpi=640", showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun GradientsPreview3() {
    RezzioCoffeeHouseCentralAppTheme {
        GradientsTest3()
    }
}

@Preview(device = "spec:width=411dp,height=891dp,dpi=640", showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun GradientsPreview4() {
    RezzioCoffeeHouseCentralAppTheme {
        GradientsTest4()
    }
}


package com.vintagemedia.rezziocoffeehousecentralapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.vintagemedia.rezziocoffeehousecentralapp.R.font

val abrilFont = FontFamily(Font(font.abril_fatface))
val limeLight = FontFamily(Font(font.limelight))
val lobster2 = FontFamily(
    Font(font.lobster_two),
    Font(font.lobster_two_bold, FontWeight.Bold),
    Font(font.lobster_two_italic, FontWeight.Normal, FontStyle.Italic),
    Font(font.lobster_two_bold_italic, FontWeight.Bold, FontStyle.Italic)
    )
val fjalla = FontFamily(Font(font.fjalla_one))

// Set of Material typography styles to start with
val Typography = Typography(

)


val buttonText = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.SemiBold,
    fontSize = 14.sp,
    textAlign = TextAlign.Center
)


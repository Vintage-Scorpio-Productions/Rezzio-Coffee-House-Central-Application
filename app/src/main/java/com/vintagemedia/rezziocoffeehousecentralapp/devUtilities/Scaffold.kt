package com.vintagemedia.rezziocoffeehousecentralapp.devUtilities

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vintagemedia.rezziocoffeehousecentralapp.ui.theme.RezzioCoffeeHouseCentralAppTheme
import com.vintagemedia.rezziocoffeehousecentralapp.ui.theme.abrilFont
import com.vintagemedia.rezziocoffeehousecentralapp.ui.theme.lobster2

@Composable
fun ModifierTest(modifier: Modifier = Modifier) {
    Box(modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.surface)
    ) {
        Column(
            modifier
                .width(1200.dp)
                .height(600.dp)
        ) {
            Text(
                text = "PlaceHolder",
                color = MaterialTheme.colorScheme.onSurface,
                fontFamily = lobster2,
                fontWeight = FontWeight.Normal,
                fontSize = 25.sp
            )
            Text(
                text = "PlaceHolder",
                color = MaterialTheme.colorScheme.onSurface,
                fontFamily = lobster2,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp
            )
            Text(
                text = "PlaceHolder",
                color = MaterialTheme.colorScheme.onSurface,
                fontFamily = lobster2,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Italic,
                fontSize = 25.sp
            )
            Text(
                text = "PlaceHolder",
                color = MaterialTheme.colorScheme.onSurface,
                fontFamily = lobster2,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontSize = 25.sp
            )
            Text(
                text = "Abril_Fatface",
                color = MaterialTheme.colorScheme.onSurface,
                fontFamily = abrilFont,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontSize = 25.sp
            )

        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES,
    device = "spec:width=1280dp,height=800dp,dpi=480", showSystemUi = true
)
@Preview(device = "spec:width=1280dp,height=800dp,dpi=480", showSystemUi = true)

@Composable
fun ModifierTestPreview() {
    RezzioCoffeeHouseCentralAppTheme {
        ModifierTest()
    }
}
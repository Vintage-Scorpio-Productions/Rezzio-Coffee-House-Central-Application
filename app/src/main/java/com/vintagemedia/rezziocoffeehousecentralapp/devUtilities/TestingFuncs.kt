package com.vintagemedia.rezziocoffeehousecentralapp.devUtilities

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vintagemedia.rezziocoffeehousecentralapp.ui.theme.RezzioCoffeeHouseCentralAppTheme
import com.vintagemedia.rezziocoffeehousecentralapp.ui.theme.Shapes



@Composable
fun DefaultPlaceholder() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(1.dp)
            .border(
                5.dp, MaterialTheme
                    .colorScheme.primary,
                shape = Shapes.medium)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF3D2C2C),
                        Color(0xFF5A5555)
                    )
                )
            )
        ,
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(5.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Placeholder",
                color = MaterialTheme.colorScheme.onSurface
                )
            Text(
                text = "Placeholder",
                color = MaterialTheme.colorScheme.onSurface
            )
            Text(
                text = "Placeholder",
                color = MaterialTheme.colorScheme.onSurface
            )
            ElevatedButton(
                onClick = { /*TODO*/ },
                shape = Shapes.medium,
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)
                ) {

                Text(
                    text = "Home Button",
                    style = MaterialTheme.typography.labelLarge
                )
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES,
    device = "spec:width=1280dp,height=800dp,dpi=480", showSystemUi = true
)
@Preview(device = "spec:width=1280dp,height=800dp,dpi=480", showSystemUi = true)

@Composable
fun PlaceholderPreview() {
    RezzioCoffeeHouseCentralAppTheme {
        DefaultPlaceholder()
    }
}
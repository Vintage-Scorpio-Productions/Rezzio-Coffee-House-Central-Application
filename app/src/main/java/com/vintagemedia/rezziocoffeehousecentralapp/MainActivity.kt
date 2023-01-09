package com.vintagemedia.rezziocoffeehousecentralapp

import android.app.Activity
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.vintagemedia.rezziocoffeehousecentralapp.devUtilities.DefaultPlaceholder
import com.vintagemedia.rezziocoffeehousecentralapp.ui.theme.RezzioCoffeeHouseCentralAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RezzioCoffeeHouseCentralAppTheme {
                // A surface container using the 'background' color from the theme
                    // below is for defaulting to landscape
                    val activity = (LocalContext.current as Activity)
                    activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                    // from util
                    DefaultPlaceholder()
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
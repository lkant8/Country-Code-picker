package com.mcode.countrycode

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mcode.ccp.R
import com.mcode.ccp.component.*
import com.mcode.ccp.utils.Country
import com.mcode.ccp.utils.countryList
import com.mcode.countrycode.ui.theme.MCodeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MCodeTheme() {
                Surface(color = MaterialTheme.colors.background) {
                    SampleCountryPicker()
                }
            }
        }
    }
}

@Composable
fun SampleCountryPicker() {
    Box {
        var expanded by remember { mutableStateOf(false) }
        var selectedCountry by remember { mutableStateOf<Country?>(null) }
        val focusManager = LocalFocusManager.current

        CountryPickerBottomSheet(
            title = {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    text = stringResource(R.string.select_country_text), textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            },
            expanded,
            onDismissRequest = {
                expanded = false
            },
            onItemSelected = {
                selectedCountry = it
                expanded = false
                focusManager.clearFocus()
            }
        ) {
            CountryTextField(
                label = stringResource(R.string.select_country_text),
                modifier = Modifier
                    .padding(top = 50.dp)
                    .align(Alignment.TopCenter),
                expanded = expanded,
                selectedCountry = selectedCountry,
                defaultSelectedCountry = countryList(LocalContext.current).single { it.code == "IN" }
            ) {
                expanded = !expanded
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MCodeTheme() {
        SampleCountryPicker()
    }
}
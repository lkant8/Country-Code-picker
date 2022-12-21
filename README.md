# Jetpack Compose Country Code Picker

Jetpack Compose Country Code Picker

<a href="https://www.buymeacoffee.com/mcode" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" ></a>

<h1>Updated</h1>

[![](https://jitpack.io/v/codewith-fun/Country-Code-picker.svg)](https://jitpack.io/#codewith-fun/Country-Code-picker)


If you are looking for Country Phone Code Picker for Jetpack Compose you can use the package.

* Country numbers hints
* Phone number visualTransformation (Automatic number formatting)
* Automatic country recognition (detection by sim card if sim card is inserted)
* With TextField
* Can Customize
* Added language translations
* Added clear text button
* Dialog changed

Languages:

* Turkish
* English
* Italian
* Arabic
* Russian
* Dutch




<h3> USAGE </h3>

```kotlin
@Composable
fun MCodeCountryCodePicker(
    modifier: Modifier = Modifier,
    text: String,
    onValueChange: (String) -> Unit,
    shape: Shape = RoundedCornerShape(24.dp),
    color: Color = MaterialTheme.colors.background,
    showCountryCode: Boolean = true,
    showCountryFlag: Boolean = true,
    focusedBorderColor: Color = MaterialTheme.colors.primary,
    unfocusedBorderColor: Color = MaterialTheme.colors.onSecondary,
    cursorColor: Color = MaterialTheme.colors.primary,
    bottomStyle: Boolean = false
)

```  

<h3> EXAMPLE </h3>


```kotlin

@Composable
fun CountryCodePick() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val phoneNumber = rememberSaveable { mutableStateOf("") }
        val fullPhoneNumber = rememberSaveable { mutableStateOf("") }
        val onlyPhoneNumber = rememberSaveable { mutableStateOf("") }

        MCodeCountryCodePicker(
            text = phoneNumber.value,
            onValueChange = { phoneNumber.value = it },
            unfocusedBorderColor = MaterialTheme.colors.primary,
            bottomStyle =false,
            shape = RoundedCornerShape(24.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            if (!isPhoneNumber()) {
                fullPhoneNumber.value = getFullPhoneNumber()
                onlyPhoneNumber.value = getOnlyPhoneNumber()
            } else {
                fullPhoneNumber.value = "Error"
                onlyPhoneNumber.value = "Error"
            }
        }) {
            Text(text = "Check")
        }

        Text(
            text = "Full Phone Number: ${fullPhoneNumber.value}",
            color = if (getErrorStatus()) Color.Red else Color.Green
        )

        Text(
            text = "Only Phone Number: ${onlyPhoneNumber.value}",
            color = if (getErrorStatus()) Color.Red else Color.Green
        )
    }
}

```

<h3> Functions </h3>

<b>getFullPhoneNumber()</b>  => Phone number with country code => return type <b>String</b> </br>
<b>getOnlyPhoneNumber()</b> => Phone number only => return type <b>String</b> </br>
<b>isPhoneNumber()</b> => Checks if the phone number is correct based on the country code => return type <b>Boolean</b>/</br>

## How to add in your project
<h5>To get a Git project into your build:</h5>
<h6>Step 1. Add the JitPack repository to your build file</h6>

## Gradle
<p>Add it in your root build.gradle at the end of repositories:</p>

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

```
## Step 2. 
<p>Add the dependency</p>

```
dependencies {
	        implementation 'com.github.codewith-fun:Country-Code-picker:0.1.0-beta01'
	}

```


## Maven
<p>Add it in your root build.gradle at the end of repositories:</p>

```
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
## Step 2.
<p>Add the dependency</p>

```
<dependency>
	    <groupId>com.github.codewith-fun</groupId>
	    <artifactId>Country-Code-picker</artifactId>
	    <version>0.1.0-beta01</version>
	</dependency>
```


## sbt
<p>Add it in your root build.gradle at the end of repositories:</p>

```
resolvers += "jitpack" at "https://jitpack.io"
```
## Step 2.
<p>Add the dependency</p>

```
libraryDependencies += "com.github.codewith-fun" % "Country-Code-picker" % "0.1.0-beta01"	
```


## leiningen
<p>Add it in your root build.gradle at the end of repositories:</p>

```
 :repositories [["jitpack" "https://jitpack.io"]]
```
## Step 2.
<p>Add the dependency</p>

```
	:dependencies [[com.github.codewith-fun/Country-Code-picker "0.1.0-beta01"]]	

```


## License

[Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

    Copyright (C) 2022 Codewith-fun

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


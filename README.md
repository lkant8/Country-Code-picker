# Jetpack Compose Country Code Picker

Jetpack Compose Country Code Picker

<a href="https://www.buymeacoffee.com/mcode" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" ></a>



https://github.com/mcode8/Country-Code-picker/blob/main/screenshot/Screenshot%202022-12-29%20141313.png

<h1>Updated</h1>

[![](https://jitpack.io/v/codewith-fun/Country-Code-picker.svg)](https://jitpack.io/#codewith-fun/Country-Code-picker)


If you are looking for Country Phone Code Picker for Jetpack Compose you can use the package.

* Country numbers hints
* Automatic country recognition With Local 
* With TextField
* Can Customize
* Added clear text button
* Dialog changed

Languages:

* English

<h3>Screenshot</h3>
<img src="https://github.com/mcode8/Country-Code-picker/blob/main/screenshot/ios.png" width="230">
<img src="https://github.com/mcode8/Country-Code-picker/blob/main/screenshot/Screenshot%202022-12-29%20141313.png" width="230">
https://github.com/mcode8/Country-Code-picker/blob/main/screenshot/Screenshot%202022-12-29%20141313.png
https://github.com/mcode8/Country-Code-picker/blob/main/screenshot/ios.png

<h3> USAGE </h3>

```kotlin
@Composable
 CountryTextField(
                label = stringResource(R.string.select_country_text),
                modifier = Modifier
                    .padding(top = 50.dp)
                    .align(Alignment.TopCenter),
                expanded = expanded,
                selectedCountry = selectedCountry,
                defaultSelectedCountry = countryList(LocalContext.current).single { it.code == "IN" }
            ) {
	    
	    }

```  

<h3> EXAMPLE </h3>


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
	        implementation 'com.github.codewith-fun:Country-Code-picker:0.1.1'
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
	    <version>0.1.1</version>
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
libraryDependencies += "com.github.codewith-fun" % "Country-Code-picker" % "0.1.1"	
```


## leiningen
<p>Add it in your root build.gradle at the end of repositories:</p>

```
 :repositories [["jitpack" "https://jitpack.io"]]
```
## Step 2.
<p>Add the dependency</p>

```
	:dependencies [[com.github.codewith-fun/Country-Code-picker "0.1.1"]]	

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


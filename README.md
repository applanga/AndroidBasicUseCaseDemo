# AndroidBasicUseCaseDemo
Basic Applanga Sample app the allows automatic string upload with applanga as well as showing automated screenshots.

## How To Start

* create an account on [https://dashboard.applanga.com](https://dashboard.applanga.com/#!/signup)
* add a new App
* select Android and then **Download Settings File** 
* place the downloaded applanga_settings.applanga file into your `~/AndroidBasicUseCaseDemo/BasicUseCaseDemo/app/src/main/res/raw` folder
* open the **BasicUseCaseDemo** project in [Android Studio](https://developer.android.com/studio)
* click the bug🐞 button to start the app with debugging enabled
	* you can either do this with a real device attached to your computer or launch on a virtual device
	* once the App is started wait for 10 seconds and afterwards all the base language strings should be uploaded to the Applanga dashboard
* refresh the dashboard to see if strings have been uploaded into english
* When runnign the app on device, to get passed the login screen use the username "demo@applanga.com" and the password "demo"

## Automated UI Tests

* add German (language code **DE**) to your app on the Applanga dashboard
* go into german and import the file [de_Automated Screenshots_strings.xliff](https://raw.githubusercontent.com/applanga/AndroidBasicUseCaseDemo/master/de_Automated%20Screenshots_strings.xliff)
* in Android Studio right click to **app->java->...->ExampleInstrumentedTest** and click **Run ExampleInstrumentedTest**
	* tests should now run for a few secnds and capture and upload screenshots to your project in german and english
* refresh the dashboard
* open tags on the left menu and see if screenshots have been created



 

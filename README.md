Simple Login App using Android Studio with Kotlin
This is a basic Android application built with Kotlin that demonstrates a simple login functionality. Users can enter their credentials (username and password) to log in to the app.

Features
User authentication with username and password.
Basic error handling for incorrect credentials.
Minimalistic UI design for easy understanding.
Prerequisites
Android Studio installed on your development machine.
Android device or emulator with Android API level 16 or higher.
Getting Started
Clone the repository:

bash
Copy code
git clone [https://github.com/your-username/simple-login-app.git](https://github.com/KaveeshaKaru/Simple_Loggin_App.git)
Open the project in Android Studio.

Build and run the app on an emulator or a physical Android device.

Usage
Launch the app on your Android device or emulator.

Enter your username and password.

Click the "Login" button.

If the credentials are correct, you will be redirected to the main screen; otherwise, an error message will be displayed.

Project Structure
app/src/main/java/com/example/simpleloginapp: Contains the Kotlin source code for the app.

MainActivity.kt: Main entry point for the application, handling the login functionality.
LoginActivity.kt: LoginActivity class for handling user authentication.
utils/ValidationUtils.kt: Utility class for input validation.
app/src/main/res: Contains resources such as layouts, strings, and drawables.

layout/activity_main.xml: Layout file for the main activity.
layout/activity_login.xml: Layout file for the login activity.

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

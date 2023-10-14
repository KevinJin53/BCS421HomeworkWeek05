package com.example.homeworkweek05;

public class QuestionAnswer {

    public static String question[] ={
            "What is the primary programming language used for Android app development?",
            "Which component is responsible for managing the app's user interface and responding to user interactions?",
            "Which Android version introduced the Material Design guidelines for UI and user experience?",
            "Which XML file is used to define the user interface of an Android app?",
            "What is the purpose of an Android Intent?",
            "Which component is responsible for running background tasks in Android?",
            "Which permission is required to access the device's camera in an Android app?"
    };

    public static String choices[][] = {
            {"Java","Python","C++","Samsung"},
            {"Service","Activity ","Broadcast Receiver","Content Provider"},
            {"Android 4.0 (Ice Cream Sandwich)","Android 4.0 (Lollipop)"," Android 6.0 (Marshmallow)","Android 5.0 (Lollipop)"},
            {"AndroidManifest.xml","build.gradle","res/values/strings.xml","res/layout/activity_main.xml"},
            {"To download apps from the Play Store", "To navigate between activities, start services, and deliver broadcasts", "To store data in a SQLite database", "To display notifications"},
            {"Activity", "Service", "Broadcast Receiver", "Content Provider"},
            {"INTERNET", "WRITE_EXTERNAL_STORAGE", "CAMERA", "ACCESS_FINE_LOCATION"}
    };

    public static String correctAnswers[] = {
            "Java",
            "Activity",
            "Android 5.0 (Lollipop)",
            "res/layout/activity_main.xml",
            "To navigate between activities, start services, and deliver broadcasts",
            "Service",
            "CAMERA"
    };

}
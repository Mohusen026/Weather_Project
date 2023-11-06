# Weather App

The Weather App is a mobile application that provides users with up-to-date weather information, allowing them to stay informed about the current climate worldwide. The app features an easy-to-use and intuitive interface for a seamless user experience.

## Features

### 1. Current Weather Information:
- **Temperature**: Get the current temperature at your location or a specified location.
- **Conditions**: View descriptions of the current weather conditions, such as clear, cloudy, rainy, or snowy.
- **Humidity**: Check the relative humidity percentage.
- **Wind Speed and Direction**: Access information about wind speed and direction.
- **UV Index**: Get information on UV radiation levels, essential for sun protection.

### 2. Weather Forecast:
- **Daily and Hourly Forecasts**: Receive predictions for the weather over the next few days, including high and low temperatures, precipitation, and wind conditions. Some apps may also provide hourly forecasts.
- **Extended Forecast**: Access a more extended forecast that covers the weather for a week or more.

### 3. Weather History:
- **Historical Weather Data**: Explore historical weather information, allowing users to view past weather conditions and trends.

## Installation

To use this project in your Android application, follow these steps:

1. **Generate an API Key**:
   - First, you should generate an API key for this project.
   - Visit [OpenWeatherMap](https://openweathermap.org/) and sign up to obtain your API key.
   - Your API key will look something like this: `c70834a3df52c8f2a7e20a12209h669h`.

2. **Add Dependencies**:
   - In your Android project's `build.gradle` file, add the following dependencies:
     ```gradle
     // Lottie Animations
     implementation 'com.airbnb.android:lottie:6.1.0'
     // GSON Converter
     implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
     // Retrofit
     implementation 'com.squareup.retrofit2:retrofit:2.9.0'
     ```

## Permissions

This application requires the following permission to ensure proper functionality:

- **INTERNET**: This permission is necessary for the app to access the internet and retrieve data from external sources.

Feel free to use this README template for your GitHub repository. You can customize it further and add more details as needed.

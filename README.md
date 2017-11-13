# intents-example
This example project shows how how to use intents for different actions.
The example also gives the basic understanding about implicit and explicit intents. 

## Prerequisites
- Java environment setup
- Android Studio
- Android SDK v24
- Latest Android Build Tools

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development.
This sample uses the Gradle build system.

1. Download the samples by cloning this repository or downloading an archived snapshot. (See the options at the top of the page.)
2. In Android Studio, create a new project and choose the "Import non-Android Studio project" or
  "Import Project" option.
3. Select the `intents-example` directory that you downloaded with this repository.
4. Wait for gradle to build and sync.
5. Click on the 'Run' icon. Now select an AVD(Android Virtual Device). If it doesn't exist then create one targeting latest API's(atleast v24).
6. Wait for emulator to start completely and run the application.

## Guide
There are two types of intents:
- Explicit intents specify the component to start by name (the fully-qualified class name). You'll typically use an explicit intent to 
start a component in your own app, because you know the class name of the activity or service you want to start. For example, you can 
start a new activity in response to a user action or start a service to download a file in the background.
- Implicit intents do not name a specific component, but instead declare a general action to perform, which allows a component 
from another app to handle it. For example, if you want to show the user a location on a map, you can use an implicit intent to 
request that another capable app show a specified location on a map.  
-- source: https://developer.android.com/guide/components/intents-filters.html

In short, explicit intents are user defined where we know our current component and our target component inside our own app. Generally they 
are used to open a new activity. But, in case of implicit intents we may several apps for a particular intent action therefore we create a 
'chooser' to handle this situation. And thus, we get list of matching apps for our request.   

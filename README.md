# Intents
In Android, we don’t start new Activities by instantiating them (remember, we never instantiate Activities!). 
Instead, we send the operating system a message requesting that the Activity perform a particular action (i.e., start up and display on the screen).
These messages are called Intents, and are used to communicate between app components like Activities. 
The Intent system allows Activities to communicate, even though they don’t have references to each other (we can’t just call a method on that other Activity).
After having instantiated the Intent, we can use that message to start an Activity by calling the startActivity() method (inherited from Activity), and passing it the Intent.
This method will “send” the message to the operating system, which will deliver the Intent to the appropriate Activity, telling that Activity to start
as soon as it receives the message.
And we can use the back button to go backwards!


Intents Types

-Explicit intents specify which application will satisfy the intent, by supplying either the target app's package name or a fully-qualified component class name. 
You'll typically use an explicit intent to start a component in your own app, because you know the class name of the activity or service you want to start. 
For example, you might start a new activity within your app in response to a user action, or start a service to download a file in the background.

-Implicit intents do not name a specific component, but instead declare a general action to perform, which allows a component from another app to handle it.
For example, if you want to show the user a location on a map, you can use an implicit intent to request that another capable app show a specified location on a map.


# android-theme-switcher
An android app that changes custom themes at runtime.

## Overview

The goal of this exercise is to get familiar with Android drawables, styles and themes. By the end of this exercise, you should know how to define a theme in your resources in an XML file, how to define attributes of the theme, how to apply those to your layout file, and finally how to dynamically change the theme of an activity. 

## Usage
This app is intended to be the base project on top of which new features can be added. To use it, clone the project and import it using the following steps:

![Imgur](http://i.imgur.com/x5iXb8Y.gif)

Once you have imported base app, go ahead and run it, and you should see the following output : 
  
![Imgur](http://i.imgur.com/K1MANspm.png)

Let's understand the steps involved in creating this app. And after that you will go ahead and create different themes in a similar fashion.

**1.** We created a new app called ThemeSwitcher and main activity called ThemeActivity.

**2.** Then we created a simple layout on which we'll be applying all our styles and themes to.

**3.** Created custom attributes by following [custom attributes](http://guides.codepath.com/android/Developing-Custom-Themes#3-custom-attributes) guide. These are the custom attributes that our theme will define.

**4.** Created `dimens.xml`. This is the `XML` resource that carries dimension values for padding, mergins etc. Any new values should be added to this file.

**5.** Defined custom styles for our relative layout, button, textview and spinner. Also defined drawables for various button states, background image etc. by referring [create custom styles and drawables](http://guides.codepath.com/android/Developing-Custom-Themes#5-custom-styles-and-drawables) guide.

**6.** Created themes.xml file to define the theme attributes by following [creating theme.xml file](http://guides.codepath.com/android/Developing-Custom-Themes#6-create-themesxml-file). Any new themes will be added to this file by following similar pattern.

**7.** After this, we applied the custom styles to views in our layout file. Refer [apply custom styles](http://guides.codepath.com/android/Developing-Custom-Themes#7-apply-custom-styles) guide.

**8.** Now we run the app and we get the output shown above.

**Tasks for this exercise :**

**1.** Create Multiple Themes
   - To have multiple themes, you will want to create multiple theme definitions in `themes.xml`. The exercise so far should have given you a fair idea of how to go about doing this. Try to play around with different styles and attributes and define your own themes in `themes.xml` file under the following nodes:
    ```xml
    <style name="Theme.YOUR_CUSTOM_THEME" parent="Theme.AppCompat.Light"></style>
    ```
  - Be creative when defining your own styles and choose a color palette from a site like [colour lovers](http://www.colourlovers.com/palettes/most-loved/past-month/meta?page=1).


**2.** Apply Dynamic Themes
 * Dynamically apply the selected theme at runtime. This is done by calling `setTheme()` in the activity's `onCreate()` method, before any call to `setContentView()`. To change the theme, you simply need to restart your activity.
 * Note : if you have single theme only that can be applied to whole application or activity in AndroidManifest.xml
 * Hint: Refer [apply dynamic themes](http://guides.codepath.com/android/Developing-Custom-Themes#8-apply-dynamic-themes) guide.

**3.** Test your app
 * Finally, run your app and switch between the three themes you created in this exercise. Hopefully you have a better understanding of drawables, styles and themes by now.

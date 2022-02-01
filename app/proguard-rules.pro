# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

#@keep ->> anotacón que se pone antes del nombre de la clase para evitar que sea ofuscada
#-keep class com.example.examplemvvm.data.model.QuoteModel # --> clase en espesifico
#-keep class com.example.examplemvvm.data.model.* # --> paquete completo
#-keep class com.example.examplemvvm.data.model.* {} # --> lo que va adentro del parentesis no se ofusca y el resto si
-keep class com.example.examplemvvm.data.model.* {*;} # --> el .; indica que no se ofuscaran todas la clases y metodos de ese paquete
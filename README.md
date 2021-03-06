# Hello Android Studio

## Project `hello-android-studio`

- gradle-2.8
- gradle-experimental:0.4.0
  - Android Tools > New Build System > [Experimental Plugin User Guide](http://tools.android.com/tech-docs/new-build-system/gradle-experimental)

## Module `hello-java-library`

- JDK 1.7
  - [New features in Java 7](http://stackoverflow.com/questions/213958/new-features-in-java-7/6640059#6640059)

## Module `hello-android-library`

## Module `hello-jni`

Set NDK path

- Edit **local.properties** file: *ndk.dir=\<path-to-ndk\>*

Generate jni header

    $ cd hello-jni/src/main/java
    $ javah -jni com.sclee.android.hellojni.HelloJni
    $ mv com_sclee_android_hellojni_HelloJni.h hello-jni/src/main/hello_jni.h

Some useful gradle ndk setting

```gradle
android.ndk {
  moduleName = "my-lib"
  stl = "stlport_static"

  cppFlags.add("-DMY_DEFINE")
  cppFlags.add("-I${file('src/main/jni/my/include')}".toString())

  ldFlags.add("-L${file('src/main/jni/my/lib')}".toString())
  ldLibs.add("my-util")
  ldLibs.add("log")
}

android.productFlavors {
  create("arm7") {
    ndk.abiFilters.add("armeabi-v7a")
  }
}
```

References

- [Android NDK samples](https://github.com/googlesamples/android-ndk)

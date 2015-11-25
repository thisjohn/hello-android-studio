#include "hello_jni.h"

JNIEXPORT jstring JNICALL Java_com_sclee_android_hellojni_HelloJni_helloFromNative(JNIEnv *j_env, jobject j_obj) {
    return j_env->NewStringUTF("Hello from native");
}

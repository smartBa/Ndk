//
// Created by hasee on 2017/6/30.
//

#include <stdio.h>
#include <stdlib.h>
#include <jni.h>
jstring Java_c_newndk_JNI_sayHello(JNIEnv* env,jobject jobj){
   char * text ="I am a student";
    return  (*env)->NewStringUTF(env,text);
}
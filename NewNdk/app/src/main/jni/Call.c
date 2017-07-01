//
// Created by hasee on 2017/7/1.
//
#include <c_newndk_JavaCall.h>
#include <string.h>

jint Java_c_newndk_JavaCall_add(JNIEnv * env, jobject jobject, jint ji, jint jj){
    return ji+jj;
}


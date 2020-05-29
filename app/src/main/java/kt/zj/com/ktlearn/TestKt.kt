package kt.zj.com.ktlearn

import kotlin.reflect.KClass


fun main(args : Array<String>){
    testClass(javaMain::class.java)
    testClass(KotlinMain::class)

    println(javaMain.`in`);
}


fun testClass(clazz :Class<javaMain>){
    println(clazz.simpleName);
}

fun testClass(clazz :KClass<KotlinMain>){
    println(clazz.simpleName);
}
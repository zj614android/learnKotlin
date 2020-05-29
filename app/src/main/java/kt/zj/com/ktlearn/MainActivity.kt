package kt.zj.com.ktlearn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age: Int = 18;
        val name: String = "lucy";

        who(name,age);

    }

    fun who(name :String,age :Int){
//
//        println(name + "_________" + age);
        println("$name" + "_________" + "$age" );

    }

//    Utilskt.sayHello();


}

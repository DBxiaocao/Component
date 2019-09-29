package me.xiaocao.model_main

import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_main.*
import me.xiaocao.library_common.RoutingHelper
import me.xiaocao.library_common.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnModelA.setOnClickListener {
            ARouter.getInstance().build(RoutingHelper.MODEL_A).navigation()
        }
        btnModelB.setOnClickListener {
            ARouter.getInstance().build(RoutingHelper.MODEL_B).navigation()
        }
        btnModelC.setOnClickListener {
            ARouter.getInstance().build(RoutingHelper.MODEL_C).navigation()
        }
    }
}

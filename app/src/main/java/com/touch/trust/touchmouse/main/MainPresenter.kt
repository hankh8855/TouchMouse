package com.touch.trust.touchmouse.main

import com.google.common.base.Preconditions.checkNotNull
/**
 * Created by Han on 2017-04-01.
 */

class MainPresenter(mainView: MainContract.View) : MainContract.Presenter {
    private val mMainView: MainContract.View

    init {
        mMainView = checkNotNull(mainView, "mainView cannot be null")
        mMainView.setPresenter(this)
    }

    override fun samplePresenterMethod(s: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun start() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}

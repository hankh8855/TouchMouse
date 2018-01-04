package com.touch.trust.touchmouse.main

import com.touch.trust.touchmouse.BasePresenter
import com.touch.trust.touchmouse.BaseView

/**
 * Created by Han on 2017-04-01.
 */

interface MainContract {

    interface View : BaseView<Presenter> {

        fun sampleFragmentMehtod(s: Int)

    }

    interface Presenter : BasePresenter {


        fun samplePresenterMethod(s: Int)

    }

}

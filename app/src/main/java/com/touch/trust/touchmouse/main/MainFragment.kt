package com.touch.trust.touchmouse.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import java.util.*

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * // * [MainFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment(), MainContract.View {
    private var mPresenter: MainContract.Presenter? = null

    override fun setPresenter(presenter: MainContract.Presenter) {
        mPresenter = checkNotNull(presenter)
    }

    override fun sampleFragmentMehtod(s: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        //자바의 static과 같은 기능을 하도록 해줌
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * //     * @param param1 Parameter 1.
         * //     * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragment.
         */
        // TODO: Rename and change types and number of parameters
        //    public static MainFragment newInstance(String param1, String param2) {
        //        MainFragment fragment = new MainFragment();
        //        Bundle args = new Bundle();
        //        args.putString(ARG_PARAM1, param1);
        //        args.putString(ARG_PARAM2, param2);
        //        fragment.setArguments(args);
        //        return fragment;
        //    }

        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

}// Required empty public constructor

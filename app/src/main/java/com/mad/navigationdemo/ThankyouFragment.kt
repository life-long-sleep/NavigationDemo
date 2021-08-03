package com.mad.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ThankyouFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_thankyou, container, false)
        val tvScore: TextView = view.findViewById(R.id.tvScore)
        val tvPercentage: TextView = view.findViewById(R.id.tvPercentage)

        //safe args
        val args = ThankyouFragmentArgs.fromBundle(requireArguments())
        tvPercentage.text = "Your score : " + String.format("%.2f", args.percentage) + "%"
        tvScore.text = "Your score: " + args.score
        return view
    }


}
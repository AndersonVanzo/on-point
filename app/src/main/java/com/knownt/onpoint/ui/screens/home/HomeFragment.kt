package com.knownt.onpoint.ui.screens.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.knownt.onpoint.R
import com.knownt.onpoint.ui.theme.OnPointTheme

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)

        rootView.findViewById<ComposeView>(R.id.home_compose_view).apply {
            setContent {
                OnPointTheme {
                    HomeView()
                }
            }
        }

        return rootView
    }
}
package com.example.newsdekho.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.newsdekho.R;
import com.example.newsdekho.WebViewController;
import com.example.newsdekho.databinding.FragmentSlideshowBinding;
import com.example.newsdekho.ui.bbc.HomeViewModel;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;
    private SlideshowViewModel slideshowViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        WebView webView = root.findViewById(R.id.WebViewCNN);
        webView.loadUrl("https://www.CNN.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }
}
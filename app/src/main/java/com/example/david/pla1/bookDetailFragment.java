package com.example.david.pla1;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.david.pla1.helper.DownloadImageFromInternet;
import com.example.david.pla1.model.BookItem;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * A fragment representing a single book detail screen.
 * This fragment is either contained in a {@link bookListActivity}
 * in two-pane mode (on tablets) or a {@link bookDetailActivity}
 * on handsets.
 */
public class bookDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private BookItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public bookDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = bookContent.ITEM_MAP.get(getArguments().getInt(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.getTitle());
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.book_detail, container, false);

        // Show the book content as text in a TextView.
        if (mItem != null) {
            new DownloadImageFromInternet((ImageView) rootView.findViewById(R.id.cover)).execute(mItem.getImageURL());
            ((TextView) rootView.findViewById(R.id.author)).setText(mItem.getAuthor());
            ((TextView) rootView.findViewById(R.id.date)).setText(android.text.format.DateFormat.format("dd/MM/yyyy", mItem.getPublication()));
            ((TextView) rootView.findViewById(R.id.description)).setText(mItem.getDescription());
        }

        return rootView;
    }
}

package devarthur.com.lifetips;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment; //Suport older versions of fragment in older devices
import android.widget.TextView;


public class QuoteFragment extends Fragment {



    public QuoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View quoteView = inflater.inflate(R.layout.fragment_quote, container, false);

        TextView quoteText = quoteView.findViewById(R.id.quoteText);
        TextView authorName = quoteView.findViewById(R.id.author);
        CardView cardview = quoteView.findViewById(R.id.cardview);

        String quote = getArguments().getString("quote");
        String author = getArguments().getString("author");

        quoteText.setText(quote);
        authorName.setText("-" +  author);

        return quoteView;
    }

    public static final QuoteFragment newInstance(String quote, String author){
        QuoteFragment fragment = new QuoteFragment();
        Bundle bundle = new Bundle();
        bundle.putString("quote", quote);
        bundle.putString("author", author);
        fragment.setArguments(bundle);


        return fragment;

    }

}

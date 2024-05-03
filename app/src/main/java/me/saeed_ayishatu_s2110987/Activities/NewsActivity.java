package me.saeed_ayishatu_s2110987.Activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import me.saeed_ayishatu_s2110987.R;

public class NewsActivity extends AppCompatActivity {

//    private RecyclerView recyclerView;
//    private NewsAdapter adapter;
//    private List<NewsItem> newsList;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_news);
//
//        recyclerView = findViewById(R.id.recyclerViewNews);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        newsList = new ArrayList<>();
//        adapter = new NewsAdapter(newsList);
//        recyclerView.setAdapter(adapter);
//
//        // Fetch news data from an API or web scraping
//        fetchNewsData();
//    }
//
//    private void fetchNewsData() {
//        // Make an API call or perform web scraping to fetch weather news
//        // Example using an API:
//        // Call the API and handle the response
//        // Parse the response and populate the newsList
//        // Notify the adapter about the data change
//        adapter.notifyDataSetChanged();
//    }
//
//    private static class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {
//        private List<NewsItem> newsList;
//
//        public NewsAdapter(List<NewsItem> newsList) {
//            this.newsList = newsList;
//        }
//
//        @NonNull
//        @Override
//        public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//            View view = LayoutInflater.from(parent.getContext())
//                    .inflate(R.layout.item_news, parent, false);
//            return new NewsViewHolder(view);
//        }
//
//        @Override
//        public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
//            NewsItem newsItem = newsList.get(position);
//            holder.bind(newsItem);
//        }
//
//        @Override
//        public int getItemCount() {
//            return newsList.size();
//        }
//    }
//
//    private static class NewsViewHolder extends RecyclerView.ViewHolder {
//        private TextView titleTextView;
//        private TextView descriptionTextView;
//
//        public NewsViewHolder(@NonNull View itemView) {
//            super(itemView);
//            titleTextView = itemView.findViewById(R.id.titleTextView);
//            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
//        }
//
//        public void bind(NewsItem newsItem) {
//            titleTextView.setText(newsItem.getTitle());
//            descriptionTextView.setText(newsItem.getDescription());
//        }
//    }
//
//    private static class NewsItem {
//        private String title;
//        private String description;
//
//        // Getters and setters
//    }
}

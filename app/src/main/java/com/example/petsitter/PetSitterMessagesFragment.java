package com.example.petsitter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PetSitterMessagesFragment extends Fragment {

    ArrayList<MessageModel> messagesModel = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_messages, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.chatlistrecycle);
        setUpMessagesModel();
        MessagesRecyclerViewAdapter adapter = new MessagesRecyclerViewAdapter(view.getContext(), messagesModel);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;
    }

    public void setUpMessagesModel(){
        for (int i = 0; i < 1; i++) {
            messagesModel.add(new MessageModel("Alberto", "I take 20 bucks for the service"));
        }
    }
}

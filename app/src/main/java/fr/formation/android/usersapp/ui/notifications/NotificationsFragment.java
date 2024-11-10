package fr.formation.android.usersapp.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import fr.formation.android.usersapp.databinding.FragmentNotificationsBinding;
import fr.formation.android.usersapp.liste.UserAdapter;
import fr.formation.android.usersapp.model.User;

public class NotificationsFragment extends Fragment {

    private List<User> lstUser;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManger;


    public NotificationsFragment(){
        super();
        // simulation
        lstUser = Arrays.asList(
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com"),
                new User("toto","toto@@ici.com"),
                new User("tata","tata@@ici.com"),
                new User("tutu","tutu@@ici.com")
        );

    }

    private FragmentNotificationsBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        adapter = new UserAdapter(lstUser);
        recyclerView = binding.lstUsers;
                recyclerView.setHasFixedSize(true);
        layoutManger = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManger);
        recyclerView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
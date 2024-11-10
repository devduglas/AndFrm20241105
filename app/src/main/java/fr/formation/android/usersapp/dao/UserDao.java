package fr.formation.android.usersapp.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import fr.formation.android.usersapp.model.User;

@Dao
public interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(User newUser);

    @Query("SELECT * from users")
    List<User> getAllUsers();


}

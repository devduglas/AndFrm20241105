package fr.formation.android.usersapp.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import fr.formation.android.usersapp.dao.UserDao;
import fr.formation.android.usersapp.model.User;

@Database(entities = {User.class} , version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {

    public abstract UserDao userDao();

    private static volatile AppDataBase CurrentInstance=null;


    public static AppDataBase getDatabase(final Context ctx) {

        if (CurrentInstance == null) {
            synchronized (AppDataBase.class) {
                if (CurrentInstance == null) {
//                    CurrentInstance = Room.databaseBuilder(ctx.getApplicationContext(), AppDataBase.class , "user_datases").build();
                    CurrentInstance = Room.databaseBuilder(ctx.getApplicationContext(), AppDataBase.class , "user_datases").allowMainThreadQueries().build();
                }
            }
        }

        return CurrentInstance;
    }




}

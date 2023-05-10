package com.example.fourthhomeworktwounitfour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<City> cities = new ArrayList<City>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list_city);
        Adapter adapter = new Adapter(this, cities);
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData() {
        cities.add( new City("Париж", "Франция, регион Иль-де-Франс", R.drawable.paris,
                " умеренный океанический климат с теплым летом и холодной зимой, осадки " +
                        "в течение всего года", "Эйфелева башня, Нотр-Дам де Пари, Лувр, " +
                "Монмартр, Музей Орсе, собор Сакре-Кёр, Шанз-Элизе, Латинский квартал, крепость Бастилия"));
        cities.add( new City("Нью-Йорк", " США, штат Нью-Йорк", R.drawable.new_york,
                "умеренный континентальный климат с теплым летом и холодной зимой, " +
                        "осадки в течение всего года", "Статуя Свободы, Эмпайр-стейт-билдинг, " +
                "Бродвей, Таймс-сквер, Музей современного искусства, Центральный парк, Волл-стрит"));
        cities.add( new City("Токио", "Япония, о. Хонсю", R.drawable.tokyo,
                "умеренный субтропический климат с теплым летом и мягкой зимой, высокая влажность",
                "дворец Императора, Сенсодзи, Токийский башня, Цукитджи, парк Ёёги, музеи, храмы и святилища"));
        cities.add( new City("Рим", "Италия, регион Лацио", R.drawable.rome,
                "умеренный континентальный климат с теплым летом и прохладной зимой, " +
                        "низкая влажность", "Колизей, Фонтан Ди Треви, Ватикан, Пантеон, " +
                "Римский форум, Капитолийский музей, Вилла Боргезе"));
        cities.add( new City("Сидней", "Австралия, Новый Южный Уэльс", R.drawable.ydney,
                "умеренный климат с теплым летом и мягкой зимой, высокая влажность",
                "Опера Сиднея, мост Харбор, Королевские ботанические сады, Зоопарк Таронга, " +
                        "Аквариум Сиднея"));
        cities.add( new City("Санкт-Петербург", "Россия, Северо-Западный федеральный округ",
                R.drawable.saint_petersburg,
                "умеренный континентальный климат с прохладным летом и холодной зимой, сильные ветры",
                "Эрмитаж, Русский музей, дворцы Петергофа, Павловск, Царское Село, Спас на Крови"));
    }


}